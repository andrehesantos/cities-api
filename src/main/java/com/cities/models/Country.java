package com.cities.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
	
	@Id
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nome_pt")
	private String nome_pt;
	
	@Column(name = "sigla")
	private String sigla;
	
	private Integer bacen;
	
	
	public Country() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome_pt() {
		return nome_pt;
	}


	public void setNome_pt(String nome_pt) {
		this.nome_pt = nome_pt;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public Integer getBacen() {
		return bacen;
	}


	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
	
	

}
