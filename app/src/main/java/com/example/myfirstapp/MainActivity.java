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
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button multBtn = (Button) findViewById(R.id.multBtn);

        Button secActivity = (Button) findViewById(R.id.secActivity);
        Button googleActivity = (Button) findViewById(R.id.googleActivity);


        addBtn.setOnClickListener(new View.OnClickListener() {      //Add button function
            @Override                                               //Anytime button is clicked
            public void onClick(View v) {                           //-onClick function will run
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
                resultTextView.setText(result + "");        //Output value to result view

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {      //Subtract Button
            @Override
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

                int result = num1 - num2 - num3;
                resultTextView.setText(result + "");        //Output value to result view

            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {      //Multiply Button function
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

                int result = num1 * num2 * num3;
                resultTextView.setText(result + "");        //Output value to result view

            }
        });


    }
}
