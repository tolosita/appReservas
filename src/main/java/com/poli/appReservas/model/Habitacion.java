/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.model;

import java.util.Objects;

/**
 *
 * @author sala305
 */
public class Habitacion {

    private String idHabitacion;
    private String tipoHabitacion;
    private Double numCamas;

    public Habitacion() {
    }

    public Habitacion(String idHabitacion, String tipoHabitacion, Double numCamas) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numCamas = numCamas;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Double getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Double numCamas) {
        this.numCamas = numCamas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idHabitacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        if (!Objects.equals(this.idHabitacion, other.idHabitacion)) {
            return false;
        }
        return true;
    }

}
