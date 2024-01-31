package com.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.entity.Beneficiario;
import com.prova.repository.BeneficiarioRepository;

import java.util.List;

@Service
public class BeneficiarioService {
	
	private final BeneficiarioRepository beneficiarioRepository;
	
	@Autowired 
	public BeneficiarioService(BeneficiarioRepository beneficiarioRepository) {
		this.beneficiarioRepository = beneficiarioRepository;
	}
	
	public Beneficiario inserirBeneficiario(Beneficiario beneficiario) {
		return beneficiarioRepository.save(beneficiario);
	}
	
	public Beneficiario recuperarBeneficiarioPorId(Long id) {
		return beneficiarioRepository.getById(id);
	}
	
	public void excluirBeneficiarioPorId(Long id) {
		beneficiarioRepository.deleteById(id);
	}

	public List<Beneficiario> listarTodosBeneficiarios(){
		return beneficiarioRepository.findAll();
	}
	
	
}
