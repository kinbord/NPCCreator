package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class representing a weighted collection
 * A weighted collection being a collection where every element has a weight
 * The weight is used for random selection in the collection
 * This way some elements are more likely to get chosen than others
 *
 * ArrayList<Integer> weights: An ArrayList of integer values being the weights of the items in the collection
 * ArrayList<String> content: An ArrayList of String values being the items in the collection
 *
 * Random rand: A random variable to get something from the collection
 */
public class WeightedCollection {

    private ArrayList<Integer> weights = new ArrayList<Integer>();
    private ArrayList<String> content = new ArrayList<String>();

    Random rand = new Random();

    /**
     * Constructor of the weighted collection
     *
     * @param weights: the weights of the items
     * @param content: the items
     */
    public WeightedCollection(ArrayList<Integer> weights, ArrayList<String> content) {

        if (checkWeights(weights)) {
            this.weights = makeWeights(weights);
            this.content = content;
        }
        else {
            System.out.println("Your weighted list is not going to 100%");
        }
    }

    /**
     * Method to apply weights in order for them to be used efficiently
     * It sums up the weights so that a random from 0 to 100 can use them
     *
     * @param weights: the weights to be applied
     * @return ArrayList<Integer> newWeights: a new ArrayList with the weights summed up
     */
    private static ArrayList<Integer> makeWeights(ArrayList<Integer> weights) {
        ArrayList<Integer> newWeights = new ArrayList<Integer>();

        for (int i = 0 ; i < weights.size() ; i++) {
            if (i == 0) {
                newWeights.add(weights.get(i));
            } else {
                newWeights.add(weights.get(i) + newWeights.get(i - 1));
            }
        }
        return newWeights;
    }

    /**
     * A method to check if the total sum of the weight is 100
     * If not this will create an error in the constructor
     *
     * @param weights: the weights to check
     * @return true if the weights sum up to 100, false otherwise
     */
    private static boolean checkWeights(ArrayList<Integer> weights) {

        int sum = 0;

        for (int i = 0 ; i < weights.size() ; i++) {
            sum = sum + weights.get(i);
        }
        if (sum == 100) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * A method to get randomly some content from the collection
     *
     * @return randomContent: a randomly chosen content from the collection
     */
    public String getRandomContent() {

        int selectContent = rand.nextInt(101);

        String randomContent = "";

        if (selectContent <= weights.get(0)) {
            randomContent = content.get(0);
        }
        for(int i = 1 ; i < content.size() ; i++) {
            if (weights.get(i) >= selectContent && weights.get(i - 1) < selectContent) {
                randomContent = content.get(i);
            }
        }

        return randomContent;
    }

    /**
     * Getter for weights
     *
     * @return ArrayList<Integer> weights: The weights of the items, well summed up and ready to be used alongside a random between 0 and 100
     */
    public ArrayList<Integer> getWeights() {
        return weights;
    }

    /**
     * Getter for content
     *
     * @return ArrayList<String> content: The items written as Strings
     */
    public ArrayList<String> getContent() {
        return content;
    }
}
