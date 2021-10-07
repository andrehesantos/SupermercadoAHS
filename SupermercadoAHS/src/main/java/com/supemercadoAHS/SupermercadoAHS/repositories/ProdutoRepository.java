package com.supemercadoAHS.SupermercadoAHS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supemercadoAHS.SupermercadoAHS.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String> {
	
	

}
