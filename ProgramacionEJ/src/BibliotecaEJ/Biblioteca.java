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
        for (Libro libro : libros) {
//            libro.mostrarInformacion();
        }
    }
}
