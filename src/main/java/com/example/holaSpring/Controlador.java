/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.holaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACER
 */
@RestController
public class Controlador {
    
    @GetMapping("/")//ruta 
    public String mensaje(){
        System.out.println("mensaje de exito");
        return "Hola, esta es una prueba con Sprint Boot G35";
        
    }
}
