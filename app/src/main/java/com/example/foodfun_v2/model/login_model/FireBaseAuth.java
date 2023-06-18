package com.example.foodfun_v2.model.login_model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FireBaseAuth {

    private FirebaseAuth firebaseAuth;

    public FireBaseAuth(){
        this.firebaseAuth =FirebaseAuth.getInstance();
    }


    private void createUserWithEmailAndPassword(String email, String password) throws Exception {
        // Create a new user with email and password
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // User creation successful
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        // Perform any additional actions after user creation if needed
                    } else {
                        // User creation failed
                        Exception exception = task.getException();
                        if (exception != null) {
                            // Handle the exception
                            // ...
                        }
                    }
                });
    }


}
