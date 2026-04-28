package com.proyecto.AntaSpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "rol")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_rol")
    private Long idRol;

    @NotBlank(message = "El nombre del rol es obligatorio")

    @Size(max = 50, message = "El nombre no debe exceder 50 caracteres")
    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

}