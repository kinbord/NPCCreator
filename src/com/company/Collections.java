package com.company;

import java.util.Random;

/**
 * Class storing all the collections used to create a NPC
 *
 * String[] gender: An array of different gender a NPC can be
 * String[] age: An array of different ages a NPC can be
 * String[] occupation: An array of different occupations a NPC can have
 *
 * Random rand: A Random object used to get random values in the arrays above
 */
public class Collections {

    private static String[] gender = {"Male", "Female", "Non-binary"};
    private static String[] age = {"child", "teenager", "adult", "middle-aged", "elderly"};
    private static String[] occupation = {"Apothecary", "Armorer", "Alchemist", "Apprentice", "Baker", "Bandit", "Beggar", "Blacksmith", "Brewer", "Busker", "Butcher", "Camp follower", "Carpenter", "Carter", "Cheesemaker", "Cook", "Cordwainer", "Costermonger", "Court jester", "Diplomat", "Falconer", "Farmer", "Fishmonger", "Furrier", "Fletcher", "Gardener", "Gravedigger", "Grocer", "Groom", "Innkeeper", "Jeweler", "Locksmith", "Mason", "Merchant", "Miller", "Minstrel", "Outlaw", "Page", "Poison tester", "Peasant", "Pig farmer", "Painter", "Ropemaker", "Sailor", "Scribe", "Servant", "Shepherd", "Silversmith", "Skinner", "Soldier", "Spy", "Squire", "Storyteller", "Summoner", "Tailor", "Tanner", "Tax collector", "Trader", "Guard", "Winemaker"};

    private static Random rand = new Random();

    /**
     * Constructor of the class
     */
    public Collections() {}

    /**
     * Getter of gender
     *
     * @return a random gender chosen in the gender array
     */
    public String getGender() {
        return gender[rand.nextInt(gender.length)];
    }

    /**
     * Getter of age
     *
     * @return a random age chosen in the age array
     */
    public String getAge() {
        return age[rand.nextInt(age.length)];
    }

    /**
     * Getter of occupation
     *
     * @return a random occupation chosen in the occupation array
     */
    public String getOccupation() {
        return occupation[rand.nextInt(occupation.length)];
    }
}
