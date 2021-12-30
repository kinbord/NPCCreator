package com.company;

import java.util.Random;

/**
 * Class for the making of the name of a NPC
 *
 * String firstName: The first name of the NPC
 * String middleName: The middle name of the NPC
 * String lastName: The last name of the NPC
 * WeightedCollection nameWeight: The weighted collection for the length of the names
 *
 * Random rand: A random variable to randomize the name's length and the name's structure
 * String[] vowels: The array with all the vowels available
 * String[] consonants: The array with the available consonants
 */
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    private WeightedCollection nameWeight;

    private static Random rand = new Random();
    private static String[] vowels = {"a", "e", "i", "o", "u", "y", "å", "ø", "æ"};
    private static String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

    /**
     * Constructor of the class
     * Create a first name, a middle name and a last name
     *
     * @param nameWeight: the weighted collection corresponding to the race of the NPC and helping with the name's length
     */
    public Name (WeightedCollection nameWeight) {
        this.nameWeight = nameWeight;
        firstName = generateName();
        //middleName = generateName();
        //lastName = generateName();
    }

    /**
     * A method to generate a new name
     * Create a name with one vowel every two consonants
     *
     * @return newName: The name generated
     */
    private String generateName() {

        String newName ="";

        int type = rand.nextInt(3);
        int nameLength = generateNamesLength();

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

    /**
     * Method to generate the length of the name based on the weighted collection from the race of the NPC
     *
     * @return nameLength: The length of the name
     */
    private int generateNamesLength () {

        int nameLength = Integer.parseInt(nameWeight.getRandomContent());

        return nameLength;
    }

    /**
     * Getter for firstName
     *
     * @return firstName: The first name of the NPC
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for middleName
     *
     * @return middleName: The middle name of the NPC
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Getter for lastName
     *
     * @return lastName: The last name of the NPC
     */
    public String getLastName() {
        return lastName;
    }
}
