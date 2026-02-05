package Libreria;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private int registro;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.registro = 0;
        this.libros = new ArrayList<>();


        libros.add(new Libro("El fallecimiento del cielo", "Autor desconocido", 1985, "Drama", "ISBN001"));
        libros.add(new Libro("El fantasma de Canterville", "Oscar Wilde", 1887, "Comedia", "ISBN002"));
        libros.add(new Libro("El fundamento del ser", "Martín Heidegger", 1927, "Filosofía", "ISBN003"));
        libros.add(new Libro("Flores en las cumbres", "Emily Brontë", 1847, "Romance", "ISBN004"));
        libros.add(new Libro("La fe de un misionero y sus dones espirituales", "Autor desconocido", 1972, "Religión", "ISBN005"));
        libros.add(new Libro("Las formas de la felicidad", "Bertrand Russell", 1930, "Ensayo", "ISBN006"));
        libros.add(new Libro("Fuenteovejuna", "Lope de Vega", 1619, "Teatro", "ISBN007"));
        libros.add(new Libro("La fierecilla domada", "William Shakespeare", 1590, "Comedia", "ISBN008"));
        libros.add(new Libro("Las Formas del Círculo", "Autor desconocido", 2001, "Poesía", "ISBN009"));
        libros.add(new Libro("Facundo", "Domingo F. Sarmiento", 1845, "Ensayo", "ISBN010"));
        libros.add(new Libro("Felipe III y La Dorada", "Autor desconocido", 1621, "Historia", "ISBN011"));
    }


    public String getNombre() {
        return nombre;
    }


    public void añadirLibro(Libro libro) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                System.out.println("El libro '" + libro.getTitulo() + "' ya existe en la biblioteca.");
                return;
            }
        }

        libros.add(libro);
        registro++;
        System.out.println("Libro añadido correctamente: " + libro.getTitulo());
    }


    public boolean quitarLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(i);
                registro--;
                System.out.println("Libro quitado correctamente: " + titulo);
                return true;
            }
        }
        System.out.println("El libro no existe en la biblioteca.");
        return false;
    }

    void mostrarColeccionCompleta() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            System.out.println("Colección completa de '" + nombre + "':");
            for (Libro libro : libros) {
                libro.mostrarInformacion();
                System.out.println("--------------------------------");
            }
        }
    }
}
