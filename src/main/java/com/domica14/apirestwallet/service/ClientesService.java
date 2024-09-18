package com.domica14.apirestwallet.service;

import com.domica14.apirestwallet.model.Clientes;
import com.domica14.apirestwallet.model.ClientesDTO;
import com.domica14.apirestwallet.repository.ClientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientesService {

    private final ClientesRepository clientesRepository;

    public Clientes addCliente(ClientesDTO cliente) {
        Clientes clienteACrear = Clientes.builder()
                        .nombre(cliente.getNombre())
                        .correo(cliente.getCorreo())
                        .cedula(cliente.getCedula())
                        .build();

        clientesRepository.save(clienteACrear);
        return clienteACrear;
    }

    public Optional<Clientes> getCliente(int idCliente) {
        return clientesRepository.findById(idCliente);
    }

}
