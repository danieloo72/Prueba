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

    public void agregarlibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarlibros(){
        System.out.println("Libros disponibles: ");
        System.out.println("1. Drácula");
        System.out.println("2. Crónica de una Muerte Anunciada");
        System.out.println("3. El Juego de Ender");
        System.out.println("4. Los Pilares de la Tierra");
        System.out.println("5. El Alquimista");
    }

    public void dejarlibro(){
        System.out.println("1. It");
        System.out.println("2. Cien años de soledad");
        System.out.println("3. 1984");
        System.out.println("4. La sombra del viento");
        System.out.println("5. El gran Gatsby");
        System.out.println("6. Matar a un ruiseñor");
    }
}
