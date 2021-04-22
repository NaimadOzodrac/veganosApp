package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class RecetaConIngredientes {
    @Embedded
    public Receta receta;
    @Relation(
            parentColumn = "rec_id",
            entityColumn = "ing_id",
            associateBy = @Junction(IngredienteRecetaCrossRef.class)
    )
    public List<Ingrediente> ingredientes;

}
