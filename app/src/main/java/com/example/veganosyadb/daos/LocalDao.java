package com.example.veganosyadb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.veganosyadb.entities.Local;

import java.util.List;

@Dao
public interface LocalDao {
    @Query("SELECT * FROM local")
    LiveData<List<Local>> getAll();

    @Insert
    void insert(Local local);

    @Update
    void update(Local local);

    @Delete
    void delete(Local local);

    @Query("SELECT * FROM local WHERE loc_nombre LIKE :nombre")
    Local findByNombre(String nombre);

    @Query("SELECT * FROM local WHERE loc_id = :id")
    Local findById(int id);

}
