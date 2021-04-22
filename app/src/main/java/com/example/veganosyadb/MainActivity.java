package com.example.veganosyadb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.veganosyadb.database.AppDatabase;
import com.example.veganosyadb.entities.Ingrediente;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ingredientsAdapter ingredientsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initReciclerView();
        loadIngredientes();
    }

    private void initReciclerView() {
        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rv.addItemDecoration(dividerItemDecoration);
        ingredientsAdapter = new ingredientsAdapter(this);
        rv.setAdapter(ingredientsAdapter);
    }

    private void loadIngredientes() {
        AppDatabase db = AppDatabase.getInstance(this.getApplicationContext());
        List<Ingrediente> ingredientsList = db.ingredienteDao().getAll();
        ingredientsAdapter.setUserList(ingredientsList);
    }
}