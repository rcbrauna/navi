package com.navi.repositories;

import com.navi.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    List<Endereco> findAllByCep(Integer cep);

    Endereco findByCep (Integer cep);

    Optional<Endereco> findById(Integer id);
}