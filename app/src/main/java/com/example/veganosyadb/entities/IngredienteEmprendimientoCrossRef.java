package com.example.veganosyadb.entities;

import androidx.room.Entity;

@Entity(primaryKeys = {"emp_id", "ing_id"})
public class IngredienteEmprendimientoCrossRef {
    private int emp_id;
    private int ing_id;
    private int ing_precio;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public int getIng_precio() {
        return ing_precio;
    }

    public void setIng_precio(int ing_precio) {
        this.ing_precio = ing_precio;
    }
}
