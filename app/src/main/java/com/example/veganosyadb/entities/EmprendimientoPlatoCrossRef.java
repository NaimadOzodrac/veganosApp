package com.example.veganosyadb.entities;

import androidx.room.Entity;

@Entity(primaryKeys = {"emp_id", "plat_id"})
public class EmprendimientoPlatoCrossRef {
    private int emp_id;
    private int plat_id;
    private int plat_precio;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getPlat_id() {
        return plat_id;
    }

    public void setPlat_id(int plat_id) {
        this.plat_id = plat_id;
    }

    public int getPlat_precio() {
        return plat_precio;
    }

    public void setPlat_precio(int plat_precio) {
        this.plat_precio = plat_precio;
    }
}
