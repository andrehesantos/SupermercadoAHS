package com.supemercadoAHS.SupermercadoAHS.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column
	private String nome_produto;
	
	@Column
	private double valor_produto;
	
	@Column
	private int qtd_produto;
	
	public Produto() {
		
	}

	public Produto(String nome_produto, double valor_produto, int qtd_produto) {
		super();
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.qtd_produto = qtd_produto;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}

	public int getQtd_produto() {
		return qtd_produto;
	}

	public void setQtd_produto(int qtd_produto) {
		this.qtd_produto = qtd_produto;
	}
	
	
	
}
