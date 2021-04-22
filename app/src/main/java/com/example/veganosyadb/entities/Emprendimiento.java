package com.example.veganosyadb.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Emprendimiento {

    public Emprendimiento(int emp_id, String emp_nombre, boolean vegano_estricto,
                          boolean ingredientes, boolean platos, boolean comer_en_local,
                          boolean delivery, String logo) {
        this.emp_id = emp_id;
        this.emp_nombre = emp_nombre;
        this.vegano_estricto = vegano_estricto;
        this.ingredientes = ingredientes;
        this.platos = platos;
        this.comer_en_local = comer_en_local;
        this.delivery = delivery;
        this.logo = logo;
    }

    @PrimaryKey
    private int emp_id;

    private String emp_nombre;

    private boolean vegano_estricto;

    private boolean ingredientes;

    private boolean platos;

    private boolean comer_en_local;

    private boolean delivery;

    private String logo;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    public boolean isVegano_estricto() {
        return vegano_estricto;
    }

    public void setVegano_estricto(boolean vegano_estricto) {
        this.vegano_estricto = vegano_estricto;
    }

    public boolean isIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(boolean ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isPlatos() {
        return platos;
    }

    public void setPlatos(boolean platos) {
        this.platos = platos;
    }

    public boolean isComer_en_local() {
        return comer_en_local;
    }

    public void setComer_en_local(boolean comer_en_local) {
        this.comer_en_local = comer_en_local;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
