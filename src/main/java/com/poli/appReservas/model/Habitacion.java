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

    private String IdHabitacion;
    private String tipoHabitacion;
    private Double numCamas;

    public Habitacion() {
    }

    public Habitacion(String IdHabitacion, String tipoHabitacion, Double numCamas) {
        this.IdHabitacion = IdHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numCamas = numCamas;
    }

    public String getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(String IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
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
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.IdHabitacion);
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
        if (!Objects.equals(this.IdHabitacion, other.IdHabitacion)) {
            return false;
        }
        return true;
    }

}
