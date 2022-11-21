package com.example.moverseentreventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {
    TextView nom,pater,mater;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        nom=findViewById(R.id.nom);
        pater=findViewById(R.id.pater);
        mater=findViewById(R.id.mater);
        datos=getIntent().getExtras();
        nom.setText(datos.getString("nombre"));
        pater.setText(datos.getString("paterno"));
        mater.setText(datos.getString("materno"));
    }
    public void regre(View view) {
        Intent v4 = new Intent(Ventana2.this,MainActivity.class);
        startActivity(v4);
    }
    public void datos(View view) {
        Intent v5 = new Intent(Ventana2.this,Ventana4.class);
        startActivity(v5);
    }
}