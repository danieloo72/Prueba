package multidimensional;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArrayMultidimensional_Escritura {
    public static void main(String[] args) {

    String[][] nombres = {
            {"Juan", "Garcia", "Ruiz"},
            {"Fernando", "Martinez", "Garcia"},
            {"Maria", "Sanchez", "Lopez"}
    };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Documents\\Repositorio\\Prueba\\Clases\\Multidimensionales\\src\\main\\java\\org\\example\\array.txt"))) {
            String nombre;
            for (String[] arrayNombres : nombres) {
                for (int i = 0; i < arrayNombres.length; i++) {
                    bw.write(arrayNombres[i]);
                    bw.newLine();
                    nombre = arrayNombres[i];
                    System.out.println(nombre);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}