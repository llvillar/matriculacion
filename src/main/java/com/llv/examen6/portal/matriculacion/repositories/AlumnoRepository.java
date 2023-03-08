package com.llv.examen6.portal.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}
