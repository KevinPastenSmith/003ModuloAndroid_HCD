package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Logueo extends AppCompatActivity {

    private EditText et1_logueo_mail, et2_logueo_password;
    private Button btn1_logueo_ingresar, btn2_logueo_crearCuenta, btn3_logueo_invitado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        et1_logueo_mail = (EditText)findViewById(R.id.et_logueo_mail);
        et2_logueo_password = (EditText)findViewById(R.id.et_logueo_password);

        btn1_logueo_ingresar = (Button)findViewById(R.id.btn_logueo_ingresar);
        btn2_logueo_crearCuenta = (Button)findViewById(R.id.btn_logueo_crearcuenta);
        btn3_logueo_invitado = (Button)findViewById(R.id.btn_logueo_invitado);

    }

    //Metodo ingresar

    public void ingresar (View view){

        String mail = et1_logueo_mail.getText().toString();
        String password = et2_logueo_password.getText().toString();

        if(mail.length()==0){
            Toast.makeText(this,"debes ingresar un mail", Toast.LENGTH_LONG).show();
        }
        if(password.length()==0){
            Toast.makeText(this,"debes ingresar una password", Toast.LENGTH_LONG).show();
        }
        if(mail.length()!=0 && password.length()!=0){
            Toast.makeText(this,"Ingresando...", Toast.LENGTH_LONG).show();
        }

    }

    //Metodo ingresar como invitado

    public void ingresarInvitado (View view){

        Intent invitado = new Intent(this,Invitado.class);
        startActivity(invitado);

    }


}