package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Logueo extends AppCompatActivity {

    private EditText et1_logueo_mail, et2_logueo_password, et3_logueo_nickInvitado;
    private Button btn1_logueo_ingresar, btn2_logueo_crearCuenta, btn3_logueo_invitado;
    private SharedPreferences preferenciaNickInvitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        et1_logueo_mail = (EditText)findViewById(R.id.et_logueo_mail);
        et2_logueo_password = (EditText)findViewById(R.id.et_logueo_password);
        et3_logueo_nickInvitado = (EditText)findViewById(R.id.et_logueo_nickInvitado);

        btn1_logueo_ingresar = (Button)findViewById(R.id.btn_logueo_ingresar);
        btn2_logueo_crearCuenta = (Button)findViewById(R.id.btn_logueo_crearcuenta);
        btn3_logueo_invitado = (Button)findViewById(R.id.btn_logueo_invitado);

        preferenciaNickInvitado = getSharedPreferences("sharedPreferences_nickInvitado", Context.MODE_PRIVATE);
        et3_logueo_nickInvitado.setText(preferenciaNickInvitado.getString("nickInvitado",""));

    }

    //Metodo Boton ingresar como invitado

    public void ingresarInvitado (View view){

        SharedPreferences preferenciaInvitado = getSharedPreferences("sharedPreferences_nickInvitado", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferenciaInvitado.edit();
        editor.putString("nickInvitado",et3_logueo_nickInvitado.getText().toString());
        editor.commit();

        Intent invitado = new Intent(this,Invitado.class);
        invitado.putExtra("nickInvitadoLogueo",et3_logueo_nickInvitado.getText().toString());
        startActivity(invitado);



    }

    //Metodo ingresar

    public void btn_ingresar (View view){

        String mailLogueo = et1_logueo_mail.getText().toString();
        String passwordLogueo = et2_logueo_password.getText().toString();

        SharedPreferences logueo = getSharedPreferences("password" , Context.MODE_PRIVATE);
        String passwordPreferencia = logueo.getString(mailLogueo, "");

        Intent ingresarIntent = new Intent(this,Inicio.class);
        startActivity(ingresarIntent);

/*
        if (passwordPreferencia.length()==0){
            Toast.makeText(this,getString(R.string.toast_logueo_noCuenta_String),Toast.LENGTH_LONG).show();
        }
        if(mailLogueo.length()==0){
            Toast.makeText(this,"debes ingresar un mail", Toast.LENGTH_LONG).show();
        }
        if(passwordLogueo.length()==0){
            Toast.makeText(this,"debes ingresar una password", Toast.LENGTH_LONG).show();
        }


        if(mailLogueo.length()!=0 && passwordLogueo.length()!=0){
            Toast.makeText(this,"Ingresando...", Toast.LENGTH_SHORT).show();

            Intent ingresarIntent = new Intent(this,Inicio.class);
            startActivity(ingresarIntent);
        }
*/
    }

    //Metodo crear cuenta
    public void btn_crearCuenta (View view){
        Intent nuevaCuenta = new Intent(this, CrearCuenta.class);
        startActivity(nuevaCuenta);
    }

}