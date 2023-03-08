package com.llv.examen6.portal.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llv.examen6.portal.matriculacion.repositories.AlumnoRepository;
import com.llv.examen6.portal.matriculacion.services.AlumnoService;

import models.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository repository;

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public Alumno save(Alumno alumno) {
        Alumno save = repository.save(alumno);
        return save;
    }

    @Override
    public Alumno update(int codigo, Alumno alumno) {

        if(this.findById(codigo) != null){
            alumno = repository.save(alumno);
        }
        return alumno;
    }

    @Override
    public Alumno findById(int codigo) {
        Optional<Alumno> findById = repository.findById(codigo);
        if(findById != null && !findById.isEmpty()){
            return findById.get();
        }
        return null;
    }
    
}
