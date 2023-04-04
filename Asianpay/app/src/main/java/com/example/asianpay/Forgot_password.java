package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forgot_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();
        Button btn_back_login;
        btn_back_login = findViewById(R.id.btn_back_login);
        btn_back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgot_password.this,Login_UI.class);
                startActivity(intent);
            }
        });
    }
}