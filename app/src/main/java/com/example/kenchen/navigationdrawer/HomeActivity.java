package com.example.kenchen.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    //private int SPLASH_TIME = 1000;

    @Override
    //This whole Activity is for the load screen, trying to figure out a better way
    //Running only in main crash program
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Thread timer = new Thread() {
            public void run() {
                try {
                    //sleep(SPLASH_TIME);
                    setTheme(R.style.AppTheme);
                    Intent homeIntent = new Intent(HomeActivity.this, MainActivity.class);
                    startActivity(homeIntent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        timer.start();
    }
}
