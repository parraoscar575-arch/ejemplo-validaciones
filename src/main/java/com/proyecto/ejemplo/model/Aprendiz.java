package com.proyecto.ejemplo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Aprendiz {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long iduser;

@NotBlank(message = "El nombre no puede estar vacío")
@Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
@Column(nullable = false, length = 50)
private String nomuser;

@NotBlank(message = "Los apellidos no pueden estar vacíos")
@Size(max = 50, message = "Los apellidos no pueden tener más de 50 caracteres")
@Column(nullable = false, length = 50)
private String apellidos;

@NotBlank(message = "El email no puede estar vacío")
@Email(message = "Debe ser un correo electrónico válido")
@Column(nullable = false, unique = true)
private String email;

}