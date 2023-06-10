package com.example.foodfun_v2.controller;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.example.foodfun_v2.R;
import com.example.foodfun_v2.model.FoodFunInterface;
import com.example.foodfun_v2.model.Meal;
import com.example.foodfun_v2.model.Trip;
import com.example.foodfun_v2.model.typeOfMeal;


public class MainActivity extends Activity {
    private FoodFunInterface modelFoodFun;








    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Meal newMeal=new Meal("", typeOfMeal.BREAKFAST);
        Trip newTrip=new Trip("11/9/2021","13/9/2021","");



    }




}
