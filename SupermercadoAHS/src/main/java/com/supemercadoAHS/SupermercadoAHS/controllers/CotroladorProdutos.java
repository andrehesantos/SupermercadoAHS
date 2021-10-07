package com.supemercadoAHS.SupermercadoAHS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supemercadoAHS.SupermercadoAHS.models.Produto;
import com.supemercadoAHS.SupermercadoAHS.repositories.ProdutoRepository;

@Controller
public class CotroladorProdutos {
	
	@Autowired
	private ProdutoRepository pr;

	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
	public String form() {
		return "Produto/cadastrarProduto";
	}
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.POST)
	public String form(Produto prod) {
		pr.save(prod);
		return "redirect:/cadastrarProduto";
	}
		
}
