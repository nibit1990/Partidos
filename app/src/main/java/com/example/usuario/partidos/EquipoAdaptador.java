package com.example.usuario.partidos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Usuario on 22/11/2016.
 */

    public class EquipoAdaptador extends RecyclerView.Adapter<EquipoAdaptador.EquipoViewHolder>{




    ArrayList<Equipo> equipos;


    public EquipoAdaptador(ArrayList<Equipo> equipos){

        this.equipos = equipos;

    }



    //Inflar el layout y lo pasara al view holder para que el obtenga cada los elementos
    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_equipo, parent, false);

        return new EquipoViewHolder(v);

    }

    // Asocia cada elemento de lista con cada view
    @Override
    public void onBindViewHolder(EquipoViewHolder equipoViewHolder, int position) {

        Equipo equipo = equipos.get(position);
        equipoViewHolder.ivBandera.setImageResource(equipo.getBandera());
        equipoViewHolder.tvEquipo.setText(equipo.getEquipo());
        equipoViewHolder.tvResultado.setText(equipo.getResultado());


    }

    //Cantidad de elementos que contiene mi lista
    @Override
    public int getItemCount() {
        return equipos.size();
    }




    public static class EquipoViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivBandera;
        private TextView tvEquipo;
        private TextView tvResultado;



        public EquipoViewHolder(View itemView) {
            super(itemView);

            ivBandera = (ImageView) itemView.findViewById(R.id.ivBandera);
            tvEquipo = (TextView) itemView.findViewById(R.id.tvEquipo);
            tvResultado = (TextView) itemView.findViewById(R.id.tvResultado);


        }
    }
}
