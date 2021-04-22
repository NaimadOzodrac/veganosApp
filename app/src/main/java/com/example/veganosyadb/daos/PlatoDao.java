package com.example.veganosyadb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.veganosyadb.entities.Plato;
import com.example.veganosyadb.entities.PlatoConEmprendimientos;

import java.util.List;

@Dao
public interface PlatoDao {
    @Query("SELECT * FROM plato")
    LiveData<List<Plato>> getAll();

    @Insert
    void insert(Plato plato);

    @Update
    void update(Plato plato);

    @Delete
    void delete(Plato plato);

    @Query("SELECT * FROM plato WHERE plat_nombre LIKE :nombre")
    Plato findByNombre(String nombre);

    @Query("SELECT * FROM plato WHERE plat_id = :id")
    Plato findById(int id);

    @Transaction
    @Query("SELECT * FROM plato")
    public List<PlatoConEmprendimientos> getIngredienteConEmprendimientos();

}
