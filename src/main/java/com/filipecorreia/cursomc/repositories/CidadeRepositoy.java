package com.filipecorreia.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.filipecorreia.cursomc.domain.Cidade;

@Repository
public interface CidadeRepositoy extends JpaRepository<Cidade, Integer>{

}
