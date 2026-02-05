package Herencia;

interface Administrador2 {
    void administrador2();
}

interface Tecnico2 {
    void tecnico2();
}

public class Empleado2 implements Administrador2, Tecnico2 {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado2() {
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Salario: " + this.salario);
    }

    @Override
    public void administrador2() {
        System.out.println("Administrador");
        nombre = "Maria";
        edad = 28;
        salario = 2000;
        mostrarInformacion();
    }

    @Override
    public void tecnico2() {
        System.out.println("Tecnico");
        nombre = "Juan";
        edad = 25;
        salario = 1500;
        mostrarInformacion();
    }
}

class Main2 {
    public static void main(String[] args) {

        Empleado2 empleado = new Empleado2();
        empleado.administrador2();
        empleado.tecnico2();

    }
}