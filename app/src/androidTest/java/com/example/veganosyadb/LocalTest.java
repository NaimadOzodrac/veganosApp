package com.example.veganosyadb;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;

import com.example.veganosyadb.daos.LocalDao;
import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Local;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class LocalTest {
    private LocalDao localDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        localDao = appDatabase.localDao();
    }

    @After
    public void closeDb() throws IOException {
        appDatabase.close();
    }

    @Test
    public void findByNameTest() throws Exception {
//        Local local = new Local(
//                1,
//                1,
//                "loc 1",
//                "Lorem ipsum",
//                "Lorem ipsum",
//                "Lorem ipsum",
//                "Lorem ipsum",
//                "Lorem ipsum",
//                "Lorem ipsum"
//        );
//
//        localDao.insert(local);

        Local buscada = localDao.findByNombre("loc 1");
//        assertTrue("no encontró loc 1", local.getLoc_id() == buscada.getLoc_id());
        assertTrue("no encontró loc 1", buscada.getLoc_id() == 1);
    }

}
