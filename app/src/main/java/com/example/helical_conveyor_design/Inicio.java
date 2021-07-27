package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    private TextView btn1_inicio_nuevo, btn2_inicio_administrarDatos, btn3_inicio_proyectosComunidad;

    FragmentNuevo fragmentNuevo;
    FragmentAdministrarDatos fragmentAdministrarDatos;
    FragmentProyectosComunidad fragmentProyectosComunidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        fragmentNuevo = new FragmentNuevo();
        fragmentAdministrarDatos = new FragmentAdministrarDatos();
        fragmentProyectosComunidad = new FragmentProyectosComunidad();

        getSupportFragmentManager().beginTransaction().add(R.id.frameContenido, fragmentNuevo).commit();



        btn1_inicio_nuevo = (Button) findViewById(R.id.btn_inicio_nuevo);
        btn2_inicio_administrarDatos = (Button) findViewById(R.id.btn_inicio_administrarProyectos);
        btn3_inicio_proyectosComunidad = (Button) findViewById(R.id.btn_inicio_proyectosComunidad);

    }

    //Metodo button "nuevo"
    public void btn_nuevo (View view){

        Intent nuevo = new Intent(this,FragmentNuevo.class);
        startActivity(nuevo);
    }

    //Metodo button "proyectos de la comunidad"
    public void btn_proyectosComunidad (View view){

        Intent proyectosComunidad = new Intent(this,ProyectosComunidad.class);
        startActivity(proyectosComunidad);
    }

    //Metodo button "proyectos de la comunidad"
    public void btn_administrarDatos (View view){

        Intent administrarDatos = new Intent(this,AdministrarDatos.class);
        startActivity(administrarDatos);
    }



}