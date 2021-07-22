package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        tv1 = (TextView) findViewById(R.id.tv_inicio_nuevo);
        tv2 = (TextView) findViewById(R.id.tv_inicio_administrarDatos);
        tv3 = (TextView) findViewById(R.id.tv_inicio_proyectosComunidad);

    }
}