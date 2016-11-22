package com.example.usuario.partidos;

/**
 * Created by Usuario on 22/11/2016.
 */

public class Equipo {

    int bandera;
    String equipo;
    int resultado;

    public Equipo(int bandera, String equipo, int resultado) {
        this.bandera = bandera;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int puntos) {
        this.resultado = puntos;
    }
}
