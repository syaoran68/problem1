package com.example.problem1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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


        Integer layers =  Integer.parseInt(getIntent().getStringExtra("location"));

        LinearLayout layout = new LinearLayout(this);
        LinearLayout rowLayout = null;

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        layout.setLayoutParams(layoutParams);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        for(int i = 1; i <= layers; i++)
        {
            rowLayout = new LinearLayout(this);
            ViewGroup.LayoutParams rowLayoutParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT

            );
            rowLayout.setLayoutParams(layoutParams);
            rowLayout.setOrientation(LinearLayout.HORIZONTAL);


            for(int j = 0; j < i;j++)
            {


                Button myButton = new Button(this);
                myButton.setText("Button");

                myButton.setGravity(Gravity.CENTER);
                rowLayout.addView(myButton);

            }

            layout.addView(rowLayout);
        }
        setContentView(layout);
    }
}
