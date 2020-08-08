package com.tolbargy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tolbargy.modelo.EnfermedadEstudiante;

@Repository
public interface IEnfermedadEstudianteRepository extends JpaRepository<EnfermedadEstudiante, Integer> {

	@Query("from EnfermedadEstudiante ee where ee.estudiante.id = :idEstudiante")
	public List<EnfermedadEstudiante> listarPorIdEstudiante(@Param("idEstudiante") int idEstudiante);

}
