package com.example.helical_conveyor_design;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentAdministrarDatos extends Fragment implements View.OnClickListener {

    Button btn1_administrarDatosUsuario, btn2_administrarProyectosGuardados, btn3_administrarProyectoActual;
    View vista_fragmentoAdministrarDatos;

    public FragmentAdministrarDatos() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista_fragmentoAdministrarDatos = inflater.inflate(R.layout.fragment_administrar_datos, container, false);

        btn1_administrarDatosUsuario = (Button) vista_fragmentoAdministrarDatos.findViewById(R.id.btn_administrarDatosUsuario);
        btn1_administrarDatosUsuario.setOnClickListener(this);

        btn2_administrarProyectosGuardados = (Button) vista_fragmentoAdministrarDatos.findViewById(R.id.btn_administrarProyectosGuardados);
        btn2_administrarProyectosGuardados.setOnClickListener(this);

        btn3_administrarProyectoActual = (Button) vista_fragmentoAdministrarDatos.findViewById(R.id.btn_administrarProyectoActual);
        btn3_administrarProyectoActual.setOnClickListener(this);

        return vista_fragmentoAdministrarDatos;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_administrarDatosUsuario:

                Intent intentAdministrarDatosUsuario = new Intent(getContext(), AdministrarDatosUsuario.class);
                startActivity(intentAdministrarDatosUsuario);
                break;

            case R.id.btn_administrarProyectosGuardados:

                Intent intentAdministrarProyectosGuardados = new Intent(getContext(), AdministrarProyectosGuardados.class);
                startActivity(intentAdministrarProyectosGuardados);
                break;

        }

    }
}