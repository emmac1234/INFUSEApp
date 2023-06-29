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

        Button button1 = findViewById(R.id.button_tech);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TechActivity.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.button_ty);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TYActivity.class);
            startActivity(intent);
        });

        Button button3 = findViewById(R.id.button_career);
        button3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CareersActivity.class);
            startActivity(intent);
        });

    }

}

//        Button button1 = findViewById(R.id.button_girls);
//        button1.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, girlsInICTMain.class);
//            startActivity(intent);
//        });}}

//        Button button2 = findViewById(R.id.button_career);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button3 = findViewById(R.id.button_ty);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button button2 = findViewById(R.id.button_internship);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button3 = findViewById(R.id.button_school);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
//        Button button3 = findViewById(R.id.button_website);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
///
//