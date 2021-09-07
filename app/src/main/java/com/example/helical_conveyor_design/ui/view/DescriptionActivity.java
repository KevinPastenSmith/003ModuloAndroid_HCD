package com.example.helical_conveyor_design.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.data.model.RecyclerProyectosComunidad;

public class DescriptionActivity extends AppCompatActivity {

    TextView nombreProyectoDescriptionTextView, mailUsuarioDescriptionTextView;

//cambio de prueba


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        RecyclerProyectosComunidad elements = (RecyclerProyectosComunidad) getIntent().getSerializableExtra("RecyclerProyectosComunidad");
        nombreProyectoDescriptionTextView = findViewById(R.id.nombreProyectoDescriptionTextView);
        mailUsuarioDescriptionTextView = findViewById(R.id.mailUsuarioDescriptionTextView);

        nombreProyectoDescriptionTextView.setText(elements.getNombreProyecto());
        nombreProyectoDescriptionTextView.setTextColor(Color.parseColor(elements.getColor()));

        mailUsuarioDescriptionTextView.setText(elements.getMailUsuario());
        mailUsuarioDescriptionTextView.setTextColor(Color.GRAY);

    }
}