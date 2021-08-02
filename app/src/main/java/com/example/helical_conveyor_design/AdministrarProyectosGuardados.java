package com.example.helical_conveyor_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdministrarProyectosGuardados extends AppCompatActivity {

    TextView proyectosGuardados;
    ListView listViewProyectosGuardados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_proyectos_guardados);

        listViewProyectosGuardados = (ListView) findViewById(R.id.lv_proyectosguardados);

        ArrayList<String> listaProyectosGuardados = new ArrayList<>();
        listaProyectosGuardados.add("Proyecto separador de solidos");
        listaProyectosGuardados.add("Proyecto transportador de 65°");
        listaProyectosGuardados.add("Proyecto orujo viña Siegel");

        for (int i=1; i<=10;i++) {
            listaProyectosGuardados.add("Proyecto estandar "+i);
        }

        ArrayAdapter adapterProyectosGuardados = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaProyectosGuardados);
        listViewProyectosGuardados.setAdapter(adapterProyectosGuardados);

        listViewProyectosGuardados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"has seleccionado "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}