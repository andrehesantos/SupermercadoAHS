package com.supemercadoAHS.SupermercadoAHS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControladorIndex {


	@RequestMapping("/")
	public String index() {
		return "index";
	}
		
}
