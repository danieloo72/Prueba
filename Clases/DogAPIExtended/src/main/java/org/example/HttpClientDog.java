//package org.example;
//
//import com.google.gson.Gson;
//import controllers.DogsController;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.List;
//
//public class HttpClientDog {
//
//    // URL de PokeAPI
//    private final String url = "https://dog.ceo/api/breeds/list/all";
//    private final String url1 = "https://dog.ceo/api/breed/hound/images";
//
//    // Cliente HTTP
//    private final HttpClient client = HttpClient.newHttpClient();
//
//    public List<DogsController> getDogName() throws IOException, InterruptedException {
//
//        // Construcción de la petición GET
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
//
//        // Envío de la petición
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        // Parseo del JSON
//        Gson gson = new Gson();
//        List<DogsController> data = gson.fromJson(response.body(), DogsController.class);
//
//        return data;
//    }
//}