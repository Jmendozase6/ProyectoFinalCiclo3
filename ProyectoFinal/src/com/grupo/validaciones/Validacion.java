/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jhair
 */
public class Validacion {

    public static void main(String[] args) {
        String contra = "A";
        String correo = "Jhair@gmail.com";

        System.out.println("Mayúscula " + existUpperPass(contra));
        System.out.println("TAMAÑO DE LA CONTRA " + isValidLength(contra));
        System.out.println("CORREO VÁLIDO " + isValidEmail(correo));
    }

    private static Matcher matcher;

    public static final Pattern VALIDATE_EMAIL_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALIDAR_LENGHT_PASSWORD_REGEX
            = Pattern.compile("^.{8,}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALIDAR_UPPER_PASSWORD_REGEX
            = Pattern.compile("^(?=.*[A-Z])");

    public static boolean isValidEmail(String email) {
        matcher = VALIDATE_EMAIL_REGEX.matcher(email);
        return matcher.find();
    }

    public static boolean isValidLength(String password) {
        matcher = VALIDAR_LENGHT_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }

    public static boolean existUpperPass(String password) {
        matcher = VALIDAR_LENGHT_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }

}
