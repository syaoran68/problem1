package com.example.problem1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class BoxActivity extends AppCompatActivity {

    LinearLayout mBoxView;
    LinearLayout mBoxRows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.boxview);


        //TV.setText(getIntent().getStringExtra("location"));

        Integer layers =  Integer.parseInt(getIntent().getStringExtra("location"));

        mBoxView = findViewById(R.id.boxview);

        mBoxRows = findViewById(R.id.boxrows);

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);



        for(int i = 1; i <= layers; i++)
        {


            //View boxrowview = layoutInflater.inflate(R.layout.boxrows, null, false);

            for(int j = 0; j < i;j++)
            {
                View myview = layoutInflater.inflate(R.layout.boxes, null, false);

                mBoxView.addView(myview);

            }

        }
    }
}
