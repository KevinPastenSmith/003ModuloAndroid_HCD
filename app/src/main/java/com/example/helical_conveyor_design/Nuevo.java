package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nuevo extends AppCompatActivity {

    private TextView tvn1, tvn2, tvn3, tvn4, tvn5, tvn6, tvn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        tvn1 = (TextView) findViewById(R.id.tv_nuevo_nuevoProyecto);
        tvn2 = (TextView) findViewById(R.id.tv_nuevo_nuevoSisTransHeli);
        tvn3 = (TextView) findViewById(R.id.tv_nuevo_nuevoMaterial);
        tvn4 = (TextView) findViewById(R.id.tv_nuevo_nuevoMotor);
        tvn5 = (TextView) findViewById(R.id.tv_nuevo_nuevoTransportador);
        tvn6 = (TextView) findViewById(R.id.tv_nuevo_nuevaHelice);
        tvn7 = (TextView) findViewById(R.id.tv_nuevo_nuevoTubo);

    }
}