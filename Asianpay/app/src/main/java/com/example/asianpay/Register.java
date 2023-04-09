package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        Button btn_back_login, btn_register;
        RadioGroup radiogrp;
        RadioButton radiomale, radiofemale;
        btn_back_login = findViewById(R.id.btn_back_login);
        btn_register = findViewById(R.id.btn_register);
        radiomale = findViewById(R.id.radiomale);
        radiofemale = findViewById(R.id.radiofemale);

        btn_back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Login_UI.class);
                startActivity(intent);
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        public void onRadioButtonClicked(View view){

        }
    }
}