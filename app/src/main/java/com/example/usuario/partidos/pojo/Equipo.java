package com.example.usuario.partidos.pojo;

/**
 * Created by Usuario on 22/11/2016.
 */

public class Equipo {


        private int bandera;
        private String nombre;
        private int puntos;

        public Equipo(int bandera, String nombre, int resultado) {
            this.bandera = bandera;
            this.nombre = nombre;
            this.puntos = resultado;
        }

        public String getNombre() {
            return nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public int getBandera() {
            return bandera;
        }
    }

