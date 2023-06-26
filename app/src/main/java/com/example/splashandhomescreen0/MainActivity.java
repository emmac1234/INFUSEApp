package com.example.splashandhomescreen0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button_tech);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TechActivity.class);
                startActivity(intent);
            }
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