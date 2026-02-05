package Herencia.Abstracto.Practica;

public class Triangulo extends Figura {
    protected  double base;
    protected  double altura;

    public Triangulo(String nombre,  double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }
}
