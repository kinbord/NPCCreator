package com.company;

import javax.swing.*;
import java.awt.event.*;

public class Main {

    //Different tests such as the amount of names of different lengths
    public static void main(String[] args) {

        double trois = 0;
        double quatre = 0;
        double cinq = 0;
        double six = 0;
        double sept = 0;
        double huit = 0;
        double neuf = 0;
        double dix = 0;

        //Character test = new Character();



        for (int i = 0 ; i <= 10000 ; i++) {
            Character test = new Character();
            if (test.getName().getFirstName().length() == 3) trois = trois + 1;
            if (test.getName().getFirstName().length() == 4) quatre = quatre + 1;
            if (test.getName().getFirstName().length() == 5) cinq = cinq +1;
            if (test.getName().getFirstName().length() == 6) six = six + 1;
            if (test.getName().getFirstName().length() == 7) sept = sept + 1;
            if (test.getName().getFirstName().length() == 8) huit = huit + 1;
            if (test.getName().getFirstName().length() == 9) neuf = neuf + 1;
            if (test.getName().getFirstName().length() == 10) dix = dix + 1;
        }
        System.out.println("Names of three characters: " + trois + " ; " + trois/100 + "% of the pop.");
        System.out.println("Names of four characters: " + quatre + " ; " + quatre/100 + "% of the pop.");
        System.out.println("Names of five characters: " + cinq + " ; " + cinq/100 + "% of the pop.");
        System.out.println("Names of six characters: " + six + " ; " + six/100 + "% of the pop.");
        System.out.println("Names of seven characters: " + sept + " ; " + sept/100 + "% of the pop.");
        System.out.println("Names of eight characters: " + huit + " ; " + huit/100 + "% of the pop.");
        System.out.println("Names of nine characters: " + neuf + " ; " + neuf/100 + "% of the pop.");
        System.out.println("Names of ten characters: " + dix + " ; " + dix/100 + "% of the pop.");

        GUI();
    }

    //GUI
    public static void GUI() {
        JFrame frame = new JFrame("NPC Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JButton buttonCreateNPC = new JButton("Create NPC");
        buttonCreateNPC.setBounds(175, 120, 150, 60);
        JTextField nameOfNPC = new JTextField();
        nameOfNPC.setEditable(false);
        nameOfNPC.setBounds(175, 220, 150, 30);
        JTextField raceGenderAge = new JTextField();
        raceGenderAge.setEditable(false);
        raceGenderAge.setBounds(175, 260, 150, 30);
        JTextField occupation = new JTextField();
        occupation.setEditable(false);
        occupation.setBounds(175, 300, 150, 30);

        buttonCreateNPC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Character NPC = new Character();
                nameOfNPC.setText("Name: " + NPC.getName().getFirstName());
                raceGenderAge.setText(NPC.getGender() + " " + NPC.getAge() + " " + NPC.getRace().getRaceName());
                occupation.setText(NPC.getOccupation());
            }
        });

        frame.add(occupation);
        frame.add(raceGenderAge);
        frame.add(buttonCreateNPC);
        frame.add(nameOfNPC);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
