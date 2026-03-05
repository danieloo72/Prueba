package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDog {

    private final static Gson gson = new Gson();

    public static JsonObject getDogList(String response) throws IOException, InterruptedException {

        JsonObject jsonRaiz = gson.fromJson(response, JsonObject.class);
        JsonObject message = jsonRaiz.getAsJsonObject("message");

        JsonObject jsonSubRazas = new  JsonObject();
        JsonArray listaSubrazas = new JsonArray();

        for(String raza : message.keySet()){
            JsonArray subrazas = message.getAsJsonArray(raza);
            if (subrazas != null && !subrazas.isEmpty()) {
                JsonObject obj = new JsonObject();
                obj.addProperty("nombre", raza);
                obj.add("subrazas", subrazas);
                listaSubrazas.add(obj);
            }
        }

        jsonSubRazas.add("Subrazas", listaSubrazas);
        return jsonSubRazas;
    }

    public static String getImages(String path, HttpClient client) throws IOException, InterruptedException {

        String [] img = path.split("/");
        String num = img[3];
        String apiUrl = "https://dog.ceo/api/breeds/image/random/" + num;

        HttpRequest request = HttpRequest.newBuilder(URI.create(apiUrl)).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}