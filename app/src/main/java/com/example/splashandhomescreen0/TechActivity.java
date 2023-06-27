package com.example.splashandhomescreen0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TechActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        findViewById(R.id.techvideo);


    }
    public void ericssonSettings(View view){
        //launch a new activity

        Intent i = new Intent(this, TechVidActivity.class);
        startActivity(i);
    }
}
