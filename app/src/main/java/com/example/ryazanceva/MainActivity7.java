//Класс для востановления пароля сделан 02 04 Рязанцевой
package com.example.ryazanceva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

public class ForgotPass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void StendOTP1(View v) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
    public void Signniin(View v) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}