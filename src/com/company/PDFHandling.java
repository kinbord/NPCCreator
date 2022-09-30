package com.company;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class PDFHandling {

    public PDFHandling() throws IOException {
        File source = new File("CharacterSheet_3Pgs_ Complete.pdf");
        File copy = new File("CharacterSheet.pdf");

        FileUtils.copyFile(source, copy);

        File pdfSheet = new File("CharacterSheet.pdf");

        try {
            PDDocument pdfDocument = PDDocument.load(pdfSheet);
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            for(PDField pdField : acroForm.getFields()){
                System.out.println(pdField.getFullyQualifiedName());
            }
            PDResources resources = new PDResources();
            resources.put(COSName.getPDFName("Helv"), PDType1Font.HELVETICA);
            acroForm.setDefaultResources(resources);

            PDField characterName = acroForm.getField("CharacterName");
            acroForm.setDefaultResources(resources);
            acroForm.setNeedAppearances(true);

            characterName.setValue("Testing Mc Test");
            characterName.setReadOnly(false);

            pdfDocument.save(pdfSheet);
            pdfDocument.close();

            Desktop.getDesktop().open(pdfSheet);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
