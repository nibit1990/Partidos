package com.example.usuario.partidos.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usuario.partidos.R;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.List;

/**
 * Created by Usuario on 22/11/2016.
 */



    public class EquipoReciclerViewAdapter extends RecyclerView.Adapter<EquipoReciclerViewAdapter.EquipoViewHolder> {



        private List<Equipo> items;



        public static class EquipoViewHolder extends RecyclerView.ViewHolder {
            // Campos respectivos de un item
            public ImageView ivBandera;
            public TextView tvNombre;
            public TextView tvPuntos;

            public EquipoViewHolder(View v) {
                super(v);
                ivBandera = (ImageView) v.findViewById(R.id.ivBandera);
                tvNombre = (TextView) v.findViewById(R.id.tvNombre);
                tvPuntos = (TextView) v.findViewById(R.id.puntos);
            }
        }




        public EquipoReciclerViewAdapter(List<Equipo> items) {
            this.items = items;
        }





        @Override
        public int getItemCount() {
            return items.size();

        }




        @Override
        public EquipoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.equipo_card, viewGroup, false);
            return new EquipoViewHolder(v);
        }



        @Override
        public void onBindViewHolder(EquipoViewHolder viewHolder, int i) {
            viewHolder.ivBandera.setImageResource(items.get(i).getBandera());
            viewHolder.tvNombre.setText(items.get(i).getNombre());
            viewHolder.tvPuntos.setText("Puntos:"+String.valueOf(items.get(i).getPuntos()));
        }



    }

