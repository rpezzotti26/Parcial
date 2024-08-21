package gestor;

import java.util.Scanner;

public class RegistroUsuarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Usuario");

        // Leer y validar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        while (!ValidadorUsuario.validarNombre(nombre)) {
            System.out.println("Nombre inválido. Debe contener solo letras y espacios.");
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();
        }

        // Leer y validar correo
        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();
        while (!ValidadorUsuario.validarCorreo(correo)) {
            System.out.println("Correo electrónico inválido.");
            System.out.print("Ingrese su correo electrónico: ");
            correo = scanner.nextLine();
        }

        // Leer y validar contraseña
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        while (!ValidadorUsuario.validarContrasena(contrasena)) {
            System.out.println("Contraseña inválida. Debe contener al menos 8 caracteres, incluyendo letras mayúsculas, minúsculas, números y caracteres especiales.");
            System.out.print("Ingrese su contraseña: ");
            contrasena = scanner.nextLine();
        }

        // Crear el usuario y mostrar la información
        Usuario usuario = new Usuario(nombre, correo, contrasena);
        System.out.println("Registro exitoso!");
        System.out.println(usuario);

        scanner.close();
    }
}
