package com.example.veganosyadb.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Plato {

    public Plato(int plat_id, String plat_nombre, String descripcion) {
        this.plat_id = plat_id;
        this.plat_nombre = plat_nombre;
        this.descripcion = descripcion;
    }

    @PrimaryKey
    private int plat_id;
    private String plat_nombre;
    private String descripcion;

    public int getPlat_id() {
        return plat_id;
    }

    public void setPlat_id(int plat_id) {
        this.plat_id = plat_id;
    }

    public String getPlat_nombre() {
        return plat_nombre;
    }

    public void setPlat_nombre(String plat_nombre) {
        this.plat_nombre = plat_nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
