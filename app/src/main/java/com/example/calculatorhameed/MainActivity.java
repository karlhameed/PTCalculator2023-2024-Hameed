package com.example.calculatorhameed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num1;
    EditText num2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.txtResult);
        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        addition = (Button) findViewById(R.id.btnadd);
        subtraction = (Button) findViewById(R.id.btnsub);
        division = (Button) findViewById(R.id.btndiv);
        multiplication = (Button) findViewById(R.id.btnmul);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // num1.getText().toString();
                // int myNum1 = Integer.parseInt(num1.getText().toString());

                double mynum1 = Double.parseDouble(num1.getText().toString());
                double mynum2 = Double.parseDouble(num2.getText().toString());
                double sum = mynum1 + mynum2;

                result.setText(String.valueOf(sum));

            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mynum1 = Double.parseDouble(num1.getText().toString());
                double mynum2 = Double.parseDouble(num2.getText().toString());
                double dif = mynum1 - mynum2;

                result.setText(String.valueOf(dif));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double mynum1 = Double.parseDouble(num1.getText().toString());
                double mynum2 = Double.parseDouble(num2.getText().toString());
                double mul = mynum1 * mynum2;

                result.setText(String.valueOf(mul));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mynum1 = Double.parseDouble(num1.getText().toString());
                double mynum2 = Double.parseDouble(num2.getText().toString());
                double div = mynum1 / mynum2;

                result.setText(String.valueOf(div));
            }
        });
    }
}
