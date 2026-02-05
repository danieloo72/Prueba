package Herencia.Abstracto.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        EmpleadoPorHoras empleado = new EmpleadoPorHoras("Jaime", 4.0, 10);

        System.out.println("Empleado: " + empleado.nombre);
        System.out.println("Salario ganado: " + empleado.calcularSalario());
    }
}
