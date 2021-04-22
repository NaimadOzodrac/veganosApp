package com.example.veganosyadb.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.veganosyadb.daos.IngredienteDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Ingrediente;

import java.util.List;

public class IngredienteRepository {
    public IngredienteDao ingredienteDao;

    private List<Ingrediente> ingredientes;

    public IngredienteRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        ingredienteDao = db.ingredienteDao();
        ingredientes = ingredienteDao.getAll();
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void insert(Ingrediente ingrediente) {
        ingredienteDao.insert(ingrediente);
    }

}

