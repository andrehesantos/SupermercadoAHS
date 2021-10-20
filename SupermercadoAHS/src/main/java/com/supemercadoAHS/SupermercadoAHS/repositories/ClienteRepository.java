package com.supemercadoAHS.SupermercadoAHS.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.supemercadoAHS.SupermercadoAHS.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
