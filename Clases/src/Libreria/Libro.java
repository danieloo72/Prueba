package Libreria;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int año;
    private String genero;

    public Libro(String titulo, String autor, int año, String drama, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
        this.ISBN = (int) (Math.random() * 100000);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarInformacion() {
        System.out.println("----------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Género: " + genero);
        System.out.println("ISBN: " + ISBN);
    }

}
