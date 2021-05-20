package com.m4a.proyectobd.controladores;

import com.m4a.proyectobd.modelos.Departamento;
import com.m4a.proyectobd.repositorios.DepartamentoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository departamentoRepository;
 
    @GetMapping("/departamentos")
    public List<Departamento> getAllDepartamentos(){
        return departamentoRepository.findAll();
    }
}
