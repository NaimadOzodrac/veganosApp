package com.example.veganosyadb;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.veganosyadb.daos.IngredienteDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Ingrediente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class IngredienteTest {
    private IngredienteDao ingredienteDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        ingredienteDao = appDatabase.ingredienteDao();
    }

    @After
    public void closeDb() throws IOException {
        appDatabase.close();
    }

    @Test
    public void findByNameTest() throws Exception {
//        Ingrediente ingrediente = new Ingrediente(
//                1,
//                "ing 1",
//                "Lorem ipsum",
//                true
//        );
//
//        ingredienteDao.insert(ingrediente);

        Ingrediente buscada = ingredienteDao.findByNombre("ing 1");
//        assertTrue("no encontró ing 1", ingrediente.getIng_id() == buscada.getIng_id());
        assertTrue("no encontró ing 1",buscada.getIng_id() == 1);
    }


}
