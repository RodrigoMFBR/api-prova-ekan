package com.prova.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="beneficiario")
public class Beneficiario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", length = 45, nullable=false)
	private String nome;
	
	@Column(name="telefone", length = 11, nullable=false)
	private Long telefone;
	
	@Column(name="dataNascimento", nullable=false)
	private Date dataNascimento;
	
	 
	    
}
