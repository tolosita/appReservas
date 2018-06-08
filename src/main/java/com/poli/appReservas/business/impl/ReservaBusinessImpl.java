/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.business.impl;

import com.poli.appReservas.business.IReservaBusiness;
import com.poli.appReservas.dao.IHabitacionDao;
import com.poli.appReservas.dao.IReservaDao;
import com.poli.appReservas.data.HabitacionData;
import com.poli.appReservas.data.ReservaData;
import com.poli.appReservas.model.Habitacion;
import com.poli.appReservas.model.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sala305
 */
@Service
public class ReservaBusinessImpl implements IReservaBusiness {

    @Autowired
    IReservaDao reservaDao;

    @Autowired
    IHabitacionDao habitacionDao;

    @Override
    public String crearReserva(Reserva reserva) {
        String respuesta = "Reserva Ya Registrada";

        List<Reserva> listado = ReservaData.getListado();
        if (!listado.contains(reserva)) {
            Habitacion habitacion = habitacionDao.obtenerHabitacion(reserva.getIdHabitacion());
            if (habitacion != null) {
                if (reserva.getNumCamas() > 0) {
                    Double camasOcupadas = 0D;
                    for (Reserva item : listado) {
                        if (item.getIdHabitacion().equals(reserva.getIdHabitacion())) {
                            camasOcupadas += item.getNumCamas();
                        }
                    }
                    if ((camasOcupadas + reserva.getNumCamas()) <= habitacion.getNumCamas()) {
                        if (habitacion.getTipoHabitacion().equals("privada")) {
                            reserva.setNumCamas(habitacion.getNumCamas());
                            reserva.setPrecioXcama(50000D);
                        }
                        if (habitacion.getTipoHabitacion().equals("compartida")) {
                            reserva.setPrecioXcama(30000D);
                        }
                        respuesta = reservaDao.crearReserva(reserva);
                    } else {
                        respuesta = "Esta Habitacion no tiene disponibilidad";
                    }
                } else {
                    respuesta = "El numero de camas debe ser mayor a 0";
                }
            } else {
                respuesta = "La Habitacion no existe";
            }
        }

        return respuesta;
    }

    @Override
    public Double obtenerValorHabitacionesDisponibles() {
        Double valor = 0D;
        List<Habitacion> listadoH = HabitacionData.getListado();
        List<Reserva> listadoR = ReservaData.getListado();

        for (Habitacion habitacion : listadoH) {
            Double camasOcupadas = 0D;
            for (Reserva reserva : listadoR) {
                if (reserva.getIdHabitacion().equals(habitacion.getIdHabitacion())) {
                    camasOcupadas += reserva.getNumCamas();
                }
            }
            if (habitacion.getTipoHabitacion().equals("privada")) {
                valor += (habitacion.getNumCamas() - camasOcupadas) * 50000D;
            }
            if (habitacion.getTipoHabitacion().equals("compartida")) {
                valor += (habitacion.getNumCamas() - camasOcupadas) * 30000D;
            }
        }

        return valor;
    }

    @Override
    public Double obtenerTotalHabitacionesReservadas() {
        Double cant = 0D;
        List<Habitacion> listadoH = HabitacionData.getListado();
        List<Reserva> listadoR = ReservaData.getListado();

        for (Habitacion habitacion : listadoH) {
            Double camasOcupadas = 0D;
            for (Reserva reserva : listadoR) {
                if (reserva.getIdHabitacion().equals(habitacion.getIdHabitacion())) {
                    camasOcupadas += reserva.getNumCamas();
                }
            }
            if (camasOcupadas > 1) {
                cant++;
            }
        }
        return cant;
    }

}
