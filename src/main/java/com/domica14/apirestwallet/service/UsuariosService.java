package com.domica14.apirestwallet.service;

import com.domica14.apirestwallet.model.Clientes;
import com.domica14.apirestwallet.model.Usuarios;
import com.domica14.apirestwallet.model.UsuariosDTO;
import com.domica14.apirestwallet.repository.UsuariosRepository;
import com.domica14.apirestwallet.utils.Hashing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    public void addUsuario(UsuariosDTO usuario) {
        Clientes cliente = Clientes.builder()
                .idCliente(usuario.getIdCliente())
                .build();

        Usuarios usuarioACrear = Usuarios.builder()
                        .usuario(usuario.getUsuario())
                        .password(Hashing.getHashedPassword(usuario.getPassword()))
                        .cliente(cliente)
                        .build();

        usuariosRepository.save(usuarioACrear);
    }

    public Optional<Usuarios> getUsuario(int idUsuario) {
        return usuariosRepository.findById(idUsuario);
    }
}
