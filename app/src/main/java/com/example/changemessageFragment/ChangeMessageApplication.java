package com.example.changemessageFragment;

import android.app.Application;

import com.example.changemessageFragment.model.User;

public class ChangeMessageApplication extends Application {
    private User user;


    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Lourdes","pabloinfantes@gmail.com");

    }

    public User getUser() {
        return user;
    }
}
