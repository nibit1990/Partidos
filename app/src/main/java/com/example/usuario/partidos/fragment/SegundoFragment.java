package com.example.usuario.partidos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.partidos.R;
import com.example.usuario.partidos.adapter.EquipoAdapter;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 28/11/2016.
 */

public class SegundoFragment extends Fragment {







    public static SegundoFragment newInstance( int index) {

        // Instantiate a new fragment
        SegundoFragment fragment = new SegundoFragment();



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
        View v = inflater.inflate(R.layout.fragment_segundo, container, false);






        return v;


    }




}
