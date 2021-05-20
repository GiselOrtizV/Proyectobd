package com.m4a.proyectobd.repositorios;

import com.m4a.proyectobd.modelos.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

}
