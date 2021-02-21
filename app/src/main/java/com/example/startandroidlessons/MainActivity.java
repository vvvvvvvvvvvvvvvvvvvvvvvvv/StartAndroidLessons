package com.example.startandroidlessons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater();
        LinearLayout linLayout = findViewById(R.id.linLayout);
        View view = layoutInflater.inflate(R.layout.text, linLayout, false);
        linLayout.addView(view);
    }


}