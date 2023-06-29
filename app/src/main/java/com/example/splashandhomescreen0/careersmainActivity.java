package com.example.splashandhomescreen0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class careersmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchCareers(View v) {
        Intent i = new Intent(this, CareersActivity.class);
        startActivity(i);
    }

    public void launchpage(View s) {
        Intent l = new Intent(this, WebApp.class);
        startActivity(l);
    }

}