package com.example.veganosyadb.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class IngredienteConRecetas {
    @Embedded
    public Ingrediente ingrediente;
    @Relation(
            parentColumn = "ing_id",
            entityColumn = "rec_id",
            associateBy = @Junction(IngredienteRecetaCrossRef.class)
    )
    public List<Receta> recetas;
}
