package org.example;

import com.google.gson.Gson;
import org.example.Clase.EncounterMethod;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpClientPokemon {

    // URL de PokeAPI
    private final String url1 = "https://pokeapi.co/api/v2/encounter-method/1/";

    // Cliente HTTP
    private final HttpClient client = HttpClient.newHttpClient();
    private final HttpClient encounterMethod =  HttpClient.newHttpClient();

    // Metodo principal que hace la petición y devuelve los Pokémon
    public List EncounterMethod getEncounterMethod() throws IOException, InterruptedException {

        // Construcción de la petición GET
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url1)).GET().build();

        // Envío de la petición
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parseo del JSON
        Gson gson = new Gson();
        EncounterMethod data = gson.fromJson(response.body(), EncounterMethod.class);

        return data;
    }

    public static class DataList {
        String name;
        String url1;
    }
}



