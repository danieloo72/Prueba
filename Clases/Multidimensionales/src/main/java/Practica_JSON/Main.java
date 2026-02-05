package Practica_JSON;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Multidimensionales/src/main/java/multidimensional/fichero.txt"))) {
            String linea;
            Gson gson = new Gson();
            Map<String, List<String>> producto = new HashMap<>();
            List<String> id = new ArrayList<>();
            List<String> nombre = new ArrayList<>();
            List<String> categoria = new ArrayList<>();
            List<String> marca = new ArrayList<>();
            List<String> precio = new ArrayList<>();
            List<String> stock = new ArrayList<>();
            List<String> stock_minimo = new ArrayList<>();
            List<String> ultima_actualizacion = new ArrayList<>();
            List<String> proveedor = new ArrayList<>();
            List<String> codigo_barras = new ArrayList<>();
            List<String> garantia = new ArrayList<>();

            while ((linea = br.readLine()) != null) {
                if (linea.contains("ID=")) {
                    id.add(linea);
                }
                if (linea.contains("NOMBRE=")) {
                    nombre.add(linea);
                }
                if (linea.contains("CATEGORIA=")) {
                    categoria.add(linea);
                }
                if (linea.contains("MARCA=")) {
                    marca.add(linea);
                }
                if (linea.contains("PRECIO=")) {
                    precio.add(linea);
                }
                if (linea.contains("STOCK=")) {
                    stock.add(linea);
                }
                if (linea.contains("STOCK_MINIMO=")) {
                    stock_minimo.add(linea);
                }
                if (linea.contains("ULTIMA_ACTUALIZACION=")) {
                    ultima_actualizacion.add(linea);
                }
                if (linea.contains("PROVEEDOR=")) {
                    proveedor.add(linea);
                }
                if (linea.contains("CODIGO_BARRAS=")) {
                    codigo_barras.add(linea);
                }
                if (linea.contains("GARANTIA=")) {
                    garantia.add(linea);
                }
            }
            producto.put("ID",id);
            producto.put("NOMBRE",nombre);
            producto.put("CATEGORIA",categoria);
            producto.put("MARCA",marca);
            producto.put("PRECIO",precio);
            producto.put("STOCK",stock);
            producto.put("STOCK_MINIMO",stock_minimo);
            producto.put("ULTIMA_ACTUALIZACION",ultima_actualizacion);
            producto.put("PROVEEDOR",proveedor);
            producto.put("CODIGO_BARRAS",codigo_barras);
            producto.put("GARANTIA",garantia);

//            System.out.println(producto.);

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo " + e.getMessage());
        }
    }
}