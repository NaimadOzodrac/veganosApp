package com.example.veganosyadb.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Ingrediente {

    public Ingrediente(int ing_id, String ing_nombre,
                       String descripcion, boolean vegano_estricto) {
        this.ing_id = ing_id;
        this.ing_nombre = ing_nombre;
        this.descripcion = descripcion;
        this.vegano_estricto = vegano_estricto;
    }

    @PrimaryKey
    private int ing_id;
    private String ing_nombre;
    private String descripcion;
    private boolean vegano_estricto;

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public String getIng_nombre() {
        return ing_nombre;
    }

    public void setIng_nombre(String ing_nombre) {
        this.ing_nombre = ing_nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVegano_estricto() {
        return vegano_estricto;
    }

    public void setVegano_estricto(boolean vegano_estricto) {
        this.vegano_estricto = vegano_estricto;
    }

}
