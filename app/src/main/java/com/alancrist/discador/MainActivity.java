package com.alancrist.discador;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textCamp = (TextView) findViewById(R.id.textView2);
        Button num0 = (Button) findViewById(R.id.buttonNum0);
        Button num1 = (Button) findViewById(R.id.buttonNum1);
        Button num2 = (Button) findViewById(R.id.buttonNum2);
        Button num3 = (Button) findViewById(R.id.buttonNum3);
        Button num4 = (Button) findViewById(R.id.buttonNum4);
        Button num5 = (Button) findViewById(R.id.buttonNum5);
        Button num6 = (Button) findViewById(R.id.buttonNum6);
        Button num7 = (Button) findViewById(R.id.buttonNum7);
        Button num8 = (Button) findViewById(R.id.buttonNum8);
        Button num9 = (Button) findViewById(R.id.buttonNum9);
        Button num10 = (Button) findViewById(R.id.buttonNum10);
        Button num11 = (Button) findViewById(R.id.buttonNum11);
        Button clean = (Button) findViewById(R.id.buttonClean);
        Button call = (Button) findViewById(R.id.buttonCall);

        num0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("9");
            }
        });

        num10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("*");
            }
        });

        num11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.append("#");
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textCamp.setText("");
            }
        });

        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });


    }
}
