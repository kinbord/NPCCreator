package com.company;

import javax.swing.*;
import java.io.IOException;

public class PCGUI {

    public PCGUI() {

        JFrame pdfFrame = makeFrame();
        pdfFrame.setLayout(null);
        pdfFrame.setVisible(true);

        JButton buttonCreateCharacter = new JButton("Make Character");
        buttonCreateCharacter.putClientProperty("JButton.buttonType", "roundRect");
        buttonCreateCharacter.setBounds(300, 420, 200, 60);
        pdfFrame.getRootPane().setDefaultButton(buttonCreateCharacter);

        buttonCreateCharacter.addActionListener(e -> {
            try {
                PDFHandling pdfhandling = new PDFHandling();
            } catch (
                    IOException ex) {
                throw new RuntimeException(ex);

            }
        });

        pdfFrame.add(buttonCreateCharacter);
    }

    private JFrame makeFrame(){
        JFrame frame = new JFrame("NPC Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        return frame;
    }
}
