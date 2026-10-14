package com.example.springUcsal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/home")
        public String home(){
	    return "home"; // aqui é o nome do html que voce quere mostrar na tela
}
}
