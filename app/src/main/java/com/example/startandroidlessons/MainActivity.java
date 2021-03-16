package com.example.startandroidlessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickStart(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.menu);
        popupMenu.setOnMenuItemClickListener((menuItem) -> {
            switch (menuItem.getItemId()) {
                case R.id.menu1:
                    Toast.makeText(getApplicationContext(),
                            "Вы выбрали PopupMenu 1",
                            Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.menu2:
                    Toast.makeText(getApplicationContext(),
                            "Вы выбрали PopupMenu 2",
                            Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.menu3:
                    Toast.makeText(getApplicationContext(),
                            "Вы выбрали PopupMenu 3",
                            Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return false;
            }
        });
        popupMenu.show();
    }


}