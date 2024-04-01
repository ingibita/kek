// Рязанцева Екатерина 01.04.24
// Главная страница
package com.example.ryazanceva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.transition.Hold;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tick(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}