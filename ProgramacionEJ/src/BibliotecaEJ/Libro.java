package BibliotecaEJ;

public class Libro {
    //Atributos
    protected String titulo;
    protected String autor;
    protected int ISBN;
    protected String genero;
    protected int año;

    //Constructor
    public Libro(String titulo, String autor, int ISBN, String genero, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.genero = genero;
        this.año = año;
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Genero: " + this.genero);
        System.out.println("Año: " + this.año);

    }
}

