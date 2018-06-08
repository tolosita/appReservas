/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.data;

import com.poli.appReservas.model.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala305
 */
public class ReservaData {

    private static List<Reserva> listado;

    static {
        listado = new ArrayList<Reserva>() {
        };
    }

    public static List<Reserva> getListado() {
        return listado;
    }

    public static void setListado(List<Reserva> listado) {
        ReservaData.listado = listado;
    }
}
