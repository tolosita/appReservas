/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.business.impl;

import com.poli.appReservas.business.IHabitacionBusiness;
import com.poli.appReservas.dao.IHabitacionDao;
import com.poli.appReservas.data.HabitacionData;
import com.poli.appReservas.model.Habitacion;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sala305
 */
@Service
public class HabitacionBusinessImpl implements IHabitacionBusiness {

    @Autowired
    IHabitacionDao habitacionDao;

    @Override
    public String crearHabitacion(Habitacion habitacion) {
        String respuesta = "Habitacion Ya Registrada";

        List<Habitacion> listado = HabitacionData.getListado();
        if (!listado.contains(habitacion)) {
            if (habitacion.getTipoHabitacion().equals("privada") || habitacion.getTipoHabitacion().equals("compartida")) {
                if (habitacion.getTipoHabitacion().equals("privada")) {
                    if (habitacion.getNumCamas() >= 2 && habitacion.getNumCamas() <= 4) {
                        respuesta = habitacionDao.crearHabitacion(habitacion);
                    } else {
                        respuesta = "El numero de camas por Habitacion privada debe ser entre 2 y 4";
                    }
                }

                if (habitacion.getTipoHabitacion().equals("compartida")) {
                    if (habitacion.getNumCamas() >= 4 && habitacion.getNumCamas() <= 10) {
                        respuesta = habitacionDao.crearHabitacion(habitacion);
                    } else {
                        respuesta = "El numero de camas por Habitacion compartida debe ser entre 4 y 10";
                    }
                }
            } else {
                respuesta = "Tipo de Habitacion Invalido";
            }
        }

        return respuesta;
    }

}
