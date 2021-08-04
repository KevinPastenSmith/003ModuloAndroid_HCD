package com.example.helical_conveyor_design.model;

public class RecyclerProyectosComunidad {

    public String nombreProyecto, mailUsuario, color;


    public RecyclerProyectosComunidad(String nombreProyecto, String mailUsuario, String color) {
        this.nombreProyecto = nombreProyecto;
        this.mailUsuario = mailUsuario;
        this.color = color;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
