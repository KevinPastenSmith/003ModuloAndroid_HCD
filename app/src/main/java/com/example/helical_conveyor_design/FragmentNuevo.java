package com.example.helical_conveyor_design;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentNuevo extends Fragment implements View.OnClickListener {

    Button btn_nuevoProyecto;
    Button btn_nuevoSistemaHelicoidal;
    Button btn_nuevoMaterial;
    Button btn_nuevoMotor;
    Button btn_nuevoTransportador;
    Button btn_nuevaHelice;
    Button btn_nuevoTubo;

    View vista;


    public FragmentNuevo() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_nuevo, container, false);

        btn_nuevoProyecto = (Button) vista.findViewById(R.id.btn_nuevoproyecto);
        btn_nuevoProyecto.setOnClickListener(this);

        btn_nuevoSistemaHelicoidal = (Button) vista.findViewById(R.id.btn_nuevosistemahelicoidal);
        btn_nuevoSistemaHelicoidal.setOnClickListener(this);

        btn_nuevoMaterial = (Button) vista.findViewById(R.id.btn_nuevomaterial);
        btn_nuevoMaterial.setOnClickListener(this);

        btn_nuevoMotor = (Button) vista.findViewById(R.id.btn_nuevomotor);
        btn_nuevoMotor.setOnClickListener(this);

        btn_nuevoTransportador = (Button) vista.findViewById(R.id.btn_nuevotransportador);
        btn_nuevoTransportador.setOnClickListener(this);

        btn_nuevaHelice = (Button) vista.findViewById(R.id.btn_nuevahelice);
        btn_nuevaHelice.setOnClickListener(this);

        btn_nuevoTubo = (Button) vista.findViewById(R.id.btn_nuevotubo);
        btn_nuevoTubo.setOnClickListener(this);

        return vista;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_nuevoproyecto:

                Intent intentNuevoProyecto = new Intent(getContext(),Nuevo_Proyecto.class);
                startActivity(intentNuevoProyecto);
                Toast.makeText(getContext(),"ingresando a nuevo proyecto", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevosistemahelicoidal:
                Toast.makeText(getContext(),"ingresando a nuevo sistema helicoidal", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevomaterial:
                Intent intentNuevoMaterial = new Intent(getContext(),Nuevo_Material.class);
                startActivity(intentNuevoMaterial);
                Toast.makeText(getContext(),"ingresando a nuevo material", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevomotor:
                Toast.makeText(getContext(),"ingresando a nuevo motor", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevotransportador:
                Toast.makeText(getContext(),"ingresando a nuevo transportador", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevahelice:
                Intent intentNuevaHelice = new Intent(getContext(),NuevaHelice.class);
                startActivity(intentNuevaHelice);
                Toast.makeText(getContext(),"ingresando a nueva helice", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_nuevotubo:
                Toast.makeText(getContext(),"ingresando a nuevo tubo", Toast.LENGTH_LONG).show();
                break;
        }
    }
}