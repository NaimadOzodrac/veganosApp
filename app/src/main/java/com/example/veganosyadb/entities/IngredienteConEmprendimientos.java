package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class IngredienteConEmprendimientos {
    @Embedded
    public Ingrediente ingrediente;
    @Relation(
            parentColumn = "ing_id",
            entityColumn = "emp_id",
            associateBy = @Junction(IngredienteEmprendimientoCrossRef.class)
    )
    public List<Emprendimiento> emprendimientos;
}
