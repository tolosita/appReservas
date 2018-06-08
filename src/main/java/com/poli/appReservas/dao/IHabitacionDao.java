/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.dao;

import com.poli.appReservas.model.Habitacion;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IHabitacionDao {

    public List<Habitacion> obtenerHabitaciones();

    public Habitacion obtenerHabitacion(String idHabitacion);

    public String crearHabitacion(Habitacion habitacion);
}
