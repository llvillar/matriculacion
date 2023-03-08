package com.llv.examen6.portal.matriculacion.services;

import java.util.List;

import models.Asignatura;

public interface AsignaturaService {
    
    public List<Asignatura> findAll();

    public void deleteById(String codigo);

    public Asignatura save(Asignatura asignatura);

    public Asignatura update(String codigo, Asignatura asignatura);

    public Asignatura findById(String codigo);
}
