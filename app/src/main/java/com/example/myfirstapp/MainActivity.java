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

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumbEditText = (EditText) findViewById(R.id.firstNumbEditText);
                EditText secondNumbEditText = (EditText) findViewById(R.id.secondNumbEditText);
                EditText ThridNumbEditText = (EditText) findViewById(R.id.thirdNumbEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            }
        });
    }
}
