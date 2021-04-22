package com.example.veganosyadb.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.veganosyadb.daos.EmprendimientoDao;
import com.example.veganosyadb.daos.IngredienteDao;
import com.example.veganosyadb.daos.LocalDao;
import com.example.veganosyadb.daos.PlatoDao;
import com.example.veganosyadb.daos.RecetaDao;
import com.example.veganosyadb.entities.Emprendimiento;
import com.example.veganosyadb.entities.EmprendimientoPlatoCrossRef;
import com.example.veganosyadb.entities.Ingrediente;
import com.example.veganosyadb.entities.IngredienteEmprendimientoCrossRef;
import com.example.veganosyadb.entities.IngredienteRecetaCrossRef;
import com.example.veganosyadb.entities.Local;
import com.example.veganosyadb.entities.Plato;
import com.example.veganosyadb.entities.Receta;

import java.util.concurrent.Executors;

@Database(entities = {
        Emprendimiento.class,
        Ingrediente.class,
        Local.class,
        Plato.class,
        Receta.class,
        EmprendimientoPlatoCrossRef.class,
        IngredienteEmprendimientoCrossRef.class,
        IngredienteRecetaCrossRef.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmprendimientoDao emprendimientoDao();
    public abstract IngredienteDao ingredienteDao();
    public abstract LocalDao localDao();
    public abstract PlatoDao platoDao();
    public abstract RecetaDao recetaDao();

    private static volatile AppDatabase instance;

    public static AppDatabase getInstance(final Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "veganosya")
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);
                            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                                @Override
                                public void run() {
                                    getInstance(context)
                                            .emprendimientoDao()
                                            .insert(
                                                    new Emprendimiento(
                                                            1,
                                                            "emp 1",
                                                            true,
                                                            true,
                                                            true,
                                                            true,
                                                            true,
                                                            "logo1.jpg"
                                                    )
                                            );
                                    getInstance(context)
                                            .ingredienteDao()
                                            .insert(
                                                    new Ingrediente(
                                                            1,
                                                            "ing 1",
                                                            "Lorem ipsum",
                                                            true
                                                    )
                                            );
                                    getInstance(context)
                                            .ingredienteDao()
                                            .insert(
                                                    new Ingrediente(
                                                            2,
                                                            "ing 2",
                                                            "Lorem ipsum",
                                                            true
                                                    )
                                            );
                                    getInstance(context)
                                            .recetaDao()
                                            .insert(
                                                    new Receta(
                                                            1,
                                                            "rec 1",
                                                            "lorem ipsum",
                                                            "lorem ipsum",
                                                            true,
                                                            "lorem ipsum"
                                                    )
                                            );
                                    getInstance(context)
                                            .platoDao()
                                            .insert(
                                                    new Plato(
                                                            1,
                                                            "plat 1",
                                                            "lorem ipsum"
                                                    )
                                            );
                                    getInstance(context)
                                            .localDao()
                                            .insert(
                                                    new Local(
                                                            1,
                                                            1,
                                                            "loc 1",
                                                            "Lorem ipsum",
                                                            "Lorem ipsum",
                                                            "Lorem ipsum",
                                                            "Lorem ipsum",
                                                            "Lorem ipsum",
                                                            "Lorem ipsum"
                                                    )
                                            );
                                }
                            });
                        }
                    })
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
