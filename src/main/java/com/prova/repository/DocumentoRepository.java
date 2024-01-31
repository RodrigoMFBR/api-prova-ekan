package com.prova.repository;

import com.prova.entity.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prova.entity.Documento;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{

    @Query("select d from Documento d where d.beneficiario = ?1")
    List<Documento> listaDocumentosPorBeneficiario(Beneficiario beneficiario);

}
