package gestor;

import java.util.regex.Pattern;

public class ValidadorUsuario {
    // Expresión regular para validar nombres (solo letras y espacios)
    private static final String REGEX_NOMBRE = "^[a-zA-Z\\s]+$";
    // Expresión regular para validar correos electrónicos
    private static final String REGEX_CORREO = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    // Expresión regular para validar contraseñas
    private static final String REGEX_CONTRASENA = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static boolean validarNombre(String nombre) {
        return Pattern.matches(REGEX_NOMBRE, nombre);
    }

    public static boolean validarCorreo(String correo) {
        return Pattern.matches(REGEX_CORREO, correo);
    }

    public static boolean validarContrasena(String contrasena) {
        return Pattern.matches(REGEX_CONTRASENA, contrasena);
    }
}
