package com.example.bankapp;

import static com.example.bankapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class Devid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_devid);
        Button button5=findViewById(id.button5);
        button5.setOnClickListener(v -> {
            Intent intent=new Intent(Devid.this,transcation.class);
            startActivity(intent);
        });
    }
}