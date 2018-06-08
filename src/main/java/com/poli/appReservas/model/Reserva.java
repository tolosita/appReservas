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

    private String idReserva;
    private String idHabitacion;
    private Double numCamas;
    private Double precioXcama;

    public Reserva() {
    }

    public Reserva(String idReserva, String idHabitacion, Double numCamas, Double precioXcama) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.numCamas = numCamas;
        this.precioXcama = precioXcama;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
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
        hash = 29 * hash + Objects.hashCode(this.idReserva);
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
        if (!Objects.equals(this.idReserva, other.idReserva)) {
            return false;
        }
        return true;
    }

}
