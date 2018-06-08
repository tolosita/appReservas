/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.appReservas.controller;

import com.poli.appReservas.business.IHabitacionBusiness;
import com.poli.appReservas.model.Habitacion;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
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
public class HabitacionController {

    @Autowired
    private IHabitacionBusiness habitacionBusiness;

    @PostMapping("habitaciones")
    public String crearHabitacion(@RequestBody Habitacion habitacion, HttpServletResponse hsr) {
        return habitacionBusiness.crearHabitacion(habitacion);
    }
}
