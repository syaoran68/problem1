
//CWID: 889569927
//First Name: Eddie
//Last Name: Huang
//Problem 1
package com.example.problem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button yourButton = (Button) findViewById(R.id.click_button);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v ){
                EditText etLocation = (EditText) findViewById(R.id.plain_text_input);
                Intent myIntent = new Intent(MainActivity.this , BoxActivity.class);
                myIntent.putExtra("location", etLocation.getText().toString());
                startActivity(myIntent);
            }
        });



    }


}
