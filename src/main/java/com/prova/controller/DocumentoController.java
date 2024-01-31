package com.prova.controller;

import com.prova.entity.Beneficiario;
import com.prova.entity.Documento;
import com.prova.service.BeneficiarioService;
import com.prova.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/documentos")
public class DocumentoController {

    private final DocumentoService documentoService;

    @Autowired
    public DocumentoController(DocumentoService documentoService){
        this.documentoService = documentoService;
    }

    @GetMapping("/{beneficiario}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Documento> listaDocumentosPorBeneficiario(Beneficiario beneficiario){
        return documentoService.listaDocumentosPorBeneficiario(beneficiario);
    }


}
