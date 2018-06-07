package com.example.alina.myapplicationwp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBegin = (Button) findViewById(R.id.btnBegin);
        btnBegin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBegin:
               Intent intent = new Intent(this, ActivityTime.class);
               startActivity(intent);
               break;
            default:
               break;
        }

    }
}
