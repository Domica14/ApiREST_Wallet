package com.domica14.apirestwallet.repository;

import com.domica14.apirestwallet.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
