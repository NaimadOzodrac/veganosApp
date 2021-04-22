package com.example.veganosyadb.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.veganosyadb.daos.PlatoDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Plato;

import java.util.List;

public class PlatoRepository {
    private PlatoDao platoDao;

    private LiveData<List<Plato>> platos;

    public PlatoRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        platoDao = db.platoDao();
        platos = platoDao.getAll();
    }

    public LiveData<List<Plato>> getPlatos() {
        return platos;
    }

    public void insert(Plato plato) {
        platoDao.insert(plato);
    }

}
