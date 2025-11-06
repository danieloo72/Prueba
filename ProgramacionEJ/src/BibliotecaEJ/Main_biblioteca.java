package BibliotecaEJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_biblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("JaiserYT", 101);
        Libro libro = new Libro("It", "Stephen King", 849759379, "Terror", 2003);

        Scanner sc = new Scanner(System.in);

        boolean salida;

        System.out.println("Bienvenido a la biblioteca " + biblioteca.getNombre());
        System.out.println("<=== MENÚ ===>");
        System.out.println("1. Coger libro");
        System.out.println("2. Dejar libro");
        System.out.println("3. Salir");
        System.out.print("Que deseas hacer: ");
        int respuesta = sc.nextInt();
        ArrayList<Libro> libros = new ArrayList();

        switch (respuesta) {
            case 1:
                System.out.println("Estos son los libros que tenemos.");
                biblioteca.mostrarlibros();
                break;
            case 2:
                for (int i = 0; i < libros.size(); i++) {
                    System.out.println("Título: " + libros.get(i).getTitulo() + "   Autor: " + libros.get(i).getAutor() + "   ISBN: " + libros.get(i).getISBN() + "   Género: " + libros.get(i).getGenero() + "   Año: " + libros.get(i).getAño());
                }
                System.out.println("Que libro quieres dejar: ");
                int respuesta2 = sc.nextInt();

                switch (respuesta2) {
                    case 1:
                        libros.add(new Libro("It", "Stephen King", 849759379, "Terror", 2003));
                    case 2:
                        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 97884722, "Novela histórica", 1967));
                    case 3:
                        libros.add(new Libro("1984", "George Orwell", 97804522, "Ciencia ficción", 1949));
                    case 4:
                        libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 978849509, "Thriller", 2001));
                    case 5:
                        libros.add(new Libro("El gran Gatsby", "F. Scott Fitzgerald", 978074327, "Ficción clásica", 1925));
                    case 6:
                        libros.add(new Libro("Matar a un ruiseñor", "Harper Lee", 978006112, "Drama", 1960));
                    default:
                        System.out.println("Error, esa opción no existe.");
                }
                break;
            case 3:
                System.out.println("Esperemos que haya disfrutado de la estancia.");
                break;
            default:
                System.out.println("Error, no existe esa opción.");
        }
    }
}
