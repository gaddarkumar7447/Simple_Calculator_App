package com.techhello.calculater_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDateTime;

public class Converter extends AppCompatActivity {
    EditText editText,editText1,editText2,editText3;
    TextView textView,textView1,textView2,textView3;
    Button button, button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        textView = findViewById(R.id.textViewShow);
        editText = findViewById(R.id.editTextC);
        button = findViewById(R.id.button);

        textView1 = findViewById(R.id.textViewShow3);
        editText1 = findViewById(R.id.editTextC3);
        button1 = findViewById(R.id.button2);

        textView2 = findViewById(R.id.textViewShow4);
        editText2 = findViewById(R.id.editTextC4);
        button2 = findViewById(R.id.button4);

        textView3 = findViewById(R.id.textViewShow5);
        editText3 = findViewById(R.id.editTextC5);
        button3 = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                double n = Integer.parseInt(number);
                double far = (n *  9/5) + 32;
                textView.setText(""+far);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = editText1.getText().toString();
                float n1 = Integer.parseInt(number1);
                float cel = (n1 - 32) * 5/9;
                textView1.setText(""+cel);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number3 = editText3.getText().toString();
                double n3 = Integer.parseInt(number3);
                double CM = n3 * 100;
                textView3.setText(""+CM);
            }
        });
    }
}