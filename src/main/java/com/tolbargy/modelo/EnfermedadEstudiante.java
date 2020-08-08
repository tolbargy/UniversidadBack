package com.tolbargy.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "enfermedad_estudiante")
public class EnfermedadEstudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_estudiante", nullable = false)
	private Estudiante estudiante;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "observacion", nullable = false, length = 255)
	private String observacion;

}
