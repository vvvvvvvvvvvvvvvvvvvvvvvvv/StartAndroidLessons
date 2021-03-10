package com.example.startandroidlessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        Intent intent = new Intent("com.example.servtest.MyService").putExtra("name", "value");
        intent.setPackage("com.example.servtest");
        startService(intent);
    }
}