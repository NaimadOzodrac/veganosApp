package com.example.veganosyadb;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.veganosyadb.daos.RecetaDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Receta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class RecetaTest {
    private RecetaDao recetaDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        recetaDao = appDatabase.recetaDao();
    }

    @After
    public void closeDb() throws IOException {
        appDatabase.close();
    }

    @Test
    public void findByNameTest() throws Exception {
//        Receta receta = new Receta(
//                1,
//                "rec 1",
//                "lorem ipsum",
//                "lorem ipsum",
//                true,
//                "lorem ipsum"
//        );
//
//        recetaDao.insert(receta);

        Receta buscada = recetaDao.findByNombre("rec 1");
//        assertTrue("no encontró rec 1", receta.getRec_id() == buscada.getRec_id());
        assertTrue("no encontró rec 1", buscada.getRec_id() == 1);
    }
}
