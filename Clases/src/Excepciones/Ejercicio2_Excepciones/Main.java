package Excepciones.Ejercicio2_Excepciones;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("Agua", 1);

        try {
            producto.setPrecio(-67.0);
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
