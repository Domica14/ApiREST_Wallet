package com.domica14.apirestwallet.utils;

import com.password4j.BcryptFunction;
import com.password4j.Password;
import com.password4j.types.Bcrypt;

public class Hashing {

    private static final BcryptFunction bcryptFunction = BcryptFunction.getInstance(Bcrypt.B, 12);

    //Metodo para convertir las contraseñas ingresadas a Hash mediante Bcrypt
    public static String getHashedPassword(String password) {
        return Password.hash(password)
                .addPepper("shared-secret")
                .with(bcryptFunction)
                .getResult();
    }

    //Metodo para verificar si la contraseña ingresada por el usuario es igual al valor
//    hash de la base de datos
    public static boolean compareHashedPassword(String password, String hashedPassword) {
        return Password.check(password, hashedPassword)
                .addPepper("shared-secret")
                .with(bcryptFunction);
    }
}
