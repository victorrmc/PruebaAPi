package com.bitboxer2.PruebaAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola a todos";
    }
}
