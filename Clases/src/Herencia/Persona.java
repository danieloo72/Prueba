package Herencia;

public class Persona {

    public String nombre;
    private int edad;
    protected String pais;

    public Persona(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Estudiante extends Persona {

    public Estudiante(String nombre, int edad, String pais) {
        super(nombre, edad, pais);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Pais: " + pais);
    }
}

class Main4 {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Fernando", 20, "España");
        estudiante.mostrarInformacion();
    }
}
