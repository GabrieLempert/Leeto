package com.example.foodfun_v2.model.login_model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {
    private final IdGenerator userID;
    private String userName;
    private String email;



    public User(String email,String password) throws Exception {
        this.userID = new IdGenerator('4',9);
    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public String setEmail(String email) throws Exception {
        if (!isValidEmail(email)) {
            throw new Exception("Invalid email format");
        }
        return email;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }



}
