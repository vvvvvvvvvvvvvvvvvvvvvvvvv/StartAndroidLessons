package com.example.startandroidlessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    final String LOG_TAG = "myLogs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler р  = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
            }
        };


    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class));
    }

    public void onClickStop(View v) {
        stopService(new Intent(this, MyService.class));
    }
}