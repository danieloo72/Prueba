package Practica2_JSON;

import java.io.*;
import java.util.ArrayList;

public class Main {

    ArrayList<String> estudiantes = new  ArrayList<>();

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Multidimensionales/src/main/java/Practica2_JSON/estudiantes.txt"))) {
            String lectura;
            while ((lectura = br.readLine()) != null) {
                System.out.println(lectura);
                String[] datos = lectura.split(",");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Multidimensionales/src/main/java/Practica2_JSON/estudiantes.txt"))) {
                String estudiante;
                double nota = 0;
                double nota10 = nota * 0.1;
                if (nota10 >= .5) {

                }
                bw.write("Nota con el 10%: " + nota10);
            } catch (IOException e) {
                System.out.println("Error al escribir los datos" + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo" + e.getMessage());
        }

    }
}

