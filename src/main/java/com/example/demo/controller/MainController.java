package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Usuario;

@Controller
public class MainController {
	@GetMapping("/login")
	public String loginD(Usuario user) {
		return "login";
	}
	@PostMapping("/login")
	public String validacion(Usuario user) {
		if(user.getUsername().equals("Uca") && user.getPassword().equals("123456") ) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}
		
		
	}
	/*Credenciales
	 *Username= Uca
	 *Password= 123456
	 **/
}
