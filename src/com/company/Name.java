package com.company;

import java.util.Random;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    private WeightedCollection nameWeight;

    private static Random rand = new Random();
    private static String[] vowels = {"a", "e", "i", "o", "u", "y", "å", "ø", "æ"};
    private static String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

    public Name (WeightedCollection nameWeight) {
        this.nameWeight = nameWeight;
        firstName = generateName();
        //middleName = generateName();
        //lastName = generateName();
    }

    private String generateName() {

        String newName ="";

        int type = rand.nextInt(3);
        int selectNameLength = rand.nextInt(101);
        int nameLength = 0;

        if (selectNameLength <= nameWeight.getWeights().get(0)) {
            nameLength = Integer.parseInt(nameWeight.getContent().get(0));
        }

        for(int i = 1 ; i < nameWeight.getContent().size() ; i++) {
            if (nameWeight.getWeights().get(i) >= selectNameLength && nameWeight.getWeights().get(i - 1) < selectNameLength) {
                nameLength = Integer.parseInt(nameWeight.getContent().get(i));
            }
        }

        if (nameLength == 0) {
            System.out.println(selectNameLength);

        }

        for (int i = 0 ; i < nameLength ; i++) {
            if (i % 3 == type) {
                if (i == 0) {
                    newName = newName + vowels[rand.nextInt(vowels.length)].toUpperCase();
                } else {
                    newName = newName + vowels[rand.nextInt(vowels.length)];
                }
            } else {
                if (i == 0) {
                    newName = newName + consonants[rand.nextInt(consonants.length)].toUpperCase();
                }
                else {
                    newName = newName + consonants[rand.nextInt(consonants.length)];
                }
            }
        }
        return newName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
