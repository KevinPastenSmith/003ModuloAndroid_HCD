package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class CrearCuenta extends AppCompatActivity {


    private EditText et1_creacuenta_mail, et2_crearcuenta_password,et3_crearcuenta_password2, et4_creacuente_nickName,et5_crearcuenta_profesionOficio;
    private Button btn1_crearcuenta_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta);

        et1_creacuenta_mail = (EditText) findViewById(R.id.et_crearcuenta_mail);
        et2_crearcuenta_password = (EditText) findViewById(R.id.et_crearcuenta_password);
        et3_crearcuenta_password2 = (EditText) findViewById(R.id.et_crearcuenta_password2);
        et4_creacuente_nickName = (EditText) findViewById(R.id.et_crearcuenta_nickname);
        et5_crearcuenta_profesionOficio = (EditText) findViewById(R.id.et_crearcuenta_profesionoficio);

        btn1_crearcuenta_registrar = (Button) findViewById(R.id.btn_crearcuenta_registrar);

    }
}
