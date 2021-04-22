package com.example.veganosyadb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.veganosyadb.entities.IngredienteConEmprendimientos;
import com.example.veganosyadb.entities.IngredienteConRecetas;
import com.example.veganosyadb.entities.Ingrediente;

import java.util.List;

@Dao
public interface IngredienteDao {
    @Query("SELECT * FROM ingrediente")
    List<Ingrediente> getAll();

    @Insert
    void insert(Ingrediente ingrediente);

    @Update
    void update(Ingrediente ingrediente);

    @Delete
    void delete(Ingrediente ingrediente);

    @Query("SELECT * FROM ingrediente WHERE ing_nombre LIKE :nombre")
    Ingrediente findByNombre(String nombre);

    @Query("SELECT * FROM ingrediente WHERE ing_id = :id")
    Ingrediente findById(int id);

    @Transaction
    @Query("SELECT * FROM ingrediente")
    public List<IngredienteConRecetas> getIngredienteConRecetas();

    @Transaction
    @Query("SELECT * FROM ingrediente")
    public List<IngredienteConEmprendimientos> getIngredienteConEmprendimientos();
}
