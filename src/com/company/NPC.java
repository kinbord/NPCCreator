package com.company;

/**
 * Class representing a NPC
 *
 * Name name: The full name of the NPC, first, middle and last name
 * Race race: The race of the NPC, also conveys the weights for the name's length
 * String age: The age of the NPC
 * String gender: The gender of the NPC
 * String occupation: The occupation of the NPC, what they do or did for a living
 * String appearance: The appearance of a NPC, something striking about its appearance
 * String alignment: The alignment of the NPC
 *
 * Collections collections: A set of collections used to randomly get the variables above
 */
public class NPC {

    private Name name;
    private Race race;
    private String age;
    private String gender;
    private String occupation;
    private String appearance;
    private String alignment;

    static private Collections collections = new Collections();

    /**
     * Constructor of the class
     * Generates a random race, name, gender, age and occupation
     */
    public NPC () {
        this.race = collections.getRace();
        this.name = new Name(this.race.getNameWeight(), this.race.getNameCount());
        this.gender = collections.getGender();
        this.age = collections.getAge();
        this.occupation = collections.getOccupation();
        this.appearance = collections.getAppearance();
        this.alignment = collections.getAlignment();
    }

    /**
     * Getter for name
     *
     * @return name, which itself contains first, middle and last name
     */
    public Name getName() {
        return name;
    }

    /**
     * Getter for race
     *
     * @return race
     */
    public Race getRace() {
        return race;
    }

    /**
     * Getter for gender
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Getter for age
     *
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * Getter for occupation
     *
     * @return occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Getter for appearance
     *
     * @return appearance
     */
    public String getAppearance() {
        return appearance;
    }

    /**
     * Getter for alignment
     *
     * @return alignment
     */
    public String getAlignment() {
        return alignment;
    }
}
