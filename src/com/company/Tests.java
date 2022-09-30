package com.company;

//Different tests such as the amount of names of different lengths
public class Tests {

    public Tests(){
        nameLengthTest();
    }

    /**
     * Test the length of names generated
     * This is done by testing the first name
     * Every name is generated on the same mode, therefore testing only one out of the three is enough
     */
    private static void nameLengthTest() {
        double[] troisADix = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0 ; i <= 10000 ; i++) {
            NPC testCharacter = new NPC();
            for (int j = 3 ; j <= 10 ; j++) {
                if (testCharacter.getName().getFirstName().length() == j) troisADix[j-3]++;
            }
        }
        for (int i = 0 ; i <= 7 ; i++)
        {
            System.out.println("Names of " + (i+3) + " characters: " + troisADix[i] + " ; " + troisADix[i]/100 + "% of the pop.");
        }
    }
}
