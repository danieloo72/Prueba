package Lectura_archivos;

import java.io.*;

public class Escritura {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Downloads\\lectura.txt"))) {
            bw.write("Primera línea");
            bw.newLine();
            bw.write("Segunda línea");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
