package com.company;

import javax.swing.*;
import java.awt.*;

public class NPCGUI {

    public NPCGUI() {
        JTextField nameOfNPC = makeTextField(new Rectangle(325, 220, 300, 30), false);
        JLabel nameLabel = makeLabel("Name:", new Rectangle(nameOfNPC.getX()-300, nameOfNPC.getY(), 300, 30), false);

        JTextField raceGenderAge = makeTextField(new Rectangle(325, 260, 300, 30), false);
        JLabel raceGenderAgeLabel = makeLabel("Gender and age:", new Rectangle(raceGenderAge.getX()-300, raceGenderAge.getY(), 300, 30), false);

        JTextField occupationAlignment = makeTextField(new Rectangle(325, 300, 300, 30), false);
        JLabel occupationAlignmentLabel = makeLabel("Occupation and alignment:", new Rectangle(occupationAlignment.getX()-300, occupationAlignment.getY(), 300, 30), false);

        JTextField appearance = makeTextField(new Rectangle(325, 340, 300, 30), false);
        JLabel appearanceLabel = makeLabel("Appearance:", new Rectangle(appearance.getX()-300, appearance.getY(), 300, 30), false);

    }
}
