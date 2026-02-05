package Lectura_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Lectura {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Downloads\\archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] nombres = linea.split(" ");
                for (String nombre : nombres) {
                    System.out.println(nombre);
                }
//                System.out.println(linea);
            }
        }  catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}