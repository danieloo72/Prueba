package Herencia;

public class Vehiculo {

    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}

class Coche extends Vehiculo {

    private String tipoCombustible;
    public Coche(String marca, int velocidadMaxima, String tipoCombustible) {
        super(marca, velocidadMaxima);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}

class Main1 {
    public static void main(String[] args) {

        Coche coche = new Coche("Maseratti", 350, "Gasolina");
        coche.mostrarInformacion();
    }
}