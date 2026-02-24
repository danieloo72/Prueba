package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.http.HttpClient;

public class HttpClientDog {

    // Cliente HTTP
    private final HttpClient client = HttpClient.newHttpClient();
    private final static Gson gson = new Gson();
    private static JsonObject json = new JsonObject();
    private static JsonArray lista = new JsonArray();

    public static JsonObject getDogList(String response) throws IOException, InterruptedException {

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

        JsonObject JsonRoot = gson.fromJson(response, JsonObject.class);

        JsonObject mensaje = JsonRoot.getAsJsonObject();
        System.out.println(mensaje);
        for(String subraza : mensaje.keySet()){
            JsonArray obj2 = new JsonArray();
            obj2.addProperty("subraza: ", subraza);
            lista.add(obj2);
        }
        json.add("nombre",lista);
        System.out.println(json);

        return json;
    }
}