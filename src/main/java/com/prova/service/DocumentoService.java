package com.prova.service;

import com.prova.entity.Beneficiario;
import com.prova.repository.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.entity.Documento;
import com.prova.repository.DocumentoRepository;

import java.util.List;

@Service
public class DocumentoService {
	
	private final DocumentoRepository documentoRepository;

	@Autowired
	public DocumentoService(DocumentoRepository documentoRepository) {
		this.documentoRepository = documentoRepository;
	}
	
	public Documento inserirDocumento( Documento documento) {
		return documentoRepository.save(documento);
	}

	public List<Documento> listaDocumentosPorBeneficiario(Beneficiario beneficiario) {
		return documentoRepository.listaDocumentosPorBeneficiario(beneficiario);
	}
	
}
