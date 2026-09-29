package com.proyecto.ejemplo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aprendizjava{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long iduser;

    @Column
    private String nomuser;

    @Column
    private String apellidos;

    @Column
    private String email;

    public Long getIduser() { return iduser; }
    public void setIduser(Long iduser) { this.iduser = iduser; }

    public String getNomuser() { return nomuser; }
    public void setNomuser(String nomuser) { this.nomuser = nomuser; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}