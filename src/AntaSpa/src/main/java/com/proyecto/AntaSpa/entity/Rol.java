package com.proyecto.AntaSpa.entity;

import jakarta.persistence.;
import jakarta.validation.constraints.;
import lombok.*;

@Entity
@Table(name = "roles")


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long idRol;

    @NotBlank(message = "El nombre del rol es importante")

    @Column(name = "nombre_rol", nullable = false, unique = true, length = 50)
    private String nombreRol;

}