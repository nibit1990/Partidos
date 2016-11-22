package com.example.usuario.partidos;

/**
 * Created by Usuario on 22/11/2016.
 */

public class Equipo {


        private int bandera;
        private String nombre;
        private int resultado;

        public Equipo(int bandera, String nombre, int resultado) {
            this.bandera = bandera;
            this.nombre = nombre;
            this.resultado = resultado;
        }

        public String getNombre() {
            return nombre;
        }

        public int getResultado() {
            return resultado;
        }

        public int getBandera() {
            return bandera;
        }
    }

