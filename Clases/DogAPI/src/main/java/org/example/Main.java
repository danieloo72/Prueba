package org.example;

import org.example.Clases.DogName;

import javax.lang.model.element.Name;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            HttpClientDog http = new HttpClientDog();

            List<DogName> elemento = http.getDogName();

            System.out.println("Nombre: " + elemento.get(0).getName());
            System.out.println("Raza: " + elemento);

            System.out.println("== Lista Nombres ==");

            for (Name dN : elemento.getFirst().getDogNames()) {
                System.out.println("Idioma: " + dN);
                System.out.println("Nombre: " + dN.getName());
            }


        } catch (Exception e) {
            System.out.println("Error al obtener el DogName: ");
        }
    }
}