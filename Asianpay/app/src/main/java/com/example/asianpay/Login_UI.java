package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_UI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        getSupportActionBar().hide();
        AppCompatButton Forget_Btn;
        Forget_Btn = findViewById(R.id.Forget_Btn);
        Button Reg_btn;
        Reg_btn = findViewById(R.id.Reg_Btn);

        Reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_UI.this,Register.class);
                startActivity(intent);
            }
        });

        Forget_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_UI.this,Forgot_password.class);
                startActivity(intent);
            }
        });
    }
}