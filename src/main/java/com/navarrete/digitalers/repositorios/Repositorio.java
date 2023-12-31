package com.navarrete.digitalers.repositorios;

import com.navarrete.digitalers.entidades.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface Repositorio <T extends Entidad, N extends Serializable> extends JpaRepository<T,N> {


}
