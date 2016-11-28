package com.example.usuario.partidos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.partidos.R;

/**
 * Created by Usuario on 28/11/2016.
 */

public class GrupoAFragment extends Fragment {







    public static GrupoAFragment newInstance(int index) {

        // Instantiate a new fragment
        GrupoAFragment fragment = new GrupoAFragment();



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
        View v = inflater.inflate(R.layout.fragment_grupo_a, container, false);






        return v;


    }




}
