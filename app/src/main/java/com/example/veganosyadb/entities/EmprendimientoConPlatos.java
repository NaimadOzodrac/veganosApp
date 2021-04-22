package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class EmprendimientoConPlatos {
    @Embedded
    public Emprendimiento emprendimiento;
    @Relation(
            parentColumn = "emp_id",
            entityColumn = "plat_id",
            associateBy = @Junction(EmprendimientoPlatoCrossRef.class)
    )
    public List<Plato> platos;
}
