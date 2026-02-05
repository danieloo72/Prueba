package Excepciones.Ejercicio2_Excepciones;

public class Producto {

    protected String nombre;
    protected int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo.");
        }
    }
}
