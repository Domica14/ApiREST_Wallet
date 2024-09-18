package com.domica14.apirestwallet.controller;

import com.domica14.apirestwallet.model.Clientes;
import com.domica14.apirestwallet.model.ClientesDTO;
import com.domica14.apirestwallet.service.ClientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClientesController {

    private final ClientesService clientesService;

    @GetMapping(value = "/{id_cliente}")
    public Optional<Clientes> getCliente(@PathVariable(name = "id_cliente")  int idCliente) {
        return clientesService.getCliente(idCliente);
    }

    @PostMapping
    public Clientes addCliente(@RequestBody ClientesDTO cliente) {
        return clientesService.addCliente(cliente);
    }
}
