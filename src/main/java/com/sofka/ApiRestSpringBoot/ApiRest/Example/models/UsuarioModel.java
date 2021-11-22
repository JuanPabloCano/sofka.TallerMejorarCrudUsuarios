package com.sofka.ApiRestSpringBoot.ApiRest.Example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    /* Se reemplazan los métodos Getters y Setters comunes que abarcan muchas líneas de código y
    son considerados malas prácticas por las anotaciones de la librería lombok @Getters y
    @Setters para tener un código más limpio */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private Integer prioridad;

}
