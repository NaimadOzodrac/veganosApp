package com.example.veganosyadb.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Local {

    public Local(int loc_id, int emp_id, String loc_nombre,
                 String calle, String num_puerta, String apto,
                 String esquina, String telefono, String horarios) {
        this.loc_id = loc_id;
        this.emp_id = emp_id;
        this.loc_nombre = loc_nombre;
        this.calle = calle;
        this.num_puerta = num_puerta;
        this.apto = apto;
        this.esquina = esquina;
        this.telefono = telefono;
        this.horarios = horarios;
    }

    @PrimaryKey
    private int loc_id;
    private int emp_id;
    private String loc_nombre;
    private String calle;
    private String num_puerta;
    private String apto;
    private String esquina;
    private String telefono;
    private String horarios;

    public int getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getLoc_nombre() {
        return loc_nombre;
    }

    public void setLoc_nombre(String loc_nombre) {
        this.loc_nombre = loc_nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNum_puerta() {
        return num_puerta;
    }

    public void setNum_puerta(String num_puerta) {
        this.num_puerta = num_puerta;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public String getEsquina() {
        return esquina;
    }

    public void setEsquina(String esquina) {
        this.esquina = esquina;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
