package com.example.veganosyadb.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.veganosyadb.daos.RecetaDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Receta;

import java.util.List;

public class RecetaRepository {
    private RecetaDao recetaDao;

    private LiveData<List<Receta>> recetas;

    public RecetaRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        recetaDao = db.recetaDao();
        recetas = recetaDao.getAll();
    }

    public LiveData<List<Receta>> getRecetas() {
        return recetas;
    }

    public void insert(Receta receta) {
        recetaDao.insert(receta);
    }

}
