package com.example.veganosyadb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.veganosyadb.entities.Receta;
import com.example.veganosyadb.entities.RecetaConIngredientes;

import java.util.List;

@Dao
public interface RecetaDao {
    @Query("SELECT * FROM receta")
    LiveData<List<Receta>> getAll();

    @Insert
    void insert(Receta receta);

    @Update
    void update(Receta receta);

    @Delete
    void delete(Receta receta);

    @Query("SELECT * FROM receta WHERE rec_nombre LIKE :nombre")
    Receta findByNombre(String nombre);

    @Query("SELECT * FROM receta WHERE rec_id = :id")
    Receta findById(int id);

    @Transaction
    @Query("SELECT * FROM receta")
    public List<RecetaConIngredientes> getRecetaConIngredientes();

}
