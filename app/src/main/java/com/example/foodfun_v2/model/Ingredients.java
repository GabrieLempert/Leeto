package com.example.foodfun_v2.model;

import androidx.annotation.NonNull;

enum typeOfIngredient{
    MEAT,
    FRUIT,
    VEGETABLE,
    SPICE
}

public class Ingredients {

    private String name;
    private double quantity;
    private typeOfIngredient type;

    public Ingredients(String name, @NonNull typeOfIngredient type){
        this.name=name;
        this.type=typeOfIngredient.valueOf(type.name());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    /*
    * quantity will be measured by how much one person needs for meal and
    * it will be calculated in the Meal Class
    *
    */

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    public typeOfIngredient getType() {
        return type;
    }


}
