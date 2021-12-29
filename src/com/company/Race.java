package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Race {

    private String raceName;
    private WeightedCollection nameWeight;

    private static Random rand = new Random();

    public Race() {

        if (rand.nextInt(2) == 0) {
            raceName = "elv";
            ArrayList<String> content = new ArrayList<String>();
            ArrayList<Integer> weights = new ArrayList<Integer>();
            content.add("5");content.add("6");content.add("7");content.add("8");content.add("9");content.add("10");
            weights.add(10);weights.add(25);weights.add(25);weights.add(20);weights.add(10);weights.add(10);
            nameWeight = new WeightedCollection(weights, content);
        }
        else {
            raceName = "orc";
            ArrayList<String> content = new ArrayList<String>();
            ArrayList<Integer> weights = new ArrayList<Integer>();
            content.add("3");content.add("4");content.add("5");content.add("6");
            weights.add(30);weights.add(35);weights.add(25);weights.add(10);
            nameWeight = new WeightedCollection(weights, content);
        }
    }

    public WeightedCollection getNameWeight() {
        return nameWeight;
    }

    public String getRaceName() {
        return raceName;
    }
}
