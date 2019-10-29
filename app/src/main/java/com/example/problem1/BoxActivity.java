package com.example.problem1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class BoxActivity extends AppCompatActivity {

    LinearLayout mBoxView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.boxview);





        Integer layers =  Integer.parseInt(getIntent().getStringExtra("location"));





        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);





        for(int i = 1; i <= layers; i++)
        {
            mBoxView = findViewById(R.id.boxview);

            for(int j = 0; j < i;j++)
            {
                LinearLayout boxrow = (LinearLayout)findViewById(R.id.boxrows);

                Button myButton = new Button(this);
                myButton.setText("1");

                boxrow.addView(myButton);

                View myview = layoutInflater.inflate(R.layout.boxrows, null, false);

                mBoxView.addView(myview);


            }

        }

    }
}
