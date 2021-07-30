package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Nuevo_Material extends AppCompatActivity {

    private TextView  tv2_selecTipoMezcla, tv3_ClasificacionMaterial, tv4_densidad, tv5_abrasividad, tv6_fluidez, tv7_tipoMaterial, tv8_categoriaPeso;
    private EditText et1_nombreMterial;
    private RadioButton rb1_homogenea, rb2_heterogenea;
    private Spinner spinner1_clasificacionmaterial;
    private ImageButton ibtn1_clasificacionMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_material);

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

        ArrayList<String> clasificacionesList = new ArrayList<String>();
        clasificacionesList.add("Seleccione Clasificacion");
        for (int i=1; i<=5;i++) {
            clasificacionesList.add("Clasificaion "+i);
        }

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, clasificacionesList);
        spinner1_clasificacionmaterial.setAdapter(adapter);

        spinner1_clasificacionmaterial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }
}
