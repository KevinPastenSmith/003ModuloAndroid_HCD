package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Nuevo_Material extends AppCompatActivity {

    private TextView tv1_nombreMaterial, tv2_selecTipoMezcla, tv3_ClasificacionMaterial, tv4_densidad, tv5_abrasividad, tv6_fluidez, tv7_tipoMaterial, tv8_categoriaPeso;
    private EditText et1_nombreMterial;
    private RadioButton rb1_homogenea, rb2_heterogenea;
    private Spinner spinner1_clasificacionmaterial;
    private ImageButton ibtn1_clasificacionMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_material);

        tv1_nombreMaterial = (TextView) findViewById(R.id.tv_nuevo_material_nombreMaterial);
        tv2_selecTipoMezcla = (TextView) findViewById(R.id.tv_nuevo_material_selecTipoMezcla);
        tv3_ClasificacionMaterial = (TextView) findViewById(R.id.tv_ClasificacionMaterial);
        tv4_densidad = (TextView) findViewById(R.id.tv_densidad);
        tv5_abrasividad = (TextView) findViewById(R.id.tv_abrasividad);
        tv6_fluidez = (TextView) findViewById(R.id.tv_fluidez);
        tv7_tipoMaterial = (TextView) findViewById(R.id.tv_tipoMaterial);
        tv8_categoriaPeso = (TextView) findViewById(R.id.tv_categoriaPeso);

        et1_nombreMterial = (EditText) findViewById(R.id.et_nombreMaterial);

        rb1_homogenea = (RadioButton) findViewById(R.id.rb_mezclaHomogenea);
        rb2_heterogenea = (RadioButton) findViewById(R.id.rb_mezclaHeterogenea);

        ibtn1_clasificacionMaterial = (ImageButton) findViewById(R.id.ibtn_clasificacionMaterial);

        spinner1_clasificacionmaterial = (Spinner) findViewById(R.id.sp_clasificacionMaterial);

       String [] clasificacionMaterial = {"clasificacion 1", "clasificacion 2", "clasificacion 3", "clasificacion 4", "clasificacion 5"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_nuevomaterial_clasificacionmaterial, clasificacionMaterial);
        spinner1_clasificacionmaterial.setAdapter(adapter);





    }
}
