package com.example.veganosyadb.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.veganosyadb.daos.LocalDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Local;

import java.util.List;

public class LocalRepository {
    private LocalDao localDao;

    private LiveData<List<Local>> locals;

    public LocalRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        localDao = db.localDao();
        locals = localDao.getAll();
    }

    public LiveData<List<Local>> getLocals() {
        return locals;
    }

    public void insert(Local local) {
        localDao.insert(local);
    }

}
