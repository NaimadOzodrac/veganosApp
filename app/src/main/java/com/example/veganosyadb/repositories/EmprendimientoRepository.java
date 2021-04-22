package com.example.veganosyadb.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.veganosyadb.daos.EmprendimientoDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Emprendimiento;

import java.util.List;

public class EmprendimientoRepository {
    private EmprendimientoDao emprendimientoDao;

    private LiveData<List<Emprendimiento>> emprendimientos;

    public EmprendimientoRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        emprendimientoDao = db.emprendimientoDao();
        emprendimientos = emprendimientoDao.getAll();
    }

    public LiveData<List<Emprendimiento>> getEmprendimientos() {
        return emprendimientos;
    }

    public void insert(Emprendimiento emprendimiento) {
        emprendimientoDao.insert(emprendimiento);
    }

}
