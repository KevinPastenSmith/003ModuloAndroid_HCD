package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Invitado extends AppCompatActivity {


    private TextView tv1_invitado_hola;
    private Button btn1_invitado_nuevo,btn2_invitado_adminProyectActual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado);

        tv1_invitado_hola = (TextView) findViewById(R.id.tv_invitado_holainvitado);
        btn1_invitado_nuevo = (Button) findViewById(R.id.btn_invitado_nuevo);
        btn2_invitado_adminProyectActual = (Button) findViewById(R.id.btn_invitado_adminproyectactual);

        String nickInvitado = getIntent().getStringExtra("nickInvitadoLogueo");
        tv1_invitado_hola.setText("Hola "+nickInvitado);

    }

    //Metodo button "nuevo"
    public void btnNuevo (View view){

        Intent nuevo = new Intent(this,Nuevo.class);
        startActivity(nuevo);
    }


}