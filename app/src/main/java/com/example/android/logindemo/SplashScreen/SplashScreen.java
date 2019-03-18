package com.example.android.logindemo.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.android.logindemo.R;
import com.example.android.logindemo.login.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME = 4000; //This is 4 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                //Do any action here. Now we are moving to next page

                Intent mySuperIntent = new Intent(SplashScreen.this, LoginActivity.class);

                startActivity(mySuperIntent);

                /* This 'finish()' is for exiting the app when back button pressed

                 *  from Home page which is ActivityHome

                 */

                finish();

            }

        }, SPLASH_TIME);

    }

}



