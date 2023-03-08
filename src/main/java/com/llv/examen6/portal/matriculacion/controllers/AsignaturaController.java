package com.llv.examen6.portal.matriculacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.llv.examen6.portal.matriculacion.services.AsignaturaService;

import models.Asignatura;

@RestController
public class AsignaturaController {
    
    @Autowired
    AsignaturaService service;

    @GetMapping("/asignaturas")
    List<Asignatura> all(){
        return service.findAll();
    }

    @GetMapping("/asignaturas/{id}")
    Asignatura findAsignatura(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping("/asignaturas/{id}")
    void deleteAsignatura(@PathVariable String id){
        service.deleteById(id);
    }

    @PostMapping("/asignaturas")
    Asignatura guardar(@RequestBody Asignatura alumno){
        return service.save(alumno);
    }

    @PutMapping("/asignaturas/{id}")
    Asignatura actualizar(@PathVariable String id, @RequestBody Asignatura alumno){
        return service.update(id, alumno);
    }

}
