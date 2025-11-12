package BibliotecaEJ;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private int registro;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, int registro) {
        this.nombre = nombre;
        this.registro = registro;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void dejarlibro() {
        System.out.println("1. It");
        System.out.println("2. Cien años de soledad");
        System.out.println("3. 1984");
        System.out.println("4. La sombra del viento");
        System.out.println("5. El gran Gatsby");
        System.out.println("6. Matar a un ruiseñor");
    }

    public void añadirlibro(Libro libro) {
        libros.add(libro);
    }

    public void  eliminarlibro(Libro libro) {
        libros.remove(libro);
    }
}
