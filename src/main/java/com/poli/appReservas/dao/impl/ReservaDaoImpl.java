/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.dao.impl;

import com.poli.appReservas.dao.IReservaDao;
import com.poli.appReservas.data.ReservaData;
import com.poli.appReservas.model.Reserva;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class ReservaDaoImpl implements IReservaDao {

    @Override
    public List<Reserva> obtenerReservas() {
        return ReservaData.getListado();
    }

    @Override
    public Reserva obtenerReserva(String idReserva) {
        Reserva reserva = null;
        List<Reserva> listado = ReservaData.getListado();
        for (Reserva item : listado) {
            if (item.getIdReserva().equals(idReserva)) {
                reserva = item;
            }
        }
        return reserva;
    }

    @Override
    public String crearReserva(Reserva reserva) {
        String respuesta = "Reserva Registrada";
        List<Reserva> listado = ReservaData.getListado();
        listado.add(reserva);
        ReservaData.setListado(listado);
        return respuesta;
    }

}
