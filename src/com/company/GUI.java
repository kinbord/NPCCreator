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

        FlatDarculaLaf.setup();

        JFrame frame = new JFrame("NPC Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,500);

        JLabel title = new JLabel("NPC Creator");
        title.setBounds(185, 40, 200, 60);
        title.setFont(new Font(title.getFont().getName(), Font.BOLD, 30));

        JButton buttonCreateNPC = new JButton("Create NPC");
        buttonCreateNPC.putClientProperty("JButton.buttonType", "roundRect");
        buttonCreateNPC.setBounds(175, 120, 200, 60);
        frame.getRootPane().setDefaultButton(buttonCreateNPC);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name:");
        nameLabel.setBounds(138, 220, 60, 30);
        JTextField nameOfNPC = new JTextField();
        nameOfNPC.setEditable(false);
        nameOfNPC.setBounds(175, 220, 200, 30);

        JLabel raceGenderAgeLabel = new JLabel();
        raceGenderAgeLabel.setText("Gender and age:");
        raceGenderAgeLabel.setBounds(85, 260, 100, 30);
        JTextField raceGenderAge = new JTextField();
        raceGenderAge.setEditable(false);
        raceGenderAge.setBounds(175, 260, 200, 30);

        JLabel occupationAlignmentLabel = new JLabel();
        occupationAlignmentLabel.setText("Occupation and alignment:");
        occupationAlignmentLabel.setBounds(30, 300, 150, 30);
        JTextField occupationAlignment = new JTextField();
        occupationAlignment.setEditable(false);
        occupationAlignment.setBounds(175, 300, 200, 30);

        JLabel appearanceLabel = new JLabel();
        appearanceLabel.setText("Appearance:");
        appearanceLabel.setBounds(105, 340, 100, 30);
        JTextField appearance = new JTextField();
        appearance.setEditable(false);
        appearance.setBounds(175, 340, 200, 30);

        buttonCreateNPC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Character NPC = new Character();
                nameOfNPC.setText(NPC.getName().getFirstName());
                raceGenderAge.setText(NPC.getGender() + " " + NPC.getAge() + " " + NPC.getRace().getRaceName());
                occupationAlignment.setText(NPC.getAlignment() + " " + NPC.getOccupation());
                appearance.setText(NPC.getAppearance());
            }
        });

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

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
