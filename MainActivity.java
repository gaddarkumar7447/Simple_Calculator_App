package com.techhello.calculater_app;

import static com.techhello.calculater_app.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String newOperator = "+";
    String oldOperator  = "";
    Boolean isOperator = true;
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(editText);
        buttonC = findViewById(ButtonNewCal);
    }

    public void numberEvent(View view) {
        if (isOperator)
        {
            textView.setText("");
            isOperator = false;
        }
        String number = textView.getText().toString();
        switch (view.getId()){
            case Button1:
                number +="1";
                break;
            case Button2:
                number +="2";
                break;
            case Button3:
                number +="3";
                break;
            case Button4:
                number +="4";
                break;
            case Button5:
                number +="5";
                break;
            case Button6:
                number +="6";
                break;
            case Button7:
                number +="7";
                break;
            case Button8:
                number +="8";
                break;
            case Button9:
                number +="9";
                break;
            case Button0:
                number +="0";
                break;
            case plusMinusButton:
                number ="-"+number;
                break;

        }
        textView.setText(number);
    }

    public void operatorEvent(View view) {
        isOperator = true;
        oldOperator = textView.getText().toString();
        switch (view.getId()){
            case divideButton:
                newOperator = "/";
                break;
            case ButtonMinus:
                newOperator = "-";
                break;
            case multiplyButton:
                newOperator = "X";
                break;
            case plusButton:
                newOperator = "+";
                break;
        }
        textView.setText(newOperator);
    }

    public void equalEvent(View view) {
        String newNumber = textView.getText().toString();
        double result = 0.0;
        switch (newOperator){
            case "+":
                result = Double.parseDouble(oldOperator) + Double.parseDouble(newNumber);
                break;

            case "X":
                result = Double.parseDouble(oldOperator) * Double.parseDouble(newNumber);
                break;

            case "/":
                result = Double.parseDouble(oldOperator) / Double.parseDouble(newNumber);
                break;

            case "-":
                result = Double.parseDouble(oldOperator) - Double.parseDouble(newNumber);
                break;
        }
        textView.setText(result +"");

    }

    public void acEvent(View view) {
        textView.setText("0");
        isOperator = true;
    }

    public void perEvent(View view) {
        double no = Double.parseDouble(textView.getText().toString())/100;
        textView.setText(no+"");
        isOperator = true;
    }

    public void ButtonC(View view) {
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new  Intent(MainActivity.this,Converter.class);
                startActivity(intent);
            }
        });
    }
}