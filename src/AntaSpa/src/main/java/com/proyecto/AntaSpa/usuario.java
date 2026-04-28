package com.proyecto.AntaSpa.entity;

import jakarta.persistence.;
import jakarta.validation.constraints.;
import lombok.*;

@Entity
@Table(
        name = "usuario",
        indexes = {@Index(name = "idx_nombre_completo", columnList = "nombre_completo")})

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = "El rol es obligatorio")
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

    @NotBlank(message = "El nombre completo es obligatorio")
    @Size(max = 150, message = "El nombre no debe exceder 150 caracteres")
    @Column(name = "nombre_completo", nullable = false, length = 150)
    private String nombreCompleto;

    @Email(message = "Debe ingresar un email válido")
    @Size(max = 100, message = "El email no debe exceder 100 caracteres")

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Pattern(regexp = "[0-9]{9}", message = "El teléfono debe tener 9 dígitos")
    @Column(name = "telefono", length = 9)
    private String telefono;

    @NotNull(message = "El estado activo es obligatorio")
    @Column(name = "activo", nullable = false)
    private Boolean activo;

}