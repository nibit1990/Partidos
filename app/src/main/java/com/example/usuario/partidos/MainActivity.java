package com.example.usuario.partidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Inicializar Animes
        List items = new ArrayList();

        items.add(new Equipo(R.drawable.bandera_brasil, "Angel Beats", 230));
        items.add(new Equipo(R.drawable.bandera_uruguay, "Death Note", 456));
        items.add(new Equipo(R.drawable.bandera_argentina, "Fate Stay Night", 342));


// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new EquipoAdapter(items);
        recycler.setAdapter(adapter);
    }
    }

