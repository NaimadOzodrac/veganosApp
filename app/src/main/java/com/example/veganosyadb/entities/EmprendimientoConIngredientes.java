package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class EmprendimientoConIngredientes {
    @Embedded
    public Emprendimiento emprendimiento;
    @Relation(
            parentColumn = "emp_id",
            entityColumn = "ing_id",
            associateBy = @Junction(IngredienteEmprendimientoCrossRef.class)
    )
    public List<Ingrediente> ingredientes;

}
