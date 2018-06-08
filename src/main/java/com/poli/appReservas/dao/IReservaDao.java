/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.dao;

import com.poli.appReservas.model.Reserva;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IReservaDao {

    public List<Reserva> obtenerReservas();

    public Reserva obtenerReserva(String idReserva);

    public String crearReserva(Reserva reserva);

}
