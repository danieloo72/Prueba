import recursos.MyScanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Productos {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();
        productos.add("Huevos");
        productos.add("Leche");
        productos.add("Papel");
        productos.add("Agua");
        productos.add("Pan");

        Map<String, Integer> precio = new HashMap<>();

        for (String producto : productos) {
            precio.put(producto, sc.pedirNumero("Ingrese el precio para cada producto, " + producto + " : "));
        }

        System.out.println("=== PRECIOS ===");
        for (String producto : productos) {
            System.out.println(producto + ": " + precio.get(producto));
        }
    }
}
