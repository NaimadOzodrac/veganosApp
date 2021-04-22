package com.example.veganosyadb;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.veganosyadb.daos.PlatoDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Plato;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class PlatoTest {
    private PlatoDao platoDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        platoDao = appDatabase.platoDao();
    }

    @After
    public void closeDb() throws IOException {
        appDatabase.close();
    }

    @Test
    public void findByNameTest() throws Exception {
//        Plato plato = new Plato(
//                1,
//                "plat 1",
//                "lorem ipsum"
//        );
//
//        platoDao.insert(plato);

        Plato buscada = platoDao.findByNombre("plat 1");
//        assertTrue("no encontró plat 1", plato.getPlat_id() == buscada.getPlat_id());
        assertTrue("no encontró plat 1", buscada.getPlat_id() == 1);
    }

}
