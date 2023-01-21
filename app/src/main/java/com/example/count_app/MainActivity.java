package com.example.count_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numberText;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = (TextView) findViewById(R.id.textView);
        Button tapBtn = (Button)findViewById(R.id.button);

        initializeNumberText();

        tapBtn.setOnClickListener(addNumber);
    }

    private void initializeNumberText() {
        number = 0;
        numberText.setText(""+number);

    }

    private final View.OnClickListener addNumber = new View.OnClickListener() {
        public void onClick(View btn){
            number += 1;
            numberText.setText(""+number);
        }
    };
}