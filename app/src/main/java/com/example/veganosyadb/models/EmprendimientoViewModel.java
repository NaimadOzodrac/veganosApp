package com.example.veganosyadb.models;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.veganosyadb.entities.Emprendimiento;
import com.example.veganosyadb.repositories.EmprendimientoRepository;

import java.util.List;

public class EmprendimientoViewModel extends AndroidViewModel {
    private EmprendimientoRepository emprendimientoRepository;
    private final LiveData<List<Emprendimiento>> emprendimientos;

    private EmprendimientoViewModel(Application application) {
        super(application);
        emprendimientoRepository = new EmprendimientoRepository(application);
        emprendimientos = emprendimientoRepository.getEmprendimientos();
    }

    LiveData<List<Emprendimiento>> getEmprendimientos(){
        return emprendimientos;
    }

    public void insert(Emprendimiento emprendimiento){
        emprendimientoRepository.insert(emprendimiento);
    }

}
