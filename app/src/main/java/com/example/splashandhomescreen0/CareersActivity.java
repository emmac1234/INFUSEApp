package com.example.splashandhomescreen0;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CareersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(v -> sendEmail());

    }

    private void sendEmail() {
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextMessage = findViewById(R.id.editTextMessage);

        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();
        String message = editTextMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"infuse.communications@ericsson.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact Form Submission");
        intent.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\nEmail: " + email + "\nMessage: " + message);

        try {
            startActivity(Intent.createChooser(intent, "Send Email"));
        } catch (ActivityNotFoundException ex) {
            Toast.makeText(this, "No email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void launchHome(View vo) {
        Intent n = new Intent(this, MainActivity.class);
        startActivity(n);
    }



    }

