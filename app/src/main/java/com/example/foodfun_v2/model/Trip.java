package com.example.foodfun_v2.model;
import androidx.annotation.NonNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class Trip {
    private LocalDate startDate;
    private LocalDate endDate;
    private String nameOfTrip;
    private int numberOfDays;
    private HashMap<String,Supplies> supplies;
    private ArrayList<People> listOfPeople;
    private HashMap<LocalDate,HashMap<typeOfMeal,ArrayList<Meal>>> mealList;

    public Trip(String startDate,String endDate,String name){
        this.listOfPeople=new ArrayList<People>();
        this.supplies=new HashMap<String,Supplies>();
        this.mealList=new HashMap<LocalDate,HashMap<typeOfMeal,ArrayList<Meal>>>();
        this.startDate=setDate(this.startDate,startDate);
        this.endDate=setDate(this.endDate,endDate);
        this.numberOfDays= (int) ChronoUnit.DAYS.between(this.startDate, this.endDate) + 1;
        Supplies water = new Supplies("Water");
        this.nameOfTrip = name + " " + this.startDate;
        this.supplies.put(water.getName(),water);
        addDatesAndTypes();


    }

    public LocalDate setDate(@NonNull LocalDate date, String dateFormat){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d/M/u");
        return date.parse(dateFormat,dateFormatter);
    }

  public  HashMap<LocalDate,HashMap<typeOfMeal,ArrayList<Meal>>> getMealList(){
        return this.mealList;
  }

    public boolean addPeople(People newPeople){
        if(!listOfPeople.contains(newPeople)){
            listOfPeople.add(newPeople);
            return true;
        }
        return false;
    }

    public void addDatesAndTypes(){
        for (LocalDate date = startDate; date.isBefore(endDate); date =date.plusDays(1))
        {
            this.mealList.put(date,new HashMap<>());

        }
        this.mealList.put(endDate,new HashMap<>());
        this.mealList.keySet().forEach(key -> {
            this.mealList.get(key).put(typeOfMeal.BREAKFAST, new ArrayList<>());
            this.mealList.get(key).put(typeOfMeal.LUNCH, new ArrayList<>());
            this.mealList.get(key).put(typeOfMeal.DINNER, new ArrayList<>());
        });
    }


    public void addMeal(Meal newMeal,LocalDate date){
        this.mealList.get(date).get(newMeal.getType()).add(newMeal);
    }
    public String getNameOfTrip() {
        return nameOfTrip;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public HashMap<String, Supplies> getSupplies() {
        return supplies;
    }

    public ArrayList<People> getListOfPeople() {
        return listOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        Trip trip = (Trip) o;

        if (startDate.equals(trip.startDate) && endDate.equals(trip.endDate))
            return nameOfTrip.equals(trip.nameOfTrip);
        return false;
    }


}
