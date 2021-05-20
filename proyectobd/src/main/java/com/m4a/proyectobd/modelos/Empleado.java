package com.m4a.proyectobd.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    @Column(name = "emp_nombre", nullable = false)
    private String empNombre;
    @Column(name = "emp_apellido", nullable = false)
    private String empApellido;
    @Column(name = "emp_identificacion", nullable = false)
    private int empIdentificacion;

    @JsonBackReference
    @JoinColumn(name = "depId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamento departamento;

    /**
     * @return long return the empId
     */
    public long getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(long empId) {
        this.empId = empId;
    }

    /**
     * @return String return the empNombre
     */
    public String getEmpNombre() {
        return empNombre;
    }

    /**
     * @param empNombre the empNombre to set
     */
    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    /**
     * @return String return the empApellido
     */
    public String getEmpApellido() {
        return empApellido;
    }

    /**
     * @param empApellido the empApellido to set
     */
    public void setEmpApellido(String empApellido) {
        this.empApellido = empApellido;
    }

    /**
     * @return int return the identificacion
     */
    public int getEmpIdentificacion() {
        return empIdentificacion;
    }

    /**
     * @param empIdentificacion the identificacion to set
     */
    public void setIEmpIdentificacion(int empIdentificacion) {
        this.empIdentificacion = empIdentificacion;
    }

    /**
     * @return Departamento return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * 
     */
    public Empleado() {
    }

    /**
     * @param empId
     * @param empNombre
     * @param empApellido
     * @param identificacion
     * @param departamento
     */
    public Empleado(long empId, String empNombre, String empApellido, int empIdentificacion,
            Departamento departamento) {
        this.empId = empId;
        this.empNombre = empNombre;
        this.empApellido = empApellido;
        this.empIdentificacion = empIdentificacion;
        this.departamento = departamento;
    }

}
