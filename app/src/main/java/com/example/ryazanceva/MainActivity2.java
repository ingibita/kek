// Рязанцева Екатерина 01.04.24
// Страница 2
package com.example.ryazanceva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.transition.Hold;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Tick1(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void Tick2(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}