package com.example.usuario.partidos.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usuario.partidos.R;

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

        // Save the parameters
        Bundle bundle = new Bundle();
        bundle.putInt(BACKGROUND_COLOR, color);
        bundle.putInt(INDEX, index);
        fragment.setArguments(bundle);
        fragment.setRetainInstance(true);

        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Load parameters when the initial creation of the fragment is done
        this.color = (getArguments() != null) ? getArguments().getInt(
                BACKGROUND_COLOR) : Color.GRAY;
        this.index = (getArguments() != null) ? getArguments().getInt(INDEX)
                : -1;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
    View v = inflater.inflate(R.layout.fragment_activity_main, container, false);


        // Show the current page index in the view
        TextView tvIndex = (TextView) v.findViewById(R.id.tvIndex);
        tvIndex.setText(String.valueOf(this.index));

        // Change the background color
        v.setBackgroundColor(this.color);
        return v;

    }
}
