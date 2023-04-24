package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,sub,mul,div,modu;
    int number1,number2;
    TextView result_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        result_text = findViewById(R.id.textView_result);
        add=(Button) findViewById(R.id.button);
        sub=(Button) findViewById(R.id.button2);
        mul=(Button) findViewById(R.id.button3);
        div=(Button) findViewById(R.id.button4);
        modu=(Button) findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                double output= n1+n2;
                String outp= String.valueOf(output);
                result_text.setText(outp);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float output= n1-n2;
                String outp= String.valueOf(output);
                result_text.setText(outp);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float output= n1*n2;
                String outp= String.valueOf(output);
                result_text.setText(outp);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float output= n1/n2;
                String outp= String.valueOf(output);
                result_text.setText(outp);
            }
        });
        modu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float output= n1%n2;
                String outp= String.valueOf(output);
                result_text.setText(outp);
            }
        });

        }
    }
