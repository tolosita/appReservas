/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.data;

import com.poli.appReservas.model.Habitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala305
 */
public class HabitacionData {

    private static List<Habitacion> listado;

    static {
        listado = new ArrayList<Habitacion>() {
        };
    }

    public static List<Habitacion> getListado() {
        return listado;
    }

    public static void setListado(List<Habitacion> listado) {
        HabitacionData.listado = listado;
    }
}
