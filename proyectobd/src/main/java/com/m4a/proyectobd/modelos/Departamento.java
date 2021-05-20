package com.m4a.proyectobd.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long depId;
    @Column(name = "dep_nombre", nullable = false)
    private String depNombre;
    @Column(name = "dep_extension", nullable = true)
    private int depExtension;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "departamento")
    private java.util.List<Empleado> empleados;

    public Departamento() {}

    public Departamento(long depId, String depNombre, int depExtension) {
        this.depId = depId;
        this.depNombre = depNombre;
        this.depExtension = depExtension;

    }

    /**
     * @return long return the depId
     */
    public long getDepId() {
        return depId;
    }

    /**
     * @param depId the depId to set
     */
    public void setDepId(long depId) {
        this.depId = depId;
    }

    /**
     * @return String return the depNombre
     */
    public String getDepNombre() {
        return depNombre;
    }

    /**
     * @param depNombre the depNombre to set
     */
    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }

    /**
     * @return int return the depExtension
     */
    public int getDepExtension() {
        return depExtension;
    }

    /**
     * @param depExtension the depExtension to set
     */
    public void setDepExtension(int depExtension) {
        this.depExtension = depExtension;
    }

    /**
     * @return java.util.List<Empleado> return the empleados
     */
    public java.util.List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(java.util.List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
