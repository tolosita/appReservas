/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.business;

import com.poli.appReservas.model.Reserva;

/**
 *
 * @author sala305
 */
public interface IReservaBusiness {

    public String crearReserva(Reserva reserva);

    public Double obtenerValorHabitacionesDisponibles();

    public Double obtenerTotalHabitacionesReservadas();

}
