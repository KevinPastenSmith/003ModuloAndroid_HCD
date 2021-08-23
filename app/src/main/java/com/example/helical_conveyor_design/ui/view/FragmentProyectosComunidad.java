package com.example.helical_conveyor_design.ui.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.data.model.RecyclerProyectosComunidad;
import com.example.helical_conveyor_design.ui.viewmodel.RecyclerProyectosComunidadAdapter;

import java.util.ArrayList;
import java.util.List;


public class FragmentProyectosComunidad extends Fragment {

    List<RecyclerProyectosComunidad> elements;
    View vista;

    public FragmentProyectosComunidad() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_proyectos_comunidad, container, false);
        init();
        return vista;
    }

    private void init() {
        elements = new ArrayList<>();

        for (int i=1; i<=10;i++) {
            elements.add(new RecyclerProyectosComunidad("Proyecto Generico "+i,"mailgenerico."+i+"@gmail.com", "#775447"));
        }

        RecyclerProyectosComunidadAdapter listAdapter = new RecyclerProyectosComunidadAdapter(elements, getContext(), new RecyclerProyectosComunidadAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(RecyclerProyectosComunidad item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = vista.findViewById(R.id.recyclerview_proyectosComunidad);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(listAdapter);
    }

    private void moveToDescription(RecyclerProyectosComunidad item) {
        Intent intent = new Intent(getContext(), DescriptionActivity.class);
        intent.putExtra("RecyclerProyectosComunidad",item);
        startActivity(intent);
    }


}