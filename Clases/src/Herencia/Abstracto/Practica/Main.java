package Herencia.Abstracto.Practica;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo("Isosceles", 5, 12);

        System.out.println(triangulo.nombre);
        System.out.println(triangulo.calcularArea());
    }
}
