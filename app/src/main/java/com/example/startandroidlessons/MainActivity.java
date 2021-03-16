package com.example.startandroidlessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class).putExtra("time", 3).putExtra("label", "Call 1") );
        startService(new Intent(this, MyService.class).putExtra("time", 3).putExtra("label", "Call 2") );
        startService(new Intent(this, MyService.class).putExtra("time", 3).putExtra("label", "Call 3") );
    }


}