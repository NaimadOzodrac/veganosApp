package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class PlatoConEmprendimientos {
    @Embedded
    public Plato plato;
    @Relation(
            parentColumn = "plat_id",
            entityColumn = "emp_id",
            associateBy = @Junction(EmprendimientoPlatoCrossRef.class)
    )
    public List<Emprendimiento> emprendimientos;
}
