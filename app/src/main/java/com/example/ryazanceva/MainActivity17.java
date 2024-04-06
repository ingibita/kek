package com.example.ryazanceva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main17);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Home(View v) {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    public void Walet(View v) {
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);
    }

    public void Track(View v) {
        Intent intent = new Intent(this, MainActivity17.class);
        startActivity(intent);
    }
}