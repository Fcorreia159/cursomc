package com.filipecorreia.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.filipecorreia.cursomc.domain.Estado;

@Repository
public interface EstadoRepositoy extends JpaRepository<Estado, Integer>{

}
