package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Nuevo extends AppCompatActivity {

    private Button btn1_nuevoProyecto, btn2_nuevoSisTransHeli, btn3_nuevoMaterial, btn4_nuevoMotor, btn5_nuevoTransportador, btn6_nuevaHelice, btn7_nuevoTubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        btn1_nuevoProyecto = (Button) findViewById(R.id.btn_nuevo_nuevoproyecto);
        btn2_nuevoSisTransHeli = (Button) findViewById(R.id.btn_nuevo_nuevoSistTransHeli);
        btn3_nuevoMaterial = (Button) findViewById(R.id.btn_nuevo_nuevomaterial);
        btn4_nuevoMotor = (Button) findViewById(R.id.btn_nuevo_nuevomotor);
        btn5_nuevoTransportador = (Button) findViewById(R.id.btn_nuevo_nuevotransportador);
        btn6_nuevaHelice = (Button) findViewById(R.id.btn_nuevo_nuevahelice);
        btn7_nuevoTubo = (Button) findViewById(R.id.btn_nuevo_nuevotubo);

    }
}