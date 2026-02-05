package Libreria;

import java.io.*;

public class Main {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("DownStreet");
        System.out.println("Bienvenido a la biblioteca: " + biblioteca.getNombre());
        System.out.println("\nEstos son los libros que ya existen en la biblioteca:\n");
        biblioteca.mostrarColeccionCompleta();

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.pedirNumero("Introduce un número: ");

            switch (opcion) {
                case 1:

                    biblioteca.añadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Drama", "ISBN012"));
                    biblioteca.añadirLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Aventura", "ISBN013"));
                    biblioteca.añadirLibro(new Libro("1984", "George Orwell", 1949, "Ciencia Ficción", "ISBN014"));
                    biblioteca.añadirLibro(new Libro("Harry Potter", "J.K. Rowling", 1997, "Fantasía", "ISBN015"));
                    biblioteca.añadirLibro(new Libro("Geronimo Stilton", "Elisabetta Dami", 2000, "Aventura", "ISBN016"));
                    System.out.println("\nLibros añadidos correctamente.\n");
                    break;

                case 2:
                    biblioteca.quitarLibro("Harry Potter");
                    biblioteca.quitarLibro("Arcane");
                    break;

                case 3:
                    System.out.println("\nInformación de los libros actuales:\n");
                    biblioteca.mostrarColeccionCompleta();
                    break;

                case 4:
                    System.out.println("\nLista completa actualizada de la biblioteca '" + biblioteca.getNombre() + "':\n");
                    biblioteca.mostrarColeccionCompleta();
                    break;

                case 0:
                    System.out.println("\nGracias por visitar mi biblioteca.");
                    break;

                default:
                    System.out.println("\nOpción no válida, intenta de nuevo.\n");
                    break;
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Añadir libros");
        System.out.println("2. Quitar libros");
        System.out.println("3. Mostrar información de libros actuales");
        System.out.println("4. Mostrar la biblioteca completa");
        System.out.println("0. Salir");
    }

    public static void lecturaUsuarios() {
        try (BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Downloads\\usuarios.txt"))) {
            String line = bw.readLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}