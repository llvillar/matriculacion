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

import com.llv.examen6.portal.matriculacion.services.AlumnoService;

import models.Alumno;

@RestController
public class AlumnoController {
    
    @Autowired
    AlumnoService service;

    @GetMapping("/alumnos")
    List<Alumno> all(){
        return service.findAll();
    }

    @GetMapping("/alumnos/{id}")
    Alumno findAlumno(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/alumnos/{id}")
    void deleteAlumno(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/alumnos")
    Alumno guardar(@RequestBody Alumno alumno){
        return service.save(alumno);
    }

    @PutMapping("/alumnos/{id}")
    Alumno actualizar(@PathVariable int id, @RequestBody Alumno alumno){
        return service.update(id, alumno);
    }

}
