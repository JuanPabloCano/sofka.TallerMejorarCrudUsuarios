package com.sofka.ApiRestSpringBoot.ApiRest.Example.repositories;

import com.sofka.ApiRestSpringBoot.ApiRest.Example.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    List<UsuarioModel> findByPrioridad(Integer prioridad);

    /* Se modifica el tipo de colección ArrayList por List, ya que al ser una
    interfaz se puede hacer uso del polimorfismo y, ya que esta maneja orden
    de inserción por el index del número es más adecuado para este ejercicio.
    Luego se quita el acceso public abstract porque es redundante */
}
