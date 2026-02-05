package tiendaEJ;

import java.util.Scanner;

public class TiendaMain {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan", 50);
        Producto producto = new Producto("Leche",10 , 7);
        Producto producto2 = new Producto("Pan",5 , 15);
        Producto producto3 = new Producto("Huevos",8 , 10);

        boolean salida = false;

        while(!salida  && cliente.getSaldo() > 0 ) {

            cliente.mostrarSaldo();

            Scanner sc = new Scanner(System.in);
            System.out.println("Productos disponibles: ");
            System.out.println(" === Producto 1 ===");
            producto.mostrarInfo();
            System.out.println(" === Producto 2 ===");
            producto2.mostrarInfo();
            System.out.println(" === Producto 3 ===");
            producto3.mostrarInfo();
            System.out.println("SALIR");
            System.out.println("Que deseas comprar: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de stock de este producto: " + producto.getStock());
                    System.out.println("Que cantidad de leche deseas comprar: ");
                    int cantidadLeche = sc.nextInt();
                    if (cantidadLeche > 0) {
                        cliente.comprar(producto, cantidadLeche);
                        producto.reducirStock(cantidadLeche);
                    } else {
                        System.out.println("Error al comprar");
                    }
                    break;
                case 2:
                    System.out.println("Cantidad de stock de este producto: " + producto2.getStock());
                    System.out.println("Que cantidad de pan deseas comprar: ");
                    int cantidadPan = sc.nextInt();
                    if (cantidadPan > 0) {
                        cliente.comprar(producto2, cantidadPan);
                        producto.reducirStock(cantidadPan);
                    } else {
                        System.out.println("Error al comprar");
                    }
                    break;
                case 3:
                    System.out.println("Cantidad de stock de este producto: " + producto3.getStock());
                    System.out.println("Que cantidad de huevos deseas comprar: ");
                    int cantidadHuevos = sc.nextInt();
                    if (cantidadHuevos > 0) {
                        cliente.comprar(producto3, cantidadHuevos);
                        producto.reducirStock(cantidadHuevos);
                    } else {
                        System.out.println("Error al comprar");
                    }
                    break;
                case 4:
                    salida = true;
                default:
                    System.out.println("Error al comprar");
            }
        }
    }
}
