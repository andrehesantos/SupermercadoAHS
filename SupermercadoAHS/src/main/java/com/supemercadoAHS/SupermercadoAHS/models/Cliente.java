package com.supemercadoAHS.SupermercadoAHS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	
	@Column(nullable=false)
	private String nome_cliente;
	
	@Column(nullable=false)
	private String cpf_cliente;
	
	@Column
	private String email_cliente;
	
	@Column(nullable=false)
	private String telefone_cliente;
	
	@Column(nullable=false)
	private boolean status_cliente;
	
	public Cliente() {
		
	}

	public Cliente(String nome_cliente, String cpf_cliente, String email_cliente, String telefone_cliente,
			boolean status_cliente) {
		super();
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.email_cliente = email_cliente;
		this.telefone_cliente = telefone_cliente;
		this.status_cliente = status_cliente;
	}

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public boolean isStatus_cliente() {
		return status_cliente;
	}

	public void setStatus_cliente(boolean status_cliente) {
		this.status_cliente = status_cliente;
	}
	
	
	
}
