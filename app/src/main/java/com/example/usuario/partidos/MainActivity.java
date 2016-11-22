package com.example.usuario.partidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList equipos;
    private RecyclerView listaEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarEquipos();
        inicializarAdaptador();

        listaEquipos = (RecyclerView) findViewById(R.id.rvEquipos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaEquipos.setLayoutManager(llm);




    }


    public void inicializarAdaptador(){

        EquipoAdaptador adaptador = new EquipoAdaptador(equipos);
        listaEquipos.setAdapter(adaptador);
    }


    public void inicializarEquipos(){


        equipos = new ArrayList<Equipo>();

        equipos.add(new Equipo(R.drawable.bandera_uruguay,"Uruguay",5));
        equipos.add(new Equipo(R.drawable.bandera_brasil,"Brasil",2));
        equipos.add(new Equipo(R.drawable.bandera_argentina,"Argentina",1));



    }
}



