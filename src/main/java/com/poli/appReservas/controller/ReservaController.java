/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.controller;

import com.poli.appReservas.business.IReservaBusiness;
import com.poli.appReservas.model.Reserva;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sala305
 */
@RestController
@RequestMapping(value = "/")
public class ReservaController {

    @Autowired
    private IReservaBusiness reservaBusiness;

    @GetMapping("valorCamas")
    public Double obtenerValorHabitacionesDisponibles(HttpServletResponse hsr) {
        return reservaBusiness.obtenerValorHabitacionesDisponibles();
    }

    @GetMapping("valorCamas")
    public Double obtenerTotalHabitacionesReservadas(HttpServletResponse hsr) {
        return reservaBusiness.obtenerTotalHabitacionesReservadas();
    }

    @PostMapping("reservas")
    public String crearReserva(@RequestBody Reserva reserva, HttpServletResponse hsr) {
        return reservaBusiness.crearReserva(reserva);
    }

}
