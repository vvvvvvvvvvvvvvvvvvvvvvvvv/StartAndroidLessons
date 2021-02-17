package com.example.startandroidlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ShareCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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

import javax.xml.transform.sax.TemplatesHandler;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plus, minus, division, multiplication;
    EditText num1, num2;
    TextView result;
    int firstNum, secondNum;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        division = findViewById(R.id.division);
        multiplication = findViewById(R.id.multiplication);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplication.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {
        if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
            result.setText("please fill in all fields");
            return;
        }
        firstNum = Integer.valueOf(num1.getText().toString());
        secondNum = Integer.valueOf(num2.getText().toString());

        switch (view.getId()){
            case R.id.plus:
             result.setText(String.valueOf(firstNum + secondNum));
             break;
            case R.id.minus:
                result.setText(String.valueOf(firstNum - secondNum));
                break;
            case R.id.division:
                result.setText(String.valueOf(firstNum / secondNum));
                break;
            case R.id.multiplication:
                result.setText(String.valueOf(firstNum * secondNum));
                break;
        }
    }
}