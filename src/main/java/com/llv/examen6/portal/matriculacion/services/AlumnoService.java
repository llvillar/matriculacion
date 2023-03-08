package com.llv.examen6.portal.matriculacion.services;

import java.util.List;

import models.Alumno;

public interface AlumnoService {
    
    public List<Alumno> findAll();

    public void deleteById(int codigo);

    public Alumno save(Alumno alumno);

    public Alumno update(int codigo, Alumno alumno);

    public Alumno findById(int codigo);
}
