package com.domica14.apirestwallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientesDTO {

    private String nombre;
    private String correo;
    private String cedula;

}
