package com.example.foodfun_v2.model.login_model;

import java.util.Random;

public class IdGenerator {
    private int min;
    private int max;
    private String id;

    public IdGenerator(char range, int length) {
        // Determine the minimum and maximum values based on the desired length
        this.min = (int) Math.pow(10, length - 1);
        this.max = (int) Math.pow(10, length) - 1;

        // Adjust the maximum value by appending the chosen number
        this.max = Integer.parseInt(range + String.valueOf(this.max));

        int randomNumber = getRandomNumber(min, max);
        // Convert the random number to a string with leading zeros if necessary
        this.id = String.format("%0" + length + "d", randomNumber);
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public String getId() {
        return id;
    }

}
