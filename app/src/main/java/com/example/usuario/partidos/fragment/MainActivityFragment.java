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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 23/11/2016.
 */

public class MainActivityFragment extends Fragment {



    private static final String BACKGROUND_COLOR = "color";


    private static final String INDEX = "index";

    private int color;
    private int index;



    public static MainActivityFragment newInstance(int color, int index) {

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



        return v;


    }
}
