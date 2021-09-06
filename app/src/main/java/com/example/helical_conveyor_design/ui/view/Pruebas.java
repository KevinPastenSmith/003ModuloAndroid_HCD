package com.example.helical_conveyor_design.ui.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.ui.view.nuevo.NuevaHelice;
import com.example.helical_conveyor_design.ui.view.nuevo.NuevoMaterial;
import com.example.helical_conveyor_design.ui.view.nuevo.NuevoProyecto;

public class Pruebas extends Fragment implements View.OnClickListener{
    ImageButton ibtn_nuevahelice,ibtn_nuevoMotor, ibtn_nuevoProyecto, ibtn_nuevoSistemaHelicoidal, ibtn_nuevoMaterial, ibtn_nuevoTransportador, ibtn_nuevoTubo;

    View vista;

    public Pruebas() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_nuevo, container, false);

        ibtn_nuevoProyecto = vista.findViewById(R.id.ibtn_nuevoproyecto);
        ibtn_nuevoProyecto.setOnClickListener(this);

        ibtn_nuevoSistemaHelicoidal = vista.findViewById(R.id.ibtn_nuevosistemahelicoidal);
        ibtn_nuevoSistemaHelicoidal.setOnClickListener(this);

        ibtn_nuevoMaterial = vista.findViewById(R.id.ibtn_nuevomaterial);
        ibtn_nuevoMaterial.setOnClickListener(this);

        ibtn_nuevoMotor = vista.findViewById(R.id.ibtn_nuevomotor);
        ibtn_nuevoMotor.setOnClickListener(this);

        ibtn_nuevoTransportador = vista.findViewById(R.id.ibtn_nuevotransportador);
        ibtn_nuevoTransportador.setOnClickListener(this);

        ibtn_nuevahelice = vista.findViewById(R.id.ibtn_nuevahelice);
        ibtn_nuevahelice.setOnClickListener(this);

        ibtn_nuevoTubo = vista.findViewById(R.id.ibtn_nuevotubo);
        ibtn_nuevoTubo.setOnClickListener(this);

        return vista;
    }
    //prueba para el
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ibtn_nuevoproyecto:

                Intent intentNuevoProyecto = new Intent(getContext(), NuevoProyecto.class);
                startActivity(intentNuevoProyecto);
                Toast.makeText(getContext(),"ingresando a nuevo proyecto", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevosistemahelicoidal:
                Toast.makeText(getContext(),"ingresando a nuevo sistema helicoidal", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevomaterial:
                Intent intentNuevoMaterial = new Intent(getContext(), NuevoMaterial.class);
                startActivity(intentNuevoMaterial);
                Toast.makeText(getContext(),"ingresando a nuevo material", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevomotor:
                Toast.makeText(getContext(),"ingresando a nuevo motor", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevotransportador:
                Toast.makeText(getContext(),"ingresando a nuevo transportador", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevahelice:
                Intent intentNuevaHelice = new Intent(getContext(), NuevaHelice.class);
                startActivity(intentNuevaHelice);
                Toast.makeText(getContext(),"ingresando a nueva helice", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ibtn_nuevotubo:
                Toast.makeText(getContext(),"ingresando a nuevo tubo", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
