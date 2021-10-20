package com.supemercadoAHS.SupermercadoAHS.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/consultarProdutos";
	}
	
	@RequestMapping("/consultarProdutos")
	public ModelAndView listaProdutos() {
		ModelAndView mv = new ModelAndView("Produto/consultarProdutos");
		Iterable<Produto> produtos = pr.findAll();
		mv.addObject("produto", produtos);
		return mv;
	}
		
	@RequestMapping(value="/atualizarProduto/{id_produto}", method = RequestMethod.GET)
	public ModelAndView atualizaProduto(@PathVariable("id_produto") long id) {
		ModelAndView mv = new ModelAndView("Produto/atualizarProduto");
		Produto prod = pr.findById(id).get();
		mv.addObject("produto", prod);
		return mv;
	}
	
	@RequestMapping(value="/atualizarProduto/{id_produto}", method=RequestMethod.POST)
	public String att(Produto prod) {
		pr.save(prod);
		return "redirect:/consultarProdutos";
	}
}
