package com.supemercadoAHS.SupermercadoAHS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CotroladorProdutos {

	@RequestMapping("/cadastrarProduto")
	public String form() {
		return "Produto/cadastrarProduto";
	}
		
}
