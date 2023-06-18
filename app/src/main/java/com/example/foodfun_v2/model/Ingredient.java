package com.example.foodfun_v2.model;

import androidx.annotation.NonNull;

enum typeOfIngredient{
    MEAT,
    FRUIT,
    VEGETABLE,
    SPICE
}

public class Ingredient implements Comparable {

    private String name;
    private double quantity;
    private typeOfIngredient type;

    public Ingredient(String name, @NonNull typeOfIngredient type) {
        this.name = name;
        this.type = typeOfIngredient.valueOf(type.name());

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

    @Override
    public boolean equals(Object obj) {
        /*Not sure if needed
        if (this == obj) {
                return true;
        }*/
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ingredient other = (Ingredient) obj;
        return this.name.equalsIgnoreCase(other.name) && this.type == other.type;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Ingredient) {
            Ingredient other = (Ingredient) o;
            int nameComparison = this.name.compareToIgnoreCase(other.name);

            if (nameComparison != 0) {
                // If the names are not equal, return the result of name comparison
                return nameComparison;
            } else {
                // If the names are equal, compare based on the ingredient type
                return this.type.compareTo(other.type);
            }
        }

        // If the object is not an Ingredient, consider it greater than an Ingredient
        return 1;
    }

}
