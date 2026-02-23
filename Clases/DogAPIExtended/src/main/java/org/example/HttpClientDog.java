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

    // Cliente HTTP
    private final HttpClient client = HttpClient.newHttpClient();

    public static JsonObject getDogList(String response) throws IOException, InterruptedException {

             // Parseo del JSON
        Gson gson = new Gson();

        JsonObject json = new JsonObject();
        JsonArray lista = new JsonArray();

//        JsonObject obj1 = new JsonObject();
//        obj1.addProperty("nombre: ", url);
//        lista.add(obj1);
//
//        JsonObject obj2 = new JsonObject();
//        obj2.addProperty("imagenes: ", url1);

        JsonObject jsonRaiz = gson.fromJson(response, JsonObject.class);
        JsonObject message = jsonRaiz.getAsJsonObject("message");
        System.out.println(message);
        for(String raza : message.keySet()){
            JsonObject obj1 = new JsonObject();
            obj1.addProperty("nombre: ", raza);
            lista.add(obj1);
        }
        json.add("Perros",lista);
        System.out.println(json);

        return json;
    }

    public static JsonObject getSubRaza(String response) throws IOException, InterruptedException {

        JsonObject jsonRaiz = gson.from(response, JsonObject.class);
    }
}