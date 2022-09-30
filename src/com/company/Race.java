package com.company;

import java.util.Random;

/**
 * Class representing one race
 * Each race has a weighted collection attached for name's length
 *
 * String raceName: The name of the race
 * WeightedCollection nameWeight: The weighted collection associated to the race for the length of the name of the NPC
 *
 * Random rand: A random variable to choose the race randomly
 */
public class Race {

    private String raceName;
    private WeightedCollection nameWeight;
    private int nameCount;

    /**
     * Constructor for the class
     * @param raceName: The name of the race
     * @param nameWeight: The weighted collection for the length of the name
     */
    public Race(String raceName, WeightedCollection nameWeight, int nameCount) {

        this.raceName = raceName;
        this.nameWeight = nameWeight;
        this.nameCount = nameCount;
    }

    /**
     * Getter for nameWeight
     *
     * @return nameWeight: The weighted collection for the name's length
     */
    public WeightedCollection getNameWeight() {
        return nameWeight;
    }

    /**
     * Getter for raceName
     *
     * @return raceName: The name of the race
     */
    public String getRaceName() {
        return raceName;
    }

    public int getNameCount() {
        return nameCount;
    }
}
