package com.example.ryazanceva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
    public void Notification(View v){
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
    }
    public void Card(View v){
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);
    }
    public void lalal(View v){
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);
    }
}