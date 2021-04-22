package com.example.veganosyadb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.veganosyadb.entities.Emprendimiento;
import com.example.veganosyadb.entities.EmprendimientoConIngredientes;
import com.example.veganosyadb.entities.EmprendimientoConPlatos;

import java.util.List;

@Dao
public interface EmprendimientoDao {
    @Query("SELECT * FROM emprendimiento")
    LiveData<List<Emprendimiento>> getAll();

    @Insert
    void insert(Emprendimiento emprendimiento);

    @Update
    void update(Emprendimiento emprendimiento);

    @Delete
    void delete(Emprendimiento emprendimiento);

    @Query("SELECT * FROM emprendimiento WHERE emp_nombre LIKE :nombre")
    Emprendimiento findByNombre(String nombre);

    @Query("SELECT * FROM emprendimiento WHERE emp_id = :id")
    Emprendimiento findById(int id);

    @Transaction
    @Query("SELECT * FROM emprendimiento")
    public List<EmprendimientoConIngredientes> getEmprendimientoConIngredientes();

    @Transaction
    @Query("SELECT * FROM emprendimiento")
    public List<EmprendimientoConPlatos> getEmprendimientoConPlatos();
}
