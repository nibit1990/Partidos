package com.example.usuario.partidos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.partidos.R;

/**
 * Created by Usuario on 23/11/2016.
 */

public class MainActivityFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
    View v = inflater.inflate(R.layout.fragment_activity_main, container, false);
        return v;


    }
}
