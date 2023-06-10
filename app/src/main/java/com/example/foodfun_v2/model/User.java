package com.example.foodfun_v2.model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.ArrayList;

public class User  {

    private String userName;
    private String password;
    private String email;
    private ArrayList<Trip> tripList;



    public User(String userName,String password,String email) throws Exception {

        this.userName=userName;
        this.password=setPassword(password);
        this.email=setEmail(email);
        this.tripList=new ArrayList<Trip>();
    }

    public static boolean isValidEmail(CharSequence target) {
        System.out.println(Patterns.EMAIL_ADDRESS.matcher(target).matches());
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());

    }

   public String setEmail(String email) throws  Exception{
        if(!isValidEmail(email)){
            throw new Exception();
        }
        return email;
   }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) throws Exception {
       if(password.length()<9){
           throw new Exception();
       }else {
           return password;
       }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Trip> getTripList() {
        return tripList;
    }

    public void addTrips(Trip newTrip) {
        if(!this.tripList.contains(newTrip)){
            this.tripList.add(newTrip);
        }
    }
}
