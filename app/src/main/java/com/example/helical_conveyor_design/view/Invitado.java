package com.example.helical_conveyor_design.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.view.FragmentAdministrarProyectoActual;
import com.example.helical_conveyor_design.view.FragmentNuevo;

public class Invitado extends AppCompatActivity {


    private TextView tv1_invitado_hola;
    private Button btn1_invitado_nuevo,btn2_invitado_adminProyectActual;
    FragmentNuevo fragment_invitado_nuevo;
    FragmentAdministrarProyectoActual fragment_invitado_administrarProyectActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado);

        tv1_invitado_hola = (TextView) findViewById(R.id.tv_invitado_holainvitado);
        btn1_invitado_nuevo = (Button) findViewById(R.id.btn_invitado_nuevo);
        btn2_invitado_adminProyectActual = (Button) findViewById(R.id.btn_invitado_adminproyectactual);

        fragment_invitado_nuevo = new FragmentNuevo();
        fragment_invitado_administrarProyectActual = new FragmentAdministrarProyectoActual();

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_invitado, fragment_invitado_nuevo).commit();

        String nickInvitado = getIntent().getStringExtra("nickInvitadoLogueo");
        tv1_invitado_hola.setText("Hola "+nickInvitado);


    }

    public void onClick(View view) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){

            case R.id.btn_invitado_nuevo:
                fragmentTransaction.replace(R.id.framelayout_invitado, fragment_invitado_nuevo);
                break;
            case R.id.btn_invitado_adminproyectactual:
                fragmentTransaction.replace(R.id.framelayout_invitado, fragment_invitado_administrarProyectActual);
                break;

        }

        fragmentTransaction.commit();

    }
}