package com.supemercadoAHS.SupermercadoAHS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supemercadoAHS.SupermercadoAHS.models.Cliente;
import com.supemercadoAHS.SupermercadoAHS.repositories.ClienteRepository;

@Controller
public class ControladorCliente {

	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String cliente() {
		return "Cliente/cadastrarCliente";
	}
	
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String cliente(Cliente cli){
		cli.setStatus_cliente(true);
		cr.save(cli);
		return "redirect:/cadastrarCliente";
	}
	
}