package Herencia;

public class Vehiculo2 {

    private String marca;
    private int  velocidadMaxima;

    public Vehiculo2(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidad maxima: " + this.velocidadMaxima);
    }
}

class Coche2 extends Vehiculo2 {

    private int numeroPuertas;
    public Coche2(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero puertas: " + this.numeroPuertas);
    }
}

class Main3 {
    public static void main(String[] args) {

        Vehiculo2 vehiculo = new Vehiculo2("Lamborghini", 500);
        Coche2 coche = new Coche2("Corvette", 480, 2);
        vehiculo.mostrarInformacion();
        coche.mostrarInformacion();
    }
}
