package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class storing all the collections used to create a NPC
 *
 * String[] gender: An array of different gender a NPC can be
 * String[] age: An array of different ages a NPC can be
 * String[] occupation: An array of different occupations a NPC can have
 * WeightedCollection race: A weighted collection of the races a NPC can have
 *
 * Random rand: A Random object used to get random values in the arrays above
 */
public class Collections {

    private static String[] gender = {"Male", "Female", "Non-binary"};
    private static String[] age = {"child", "teenager", "adult", "middle-aged", "elderly"};
    private static String[] occupation = {"Apothecary", "Armorer", "Alchemist", "Apprentice", "Baker", "Bandit", "Beggar", "Blacksmith", "Brewer", "Busker", "Butcher", "Camp follower", "Carpenter", "Carter", "Cheesemaker", "Cook", "Cordwainer", "Costermonger", "Court jester", "Diplomat", "Falconer", "Farmer", "Fishmonger", "Furrier", "Fletcher", "Gardener", "Gravedigger", "Grocer", "Groom", "Innkeeper", "Jeweler", "Locksmith", "Mason", "Merchant", "Miller", "Minstrel", "Outlaw", "Page", "Poison tester", "Peasant", "Pig farmer", "Painter", "Ropemaker", "Sailor", "Scribe", "Servant", "Shepherd", "Silversmith", "Skinner", "Soldier", "Spy", "Squire", "Storyteller", "Summoner", "Tailor", "Tanner", "Tax collector", "Trader", "Guard", "Winemaker"};
    private static ArrayList<Race> race = new ArrayList<Race>();

    private static Random rand = new Random();

    /**
     * Constructor of the class
     */
    public Collections() {
        makeRaces();
    }

    /**
     * Making of all the races available
     */
    private static void makeRaces() {

        //Orc
        String raceName = "orc";
        ArrayList<String> content = new ArrayList<String>();
        ArrayList<Integer> weights = new ArrayList<Integer>();
        content.add("3");content.add("4");content.add("5");content.add("6");
        weights.add(30);weights.add(35);weights.add(25);weights.add(10);
        WeightedCollection nameWeight = new WeightedCollection(weights, content);
        Race orc = new Race(raceName, nameWeight);
        race.add(orc);

        //Elv
        raceName = "elv";
        content = new ArrayList<String>();
        weights = new ArrayList<Integer>();
        content.add("5");content.add("6");content.add("7");content.add("8");content.add("9");content.add("10");
        weights.add(10);weights.add(25);weights.add(25);weights.add(20);weights.add(10);weights.add(10);
        nameWeight = new WeightedCollection(weights, content);
        Race elv = new Race(raceName, nameWeight);
        race.add(elv);
    }

    /**
     * Getter of race
     * @return a random race chosen among the collection of the races
     */
    public Race getRace() {
        return race.get(rand.nextInt(race.size()));
    }

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
