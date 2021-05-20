package com.m4a.proyectobd.controladores;

import java.util.List;

import com.m4a.proyectobd.modelos.Empleado;
import com.m4a.proyectobd.repositorios.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EmpleadoController {
    
    @Autowired
     private EmpleadoRepository empleadoRepository;   
     @GetMapping("/empleados")
     public List<Empleado> getAllEmpleados(){
         return empleadoRepository.findAll();
     }

}
