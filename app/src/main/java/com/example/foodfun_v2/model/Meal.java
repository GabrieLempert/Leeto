package com.example.foodfun_v2.model;

import java.util.ArrayList;
import java.util.HashMap;
enum typeOfMeal {
    BREAKFAST,
    LUNCH,
    DINNER
}

public class Meal {


    private String name;
    private ArrayList<People> listOfPeople;
    private int howManyEat;
    private HashMap<String, Ingredient> ingredients;
    private typeOfMeal type;


    public Meal(String name,typeOfMeal typeOfMeal){
        this.howManyEat=0;
        this.name=name;
        this.type=typeOfMeal;
        this.listOfPeople=new ArrayList<People>();
        this.ingredients = new HashMap<String, Ingredient>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<People> getListOfPeople() {
        return listOfPeople;
    }

    public void addListOfPeople(ArrayList<People> listOfPeople) {


        this.howManyEat=this.listOfPeople.size();
    }

    public int getHowManyEat() {
        return listOfPeople.size();
    }

    public HashMap<String, Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredient ingredient) {
         this.ingredients.put(ingredient.getName(),ingredient);
    }



    public typeOfMeal getType() {
        return type;
    }
}
