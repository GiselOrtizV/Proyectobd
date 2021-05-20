package com.m4a.proyectobd.repositorios;

import com.m4a.proyectobd.modelos.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface DepartamentoRepository extends  JpaRepository<Departamento, Long> {


}
