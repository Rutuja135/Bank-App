package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class transcation extends AppCompatActivity {
    EditText et1,et2;
    Database_transfer g;
    Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transcation);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        button6=findViewById(R.id.button6);
        g=new Database_transfer(this);
        button6.setOnClickListener(v -> {
            String amount=et1.getText().toString();
            String name=et2.getText().toString();
            if(amount.equals("")||name.equals("")){
                Toast.makeText(transcation.this, "Enter all the fields", Toast.LENGTH_SHORT).show();
            }
            else{
                boolean r=g.insert_Data(amount,name);
                if(r){
                    Toast.makeText(transcation.this, "Successful", Toast.LENGTH_SHORT).show();
                    button6.setOnClickListener(v1 -> {
                        //Intent intent=new Intent(transcation.this,MainActivity.class);
                    });
                }
                else{
                    Toast.makeText(transcation.this, "not successful", Toast.LENGTH_SHORT).show();
                }

            }
            et1.setText("");
            et2.setText("");
        });
    }
}