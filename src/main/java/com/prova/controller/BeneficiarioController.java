package com.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.entity.Beneficiario;
import com.prova.service.BeneficiarioService;

import java.util.List;

@RestController
@RequestMapping("api/beneficiarios")
public class BeneficiarioController {
	
	private final BeneficiarioService beneficiarioService;
	
	@Autowired
	public BeneficiarioController(BeneficiarioService beneficiarioService) {
		this.beneficiarioService = beneficiarioService;
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Beneficiario inserirBeneficiario(@RequestBody Beneficiario beneficiario) {
		return beneficiarioService.inserirBeneficiario(beneficiario);
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Beneficiario recuperarBeneficiario(@PathVariable Long id) {
		return beneficiarioService.recuperarBeneficiarioPorId(id);
	}
	
	@PostMapping("/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public void excluirBeneficiario(@PathVariable Long id) {
		beneficiarioService.excluirBeneficiarioPorId(id);
	}

	@GetMapping("/")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Beneficiario> listarTodosBeneficiarios() {
		return beneficiarioService.listarTodosBeneficiarios();
	}
	
}
