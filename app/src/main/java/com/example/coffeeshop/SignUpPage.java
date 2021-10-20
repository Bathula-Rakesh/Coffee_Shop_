package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
    }

    public void SignUp(View view) {
        Intent intent = new Intent(SignUpPage.this,MainActivity.class);
        startActivity(intent);
    }
}