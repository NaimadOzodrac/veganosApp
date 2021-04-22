package com.example.veganosyadb.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Receta {

    public Receta(int rec_id, String rec_nombre, String descripcion,
                  String instrucciones, boolean vegano_estricto, String fuente) {
        this.rec_id = rec_id;
        this.rec_nombre = rec_nombre;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.vegano_estricto = vegano_estricto;
        this.fuente = fuente;
    }

    @PrimaryKey
    private int rec_id;
    private String rec_nombre;
    private String descripcion;
    private String instrucciones;
    private boolean vegano_estricto;
    private String fuente;

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_nombre() {
        return rec_nombre;
    }

    public void setRec_nombre(String rec_nombre) {
        this.rec_nombre = rec_nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public boolean isVegano_estricto() {
        return vegano_estricto;
    }

    public void setVegano_estricto(boolean vegano_estricto) {
        this.vegano_estricto = vegano_estricto;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
