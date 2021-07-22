package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Invitado extends AppCompatActivity {

    private EditText et1_invitado_nickName;
    private TextView tv1_invitado_hola;
    private Button btn1_invitado_nuevo,btn2_invitado_adminProyectActual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado);

        et1_invitado_nickName = (EditText) findViewById(R.id.et_invitado_nickname);
        tv1_invitado_hola = (TextView) findViewById(R.id.tv_invitado_holainvitado);
        btn1_invitado_nuevo = (Button) findViewById(R.id.btn_invitado_nuevo);
        btn2_invitado_adminProyectActual = (Button) findViewById(R.id.btn_invitado_adminproyectactual);

    }

    //Metodo button "nuevo"
    public void btn_nuevo (View view){

        Intent nuevo = new Intent(this,Nuevo.class);
        startActivity(nuevo);
    }


}