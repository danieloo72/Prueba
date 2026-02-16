package org.example;

import com.google.gson.Gson;
import org.example.Clases.DogName;
import org.example.Clases.DogNameResponse;

import javax.lang.model.element.Name;
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

    public List<DogName> getDogName() throws IOException, InterruptedException {

        // Construcción de la petición GET
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        // Envío de la petición
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parseo del JSON
        Gson gson = new Gson();
        DogNameResponse data = gson.fromJson(response.body(), DogNameResponse.class);

        return data.results;
    }
}