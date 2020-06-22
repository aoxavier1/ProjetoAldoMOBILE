package com.example.projetoaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText edR;
    Button btS;
    Button btM;
    Button btD;
    Button btP;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        edR = (EditText) findViewById(R.id.editText);
        bt = (Button) findViewById(R.id.button3);
        btS = (Button) findViewById(R.id.button4);
        btM = (Button) findViewById(R.id.button6);
        btD = (Button) findViewById(R.id.button8);
        btP = (Button) findViewById(R.id.button7);

// Ação de Somar
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                res = v1 + v2;

                edR.setText(res.toString());
            }
        });
// Ação para Subtração
        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                res = v1 - v2;

                edR.setText(res.toString());
            }
        });
// Ação para Multiplição
        btM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                res = v1 * v2;

                edR.setText(res.toString());
            }
        });
// Ação para Dividir
        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                res = v1 / v2;

                edR.setText(res.toString());
            }
        });
// Ação para Potencia
        btP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                res = (v1 * v2)/100;

                edR.setText(res.toString());
            }
        });

     }
    }
