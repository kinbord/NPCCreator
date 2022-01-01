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
    private static String[] appearance = {"Earrings", "Necklace", "Circlet", "Bracelet", "Piercings", "Outlandish clothes", "Flamboyant clothes", "Formal clothes", "Ragged clothes", "Scar", "Missing teeth", "Missing finger", "Unusual eye color", "Tattoos", "Birthmark", "Unusual skin color", "Bald", "Braided hair", "Unusual hair color", "Beautiful", "Ugly", "Crooked", "Rigid", "Distinctive Nose"};
    private static String[] alignment = {"Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "True neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil", "Unaligned"};
    private static WeightedCollection race;

    private static Random rand = new Random();

    /**
     * Constructor of the class
     */
    public Collections() {
        this.race = makeRaces();
    }

    /**
     * Making of all the races available
     */
    private static WeightedCollection makeRaces() {

        ArrayList<Race> raceContent = new ArrayList<Race>();
        ArrayList<Integer> raceWeights = new ArrayList<Integer>();

        //Human
        String raceName = "human";
        ArrayList<Integer> content = new ArrayList<Integer>();
        ArrayList<Integer> weights = new ArrayList<Integer>();
        content.add(3);content.add(4);content.add(5);content.add(6);content.add(7);content.add(8);content.add(9);
        weights.add(5);weights.add(10);weights.add(15);weights.add(20);weights.add(25);weights.add(20);weights.add(5);
        WeightedCollection nameWeight = new WeightedCollection(content, weights);
        Race human = new Race(raceName, nameWeight);
        raceContent.add(human);
        raceWeights.add(25);

        //Orc
        raceName = "orc";
        content = new ArrayList<Integer>();
        weights = new ArrayList<Integer>();
        content.add(3);content.add(4);content.add(5);content.add(6);
        weights.add(30);weights.add(35);weights.add(25);weights.add(10);
        nameWeight = new WeightedCollection(content, weights);
        Race orc = new Race(raceName, nameWeight);
        raceContent.add(orc);
        raceWeights.add(25);

        //Elv
        raceName = "elv";
        content = new ArrayList<Integer>();
        weights = new ArrayList<Integer>();
        content.add(5);content.add(6);content.add(7);content.add(8);content.add(9);content.add(10);
        weights.add(10);weights.add(25);weights.add(25);weights.add(20);weights.add(10);weights.add(10);
        nameWeight = new WeightedCollection(content, weights);
        Race elv = new Race(raceName, nameWeight);
        raceContent.add(elv);
        raceWeights.add(25);

        //Dwarf
        raceName = "dwarf";
        content = new ArrayList<Integer>();
        weights = new ArrayList<Integer>();
        content.add(5);content.add(6);content.add(7);content.add(8);content.add(9);content.add(10);
        weights.add(5);weights.add(10);weights.add(15);weights.add(25);weights.add(25);weights.add(20);
        nameWeight = new WeightedCollection(content, weights);
        Race dwarf = new Race(raceName, nameWeight);
        raceContent.add(dwarf);
        raceWeights.add(25);

        return race = new WeightedCollection(raceContent, raceWeights);
    }

    /**
     * Getter of race
     * @return a random race chosen among the collection of the races
     */
    public Race getRace() {
        return (Race) race.getRandomContent();
    }

    /**
     * Getter of appearance
     *
     * @return a random appearance is chosen in the appearance array
     */
    public String getAppearance() {
        return appearance[rand.nextInt(appearance.length)];
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
     * Getter of alignment
     *
     * @return a random alignment chosen in the alignment array
     */
    public String getAlignment() {
        return alignment[rand.nextInt(alignment.length)];
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
