package com.example.veganosyadb;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.veganosyadb.daos.EmprendimientoDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Emprendimiento;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EmprendimientoTest {
    private EmprendimientoDao emprendimientoDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        emprendimientoDao = appDatabase.emprendimientoDao();
    }

    @After
    public void closeDb() throws IOException {
        appDatabase.close();
    }

    @Test
    public void findByNameTest() throws Exception {
//        Emprendimiento emprendimiento = new Emprendimiento(
//                1,
//                "emp 1",
//                true,
//                true,
//                true,
//                true,
//                true,
//                "logo1.jpg"
//        );
//
//        emprendimientoDao.insert(emprendimiento);

        Emprendimiento buscada = emprendimientoDao.findByNombre("emp 1");
//        assertTrue("no encontró emp 1", emprendimiento.getEmp_id() == buscada.getEmp_id());
        assertTrue("no encontró emp 1", buscada.getEmp_id() == 1);
    }

}
