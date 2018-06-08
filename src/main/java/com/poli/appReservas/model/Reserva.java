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
public class Reserva {

    private String IdReserva;
    private String IdHabitacion;
    private Double numCamas;
    private Double precioXcama;

    public Reserva() {
    }

    public Reserva(String IdReserva, String IdHabitacion, Double numCamas, Double precioXcama) {
        this.IdReserva = IdReserva;
        this.IdHabitacion = IdHabitacion;
        this.numCamas = numCamas;
        this.precioXcama = precioXcama;
    }

    public String getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(String IdReserva) {
        this.IdReserva = IdReserva;
    }

    public String getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(String IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public Double getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Double numCamas) {
        this.numCamas = numCamas;
    }

    public Double getPrecioXcama() {
        return precioXcama;
    }

    public void setPrecioXcama(Double precioXcama) {
        this.precioXcama = precioXcama;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.IdReserva);
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
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.IdReserva, other.IdReserva)) {
            return false;
        }
        return true;
    }

}
