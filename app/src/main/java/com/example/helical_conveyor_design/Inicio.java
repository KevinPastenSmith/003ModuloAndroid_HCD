package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inicio extends AppCompatActivity implements View.OnClickListener{

    private TextView btn1_inicio_nuevo, btn2_inicio_administrarDatos, btn3_inicio_proyectosComunidad;

    FragmentNuevo fragment_inicio_nuevo;
    FragmentAdministrarDatos fragment_inicio_AdministrarDatos;
    FragmentProyectosComunidad fragment_inicio_ProyectosComunidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        fragment_inicio_nuevo = new FragmentNuevo();
        fragment_inicio_AdministrarDatos = new FragmentAdministrarDatos();
        fragment_inicio_ProyectosComunidad = new FragmentProyectosComunidad();

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_Inicio, fragment_inicio_nuevo).commit();

        btn1_inicio_nuevo = (Button) findViewById(R.id.btn_inicio_nuevo);
        btn2_inicio_administrarDatos = (Button) findViewById(R.id.btn_inicio_administrarProyectos);
        btn3_inicio_proyectosComunidad = (Button) findViewById(R.id.btn_inicio_proyectosComunidad);

        btn1_inicio_nuevo.setOnClickListener(this);
        btn2_inicio_administrarDatos.setOnClickListener(this);
        btn3_inicio_proyectosComunidad.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (v.getId()){

            case R.id.btn_inicio_nuevo:
                fragmentTransaction.replace(R.id.framelayout_Inicio, fragment_inicio_nuevo);
                break;
            case R.id.btn_inicio_administrarProyectos:
                fragmentTransaction.replace(R.id.framelayout_Inicio, fragment_inicio_AdministrarDatos);
                break;
            case R.id.btn_inicio_proyectosComunidad:
                fragmentTransaction.replace(R.id.framelayout_Inicio, fragment_inicio_ProyectosComunidad);
                break;

        }

        fragmentTransaction.commit();

    }
}