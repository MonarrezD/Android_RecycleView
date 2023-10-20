package com.example.recycleview_character.Models;

public class Protagonista {

    private String nombre;

    public Protagonista(String nombre, String genero, String estado) {
        this.nombre = nombre;
        this.genero = genero;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstado() {
        return estado;
    }

    private String genero;

    private String estado;
}
