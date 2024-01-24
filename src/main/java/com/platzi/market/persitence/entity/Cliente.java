package com.platzi.market.persitence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Integer id;
    */
    private String name;
    private String apellidos;
    private Integer celular;
    private String direccion;

    @Column('correo_electronico')
    private String correoElectronico;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }






}
