
package com.example.splashandhomescreen0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_python);

    }
    public void launchpythonvideo(View v) {
        //launch a new activity

        Intent i = new Intent(this, settingspythonvideo.class);
        startActivity(i);
    }
}