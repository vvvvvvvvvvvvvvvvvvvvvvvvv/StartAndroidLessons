package com.example.startandroidlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbWeight;
    Button btn1;
    Button btn2;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = (SeekBar) findViewById(R.id.sbWeight);
        sbWeight.setOnSeekBarChangeListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax() - progress;
        // настраиваем вес
        lParams1.weight = leftValue;
        lParams2.weight = rightValue;
        // в текст кнопок пишем значения переменных
        btn1.setText(String.valueOf(leftValue));
        btn2.setText(String.valueOf(rightValue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}