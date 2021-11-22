package com.sofka.ApiRestSpringBoot.ApiRest.Example.controllers;

import com.sofka.ApiRestSpringBoot.ApiRest.Example.models.UsuarioModel;
import com.sofka.ApiRestSpringBoot.ApiRest.Example.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public List<UsuarioModel> findByPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.findByPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id "+ id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }

}
