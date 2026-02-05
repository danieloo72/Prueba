package tiendaEJ;

public class Cliente {

    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double comprar(Producto p, int cantidad){
        double comprar = saldo - (p.getPrecio() * cantidad);
        if (comprar < 0){
            System.out.println("No se puede comprar porque se quedaría saldo negativo");
        } else {
            System.out.println("Te has gastado " + comprar + "€");
        }
        return comprar;
    }
    public void mostrarSaldo(){
        System.out.println("Saldo: " + this.saldo + "€");
    }
}
