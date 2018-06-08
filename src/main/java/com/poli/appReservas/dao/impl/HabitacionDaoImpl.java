/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.dao.impl;

import com.poli.appReservas.dao.IHabitacionDao;
import com.poli.appReservas.data.HabitacionData;
import com.poli.appReservas.model.Habitacion;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class HabitacionDaoImpl implements IHabitacionDao {

    @Override
    public List<Habitacion> obtenerHabitaciones() {
        return HabitacionData.getListado();
    }

    @Override
    public Habitacion obtenerHabitacion(String idHabitacion) {
        Habitacion habitacion = null;
        List<Habitacion> listado = HabitacionData.getListado();
        for (Habitacion item : listado) {
            if (item.getIdHabitacion().equals(idHabitacion)) {
                habitacion = item;
            }
        }
        return habitacion;
    }

    @Override
    public String crearHabitacion(Habitacion habitacion) {
        String respuesta = "Habitacion Registrada";
        List<Habitacion> listado = HabitacionData.getListado();
        listado.add(habitacion);
        HabitacionData.setListado(listado);
        return respuesta;
    }

}
