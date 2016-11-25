package com.example.usuario.partidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usuario.partidos.adapter.EquipoAdapter;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    // Inicializar array con equipos y sus datos
    List items = new ArrayList();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarDatos();


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







    private void inicializarDatos() {


        items.add(new Equipo(R.drawable.bandera_brasil, "Brasil", 2));
        items.add(new Equipo(R.drawable.bandera_uruguay, "Uruguay", 4));
        items.add(new Equipo(R.drawable.bandera_argentina, "Argentina", 3));
    }





}

