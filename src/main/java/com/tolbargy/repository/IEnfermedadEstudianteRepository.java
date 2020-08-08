package com.tolbargy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tolbargy.modelo.EnfermedadEstudiante;

@Repository
public interface IEnfermedadEstudianteRepository extends JpaRepository<EnfermedadEstudiante, Integer> {

}
