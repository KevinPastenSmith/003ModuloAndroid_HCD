package com.example.helical_conveyor_design.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.view.Logueo;


public class CrearCuenta extends AppCompatActivity {


    private EditText et1_creacuenta_mail, et2_crearcuenta_password,et3_crearcuenta_password2, et4_creacuente_nickUsuario,et5_crearcuenta_profesionOficio;
    private Button btn1_crearcuenta_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta);

        et1_creacuenta_mail = (EditText) findViewById(R.id.et_crearcuenta_mail);
        et2_crearcuenta_password = (EditText) findViewById(R.id.et_crearcuenta_password);
        et3_crearcuenta_password2 = (EditText) findViewById(R.id.et_crearcuenta_password2);
        et4_creacuente_nickUsuario = (EditText) findViewById(R.id.et_crearCuenta_nickUsuario);
        et5_crearcuenta_profesionOficio = (EditText) findViewById(R.id.et_crearcuenta_profesionoficio);

        btn1_crearcuenta_registrar = (Button) findViewById(R.id.btn_crearcuenta_registrar);

    }

    //Metodo Registrar
    public void registrarCuenta (View view){

        String mailCrearCuenta = et1_creacuenta_mail.getText().toString();
        String passwordCrearCuenta = et2_crearcuenta_password.getText().toString();
        String password2CrearCuenta = et3_crearcuenta_password2.getText().toString();
        String nickUsuarioCrearCuenta = et4_creacuente_nickUsuario.getText().toString();
        String profesionOficioCrearCuenta = et5_crearcuenta_profesionOficio.getText().toString();


        if (mailCrearCuenta.length()!=0 && passwordCrearCuenta.length()!=0 && password2CrearCuenta.length()!=0 && nickUsuarioCrearCuenta.length()!=0 && profesionOficioCrearCuenta.length()!=0){

                SharedPreferences preferenciaPassword = getSharedPreferences("password", Context.MODE_PRIVATE);
                SharedPreferences.Editor editorPassword = preferenciaPassword.edit();
                editorPassword.putString(mailCrearCuenta, passwordCrearCuenta);
                editorPassword.commit();

                Toast.makeText(this, getString(R.string.toast_cuentaCreada), Toast.LENGTH_LONG).show();

                Intent cuentaRegistrada = new Intent(this, Logueo.class);
                startActivity(cuentaRegistrada);



        }
        else{
            Toast.makeText(this, getString(R.string.toast_rellenarCampos), Toast.LENGTH_LONG).show();
        }


    }



}
