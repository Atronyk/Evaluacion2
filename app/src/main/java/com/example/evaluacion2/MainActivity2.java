package com.example.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button btn2,btn1;
    private EditText et1;
    private CheckBox cb1, cb2, cb3;
    private RadioButton rb1, rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        anterior();
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        et1 = (EditText) findViewById(R.id.et1);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);


        comprobarRB1();
        comprobarRB2();
        capturarID();
    }
    public void comprobarCbox(View v){
        String comprobarCB1 = "";
        String comprobarCB2 = "";
        String comprobarCB3 = "";
        String etiqueta = null;
        if (cb1.isChecked()==true)
            comprobarCB1 = cb1.getText().toString();
        if (cb2.isChecked()==true)
            comprobarCB2 = cb2.getText().toString();
        if (cb3.isChecked()==true)
            comprobarCB3 = cb3.getText().toString();
        if (comprobarCB1=="" && comprobarCB2=="" && comprobarCB3=="") {
            Toast.makeText(MainActivity2.this, "Usted no ha seleccionado ninguna opción!!!", Toast.LENGTH_SHORT).show();
        }else {
            etiqueta = (comprobarCB1+" "+comprobarCB2+" "+comprobarCB3);
            Toast.makeText(MainActivity2.this, "Usted a seleccionado : "+etiqueta, Toast.LENGTH_SHORT).show();
        }

    }

    public void capturarID(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Ingrese una hora", Toast.LENGTH_SHORT).show();
                }else{
                    int id = Integer.parseInt(et1.getText().toString());
                    Toast.makeText(MainActivity2.this, "Su reserva es a las :  "+id, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void  comprobarRB1(){
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipo = rb1.getText().toString();
                Toast.makeText(MainActivity2.this, "El RadioButton seleccionado es: "+tipo, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void  comprobarRB2(){
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipo = rb2.getText().toString();
                Toast.makeText(MainActivity2.this, "El RadioButton seleccionado es: "+tipo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void comprobarRadioButton(View v){
        String tipo = "";
        if (rb1.isChecked()){
            tipo = rb1.getText().toString();
        }else{
            tipo = rb2.getText().toString();
        }
        Toast.makeText(MainActivity2.this, "El RadioButton seleccionado es: "+tipo, Toast.LENGTH_SHORT).show();
    }

    public void anterior(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(ant);

            }
        });

    }
 }
