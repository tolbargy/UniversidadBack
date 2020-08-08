package com.tolbargy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tolbargy.modelo.TipoIdentificacion;

@Repository
public interface ITipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

}
