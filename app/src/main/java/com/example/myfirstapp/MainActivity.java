package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);         //Button reference
        addBtn.setOnClickListener(new View.OnClickListener() {      //Anytime button is clicked
            @Override                                               //-onClick function will run
            public void onClick(View v) {
                //Retrieve numbers entered in EditText boxes
                EditText firstNumbEditText = (EditText) findViewById(R.id.firstNumbEditText);
                EditText secondNumbEditText = (EditText) findViewById(R.id.secondNumbEditText);
                EditText thridNumbEditText = (EditText) findViewById(R.id.thirdNumbEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                /*
                Get int value within EditText boxes
                Go from 'text' to 'string' so that parseInt can convert to int
                */
                int num1 = Integer.parseInt(firstNumbEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumbEditText.getText().toString());
                int num3 = Integer.parseInt(thridNumbEditText.getText().toString());

                int result = num1 + num2 + num3;
                //2905

            }
        });
    }
}
