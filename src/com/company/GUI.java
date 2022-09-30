package com.company;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI class
 */
public class GUI {

    /**
     * Creator of the class
     */
    public GUI() {

        setup();

        JFrame frame = makeFrame();

        JLabel title = makeLabel("NPC Creator", new Rectangle(300, 40, 200, 60), true);

        JTextField nameOfNPC = makeTextField(new Rectangle(325, 220, 300, 30), false);
        JLabel nameLabel = makeLabel("Name:", new Rectangle(nameOfNPC.getX()-300, nameOfNPC.getY(), 300, 30), false);

        JTextField raceGenderAge = makeTextField(new Rectangle(325, 260, 300, 30), false);
        JLabel raceGenderAgeLabel = makeLabel("Gender and age:", new Rectangle(raceGenderAge.getX()-300, raceGenderAge.getY(), 300, 30), false);

        JTextField occupationAlignment = makeTextField(new Rectangle(325, 300, 300, 30), false);
        JLabel occupationAlignmentLabel = makeLabel("Occupation and alignment:", new Rectangle(occupationAlignment.getX()-300, occupationAlignment.getY(), 300, 30), false);

        JTextField appearance = makeTextField(new Rectangle(325, 340, 300, 30), false);
        JLabel appearanceLabel = makeLabel("Appearance:", new Rectangle(appearance.getX()-300, appearance.getY(), 300, 30), false);

        JButton buttonCreateNPC = new JButton("Create NPC");
        buttonCreateNPC.putClientProperty("JButton.buttonType", "roundRect");
        buttonCreateNPC.setBounds(300, 120, 200, 60);
        frame.getRootPane().setDefaultButton(buttonCreateNPC);

        buttonCreateNPC.addActionListener(e -> {
            Character NPC = new Character();
            nameOfNPC.setText(NPC.getName().getFullName());
            centerText(nameOfNPC);
            raceGenderAge.setText(NPC.getGender() + " " + NPC.getAge() + " " + NPC.getRace().getRaceName());
            centerText(raceGenderAge);
            occupationAlignment.setText(NPC.getAlignment() + " " + NPC.getOccupation());
            centerText(occupationAlignment);
            appearance.setText(NPC.getAppearance());
            centerText(appearance);
        });

        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(title);
        frame.add(buttonCreateNPC);
        frame.add(nameLabel);
        frame.add(nameOfNPC);
        frame.add(raceGenderAgeLabel);
        frame.add(raceGenderAge);
        frame.add(appearanceLabel);
        frame.add(appearance);
        frame.add(occupationAlignmentLabel);
        frame.add(occupationAlignment);
    }

    private void setup(){
        FlatDarculaLaf.setup();
    }

    private JFrame makeFrame(){
        JFrame frame = new JFrame("NPC Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        return frame;
    }

    private JLabel makeLabel(String text, Rectangle bounds, boolean title){
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setBounds(bounds);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        if (title)
        {
            label.setFont(new Font(label.getFont().getName(), Font.BOLD, 30));
        }
        return label;
    }

    private JTextField makeTextField(Rectangle bounds, boolean editable){
        JTextField textField = new JTextField();
        textField.setEditable(editable);
        textField.setBounds(bounds);
        return textField;
    }

    private void centerText(JTextField textField){
        textField.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
