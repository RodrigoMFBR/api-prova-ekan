package com.prova.entity;

import jakarta.persistence.*;

@Entity
@Table(name="documento")
public class Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="tipoDocumento", length = 45, nullable=false)
	private String tipoDocumento;
	
	@Column(name="descricao", length = 45, nullable=false)
	private String descricao;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idBeneficiario", referencedColumnName="id")	
	private Beneficiario beneficiario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Beneficiario getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	
}
