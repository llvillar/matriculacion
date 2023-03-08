package com.llv.examen6.portal.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llv.examen6.portal.matriculacion.repositories.AsignaturaRepository;
import com.llv.examen6.portal.matriculacion.services.AsignaturaService;

import models.Asignatura;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<Asignatura> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(String codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public Asignatura save(Asignatura Asignatura) {
        Asignatura save = repository.save(Asignatura);
        return save;
    }

    @Override
    public Asignatura update(String codigo, Asignatura Asignatura) {

        if(this.findById(codigo) != null){
            Asignatura = repository.save(Asignatura);
        }
        return Asignatura;
    }

    @Override
    public Asignatura findById(String codigo) {
        Optional<Asignatura> findById = repository.findById(codigo);
        if(findById != null && !findById.isEmpty()){
            return findById.get();
        }
        return null;
    }
    
}
