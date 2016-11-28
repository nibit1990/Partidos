package com.example.usuario.partidos.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usuario.partidos.R;
import com.example.usuario.partidos.adapter.EquipoAdapter;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 23/11/2016.
 */

public class MainActivityFragment extends Fragment {

    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;




    // Inicializar array con equipos y sus datos
    List items = new ArrayList();



    public static MainActivityFragment newInstance( int index) {

        // Instantiate a new fragment
        MainActivityFragment fragment = new MainActivityFragment();



        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
    View v = inflater.inflate(R.layout.fragment_activity_main, container, false);


        // Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new EquipoAdapter(items);
        recycler.setAdapter(adapter);


        inicializarDatos();



        return v;


    }



    private void inicializarDatos() {


        items.add(new Equipo(R.drawable.bandera_brasil, "Brasil", 2));
        items.add(new Equipo(R.drawable.bandera_uruguay, "Uruguay", 4));
        items.add(new Equipo(R.drawable.bandera_argentina, "Argentina", 3));
    }

}
