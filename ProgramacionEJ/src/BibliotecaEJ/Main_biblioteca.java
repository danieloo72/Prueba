package BibliotecaEJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_biblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("JaiserYT", 101);
        Libro libro = new Libro(titulo, "Stephen King", 849759379, "Terror", 2003);

        biblioteca.añadirlibro((new Libro("Drácula", "Bram Stoker", 97884272, "Terror", 1897)));
        biblioteca.añadirlibro((new Libro("Crónica de una Muerte Anunciada", "Gabriel García Márquez", 978014015, "Realismo mágico", 1981)));
        biblioteca.añadirlibro((new Libro("El Juego de Ender", "Orson Scott Card", 978076537, "Ciencia ficción", 1985)));
        biblioteca.añadirlibro((new Libro("Los Pilares de la Tierra", "Ken Follett", 978033351, "Ficción histórica", 1989)));
        biblioteca.añadirlibro((new Libro("El Alquimista", "Paulo Coelho", 978006250, "Aventura", 1988)));

        Scanner sc = new Scanner(System.in);

        boolean salida = false;

        System.out.println("Bienvenido a la biblioteca " + biblioteca.getNombre());

        while (!salida) {
            System.out.println("<=== MENÚ ===>");
            System.out.println("1. Coger libro");
            System.out.println("2. Dejar libro");
            System.out.println("3. Salir");
            System.out.print("Que deseas hacer: ");
            int respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Estos son los libros que tenemos.");
                    for (int i = 0; i < biblioteca.getLibros().size(); i++) {
                        System.out.println("Título: " + biblioteca.getLibros().get(i).getTitulo() + "   Autor: " + biblioteca.getLibros().get(i).getAutor() + "   ISBN: " + biblioteca.getLibros().get(i).getISBN() + "   Género: " + biblioteca.getLibros().get(i).getGenero() + "   Año: " + biblioteca.getLibros().get(i).getAño());
                    }
                    System.out.print("Que libro deseas coger: ");
                    // Mostrar los titulos de los libros que tienes en  biblioteca. Cuando lo encuentres o elijas, pilla solo ese y  paretir de ahi lo manejas
                    int respuesta2 = sc.nextInt();

                    switch (respuesta2) {
                        case 1:
                            System.out.println("Has cogido el libro: ");
                            libro.setTitulo("Dracula"); libro.setAutor("Bram Stoker"); libro.setISBN(97884272); libro.setGenero("Terror"); libro.setAño(1897);
                            libro.mostrarInformacion();
                            biblioteca.getLibros().remove(0);
                            break;
                        case 2:
                            System.out.println("Has cogido el libro: ");
                            libro.setTitulo("Crónica de una muerte anunciada"); libro.setAutor("Gabriel García Márquez"); libro.setISBN(978014015); libro.setGenero("Realismo mágico"); libro.setAño(1981);
                            libro.mostrarInformacion();
                            biblioteca.getLibros().remove(1);
                            break;
                        case 3:
                            System.out.println("Has cogido el libro: ");
                            libro.setTitulo("El Juego de Ender"); libro.setAutor("Orson Scott Card"); libro.setISBN(978076537); libro.setGenero("Ciencia ficción"); libro.setAño(1985);
                            libro.mostrarInformacion();
                            biblioteca.getLibros().remove(2);
                            break;
                        case 4:
                            System.out.println("Has cogido el libro: ");
                            libro.setTitulo("Los Pilares de la Tierra"); libro.setAutor("Ken Follett"); libro.setISBN(978033351); libro.setGenero("Ficción histórica"); libro.setAño(1989);
                            libro.mostrarInformacion();
                            biblioteca.getLibros().remove(3);
                            break;
                        case 5:
                            System.out.println("Has cogido el libro: ");
                            libro.setTitulo("El Alquimista"); libro.setAutor("Paulo Coelho"); libro.setISBN(978006250); libro.setGenero("Aventura"); libro.setAño(1988);
                            libro.mostrarInformacion();
                            biblioteca.getLibros().remove(4);
                            break;
                        default:
                            System.out.println("No se ha seleccionado una opción válida.");
                    }
                    break;
                case 2:
                    biblioteca.dejarlibro();
                    for (int i = 0; i < biblioteca.getLibros().size(); i++) {
                        System.out.println("Título: " + biblioteca.getLibros().get(i).getTitulo() + "   Autor: " + biblioteca.getLibros().get(i).getAutor() + "   ISBN: " + biblioteca.getLibros().get(i).getISBN() + "   Género: " + biblioteca.getLibros().get(i).getGenero() + "   Año: " + biblioteca.getLibros().get(i).getAño());
                    }
                    System.out.println("Que libro quieres dejar: ");
                    int respuesta3 = sc.nextInt();

                    switch (respuesta3) {
                        case 1:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("It", "Stephen King", 849759379, "Terror", 2003));
                            break;
                        case 2:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("Cien años de soledad", "Gabriel García Márquez", 97884722, "Novela histórica", 1967));
                            break;
                        case 3:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("1984", "George Orwell", 97804522, "Ciencia ficción", 1949));
                            System.out.println(biblioteca.getLibros());
                            break;
                        case 4:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 978849509, "Thriller", 2001));
                            break;
                        case 5:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("El gran Gatsby", "F. Scott Fitzgerald", 978074327, "Ficción clásica", 1925));
                            break;
                        case 6:
                            System.out.println("Has dejado el libro: ");
                            libro.mostrarInformacion();
                            biblioteca.getLibros().add(new Libro("Matar a un ruiseñor", "Harper Lee", 978006112, "Drama", 1960));
                            break;
                        default:
                            System.out.println("Error, esa opción no existe.");
                    }
                    break;
                case 3:
                    System.out.println("Esperemos que haya disfrutado de la estancia.");
                    salida = true;
                    break;
                default:
                    System.out.println("Error, no existe esa opción.");
            }
        }
    }
}
