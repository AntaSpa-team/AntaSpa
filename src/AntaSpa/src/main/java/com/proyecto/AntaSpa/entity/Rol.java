package com.proyecto.AntaSpa.entity;

import jakarta.persistence.;
import jakarta.validation.constraints.;
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

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

}