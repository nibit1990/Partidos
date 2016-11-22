package com.example.usuario.partidos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Usuario on 22/11/2016.
 */



    public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {
        private List<Equipo> items;

        public static class EquipoViewHolder extends RecyclerView.ViewHolder {
            // Campos respectivos de un item
            public ImageView ivBandera;
            public TextView tvNombre;
            public TextView tvResultado;

            public EquipoViewHolder(View v) {
                super(v);
                ivBandera = (ImageView) v.findViewById(R.id.Bandera);
                tvNombre = (TextView) v.findViewById(R.id.nombre);
                tvResultado = (TextView) v.findViewById(R.id.resultado);
            }
        }

        public EquipoAdapter(List<Equipo> items) {
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
            viewHolder.tvResultado.setText("Resultado:"+String.valueOf(items.get(i).getResultado()));
        }
    }

