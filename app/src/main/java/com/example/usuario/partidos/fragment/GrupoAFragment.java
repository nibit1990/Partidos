package com.example.usuario.partidos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.usuario.partidos.AdapterCategory;
import com.example.usuario.partidos.Category;
import com.example.usuario.partidos.R;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;

import static android.R.attr.category;

/**
 * Created by Usuario on 28/11/2016.
 */

public class GrupoAFragment extends Fragment {

    ListView mLeadsList;
    ArrayList<Category> category = new ArrayList<Category>();
//...





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
        ListView lv = (ListView)v.findViewById(R.id.leads_list);

        AdapterCategory adapter = new AdapterCategory(getActivity(),category);

        lv.setAdapter(adapter);
        category.add(new Category( "5", "5", "3", "s"));


        return v;



    }







    }
