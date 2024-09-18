package com.domica14.apirestwallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO {

    private String usuario;
    private String password;
    private int idCliente;
}
