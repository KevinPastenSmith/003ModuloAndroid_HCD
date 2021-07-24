package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdministrarDatos extends AppCompatActivity {

    private Button btn1_adminDatosUsuario, btn2_adminProyectGuardados, btn3_adminProyectActual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_datos);

        btn1_adminDatosUsuario = (Button)findViewById(R.id.btn_adminDatos_adminDatosUsuario);
        btn2_adminProyectGuardados = (Button)findViewById(R.id.btn_adminDatos_adminProyectGuardados);
        btn2_adminProyectGuardados = (Button)findViewById(R.id.btn_adminDatos_adminProyectGuardados);

    }

    //Metodo button "administrar datos de usuario"
    public void btn_administrarDatosUsuario (View view){

        Intent administrarDatosUsuario = new Intent(this,AdministrarDatosUsuario.class);
        startActivity(administrarDatosUsuario);
    }

    //Metodo button "administrar proyectos guardados"
    public void btn_administrarProyectosGuardados (View view){

        Intent administrarProyectosGuardados = new Intent(this,AdministrarProyectosGuardados.class);
        startActivity(administrarProyectosGuardados);
    }


}