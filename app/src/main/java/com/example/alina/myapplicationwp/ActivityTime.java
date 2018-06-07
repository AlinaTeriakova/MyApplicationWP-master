package com.example.alina.myapplicationwp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTime extends AppCompatActivity implements View.OnClickListener{

    FloatingActionButton fab2;
    EditText time;
    EditText labor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activit_time);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);;
        fab2.setOnClickListener(this);
        time = (EditText) findViewById(R.id.editText6);
        labor = (EditText) findViewById(R.id.editText7);
    }

    @Override
    public void onClick(View v) {
        time.setText("");
        labor.setText("Задание");

    }
}
