package com.example.veganosyadb.entities;

import androidx.room.Entity;

@Entity(primaryKeys = {"rec_id", "ing_id"})
public class IngredienteRecetaCrossRef {
    private int rec_id;
    private int ing_id;
    private int ing_cantidad;
    private int unidad;

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public int getIng_cantidad() {
        return ing_cantidad;
    }

    public void setIng_cantidad(int ing_cantidad) {
        this.ing_cantidad = ing_cantidad;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }
}
