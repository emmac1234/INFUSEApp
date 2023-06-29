package com.example.splashandhomescreen0;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button_ty);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TYActivity.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.button_tech);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TechActivity.class);
            startActivity(intent);
        });

        Button button3 = findViewById(R.id.button_career);
        button3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CareersActivity.class);
            startActivity(intent);
        });

        Button button4 = findViewById(R.id.button_girls);
        button4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, girlsinict.class);
            startActivity(intent);
        });
        Button button5 = findViewById(R.id.button_internship);
        button5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ANDROID_INTERNSHIP.class);
            startActivity(intent);
        });

    }

}

