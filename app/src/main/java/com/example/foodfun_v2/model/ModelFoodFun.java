package com.example.foodfun_v2.model;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class ModelFoodFun implements FoodFunInterface {


    public ModelFoodFun(){

    }
    @Override
    public User createUser(String name, String password, String email) throws Exception {
        User newUser=new User(name,password,email);
        return null;
    }








    /*
    TODO CreateMeal
        user create and add meals at his will and people that eating with him

    TODO CreateTrip
       user start with creating his trip choosing dates between !!!--Check if end date is bigger than start date--!!!!
       user enters people that going with him to the trip

    TODO CreateUser
         if user isn't registered  need to Sign in with option {Google,FaceBook,Guest,Origin user...}
         user has {}


    TODO GetUserInfo
       getting all his info {Trips,Meals,Friends}

     TODO
    */





}
