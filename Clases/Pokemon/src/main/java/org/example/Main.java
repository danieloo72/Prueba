package org.example;

public class Main {

    public static void main(String[] args) {

        try {
            HttpClientPokemon http = new HttpClientPokemon();

            HttpClientPokemon.EncounterMethod elemento = http.getEncounterMethod();

            System.out.println("ID: " + elemento.getId());
            System.out.println("Name: " + elemento.getName());
            System.out.println("Order: " + elemento.getOrder());

            System.out.println("== Lista Nombres ==");

            for (HttpClientPokemon.Name eM : elemento.getNames()) {
                System.out.println("Idioma: " + eM.getLanguage().getName());
                System.out.println("Nombre: " + eM.getName());
            }


        } catch (Exception e) {
            System.out.println("Error al obtener el encounter method");
        }
    }

    public static void menu() {
        System.out.println("=== PokemonApi ===");
        System.out.println("1. Mostrar Encounter Method");
    }
}


