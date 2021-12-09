package com.supemercadoAHS.SupermercadoAHS.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/consultarClientes";
	}
	
	@RequestMapping(value="/consultarClientes")
	public ModelAndView mavCliente() {
		ModelAndView mv = new ModelAndView("Cliente/consultarClientes");
		Iterable<Cliente> clientes = cr.findAll();
		for (Cliente cliente : clientes) {
			if(cliente.isStatus_cliente() == true) {
				cliente.setAuxiliarCliente("Ativo");
			}
			else
				cliente.setAuxiliarCliente("Inativo");
		}
		mv.addObject("cliente", clientes);
		return mv;
	}
	
	@RequestMapping(value="/atualizarCliente/{id_cliente}", method=RequestMethod.GET)
	public ModelAndView atualizaCliente(@PathVariable("id_cliente") long id){
		ModelAndView mv = new ModelAndView("Cliente/atualizarCliente");
	    Cliente cli = cr.findById(id).get();
	    mv.addObject("cliente", cli);
	    return mv;
	}
	
	@RequestMapping(value="atualizarCliente/{id_cliente}", method = RequestMethod.POST)
	public String attCliente(Cliente cli) {
		cr.save(cli);
		return "redirect:/consultarClientes";
	}
	
	@RequestMapping(value = "/desativarCliente/{id_cliente}", method = RequestMethod.GET)
	public ModelAndView desativarCliente(@PathVariable("id_cliente") long id) {
		ModelAndView mv = new ModelAndView("Cliente/desativarCliente");
		Cliente cli = cr.findById(id).get();
		if(cli.isStatus_cliente() == true) {
			cli.setAuxiliarCliente("Ativo");
		}
		else
			cli.setAuxiliarCliente("Inativo");
		mv.addObject("cliente", cli);
		return mv;
	}
	
	@RequestMapping(value = "/desativarCliente/{id_cliente}", method = RequestMethod.POST)
	public String desativaCliente(Cliente cli) {
		if(cli.getAuxiliarCliente().equals("Ativo")){
			cli.setStatus_cliente(false);}
		else if (cli.getAuxiliarCliente().equals("Inativo"))
			cli.setStatus_cliente(true);
		cr.save(cli);
		return "redirect:/consultarClientes";
	}
	
}
