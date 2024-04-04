package com.example.ryazanceva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }
    public void lol(View v){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
    public void StendOTP1(View v){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
}