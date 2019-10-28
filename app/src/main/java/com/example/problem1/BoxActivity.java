package com.example.problem1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class BoxActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.box_view);

        TextView TV = (TextView) findViewById(R.id.textView);

        TV.setText(getIntent().getStringExtra("location"));


    }
}
