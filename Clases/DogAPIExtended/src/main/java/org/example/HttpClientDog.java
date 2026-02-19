package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.clases.DogList;
import org.example.clases.DogListResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpClientDog {

    // URL de PokeAPI
    private final String url = "https://dog.ceo/api/breeds/list/all";
    private final String url1 = "https://dog.ceo/api/breed/hound/images";

    // Cliente HTTP
    private final HttpClient client = HttpClient.newHttpClient();

    public List<DogList> getDogList() throws IOException, InterruptedException {

        // Construcción de la petición GET
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        // Envío de la petición
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parseo del JSON
        Gson gson = new Gson();
        DogListResponse data = gson.fromJson(response.body(), DogListResponse.class);

        JsonObject json = new JsonObject();
        JsonArray lista = new JsonArray();

        JsonObject obj1 = new JsonObject();
        obj1.addProperty("nombre: ", url);
        lista.add(obj1);

        JsonObject obj2 = new JsonObject();
        obj2.addProperty("imagenes: ", url1);

        json.add("razas", lista);

        return data.results;
    }
}