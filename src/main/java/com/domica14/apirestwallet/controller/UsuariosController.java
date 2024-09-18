package com.domica14.apirestwallet.controller;

import com.domica14.apirestwallet.model.Usuarios;
import com.domica14.apirestwallet.model.UsuariosDTO;
import com.domica14.apirestwallet.service.UsuariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @GetMapping(value = "/{id_usuario}")
    public Optional<Usuarios> getUsuario(@PathVariable(name = "id_usuario") int idUsuario) {
        return usuariosService.getUsuario(idUsuario);
    }

    @PostMapping
    public void addUsuario(@RequestBody UsuariosDTO usuariosDTO) {
        usuariosService.addUsuario(usuariosDTO);
    }
}
