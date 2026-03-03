package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.http.HttpClient;

public class HttpClientDog {

    private final static Gson gson = new Gson();
    private static JsonObject json = new JsonObject();
    private static JsonArray lista = new JsonArray();
    private static JsonArray sublista = new JsonArray();

    public static JsonObject getDogList(String response) throws IOException, InterruptedException {

        JsonObject jsonRaiz = gson.fromJson(response, JsonObject.class);
        JsonObject message = jsonRaiz.getAsJsonObject("message");

        JsonObject jsonSubRazas = new  JsonObject();
        JsonArray listaSubrazas = new JsonArray();

        for(String raza : message.keySet()){
            JsonArray subrazas = message.getAsJsonArray(raza);
            if (subrazas != null && subrazas.size() > 0) {
                JsonObject obj = new JsonObject();
                obj.addProperty("nombre", raza);
                obj.add("subrazas", subrazas);
                listaSubrazas.add(obj);
            }
        }

        jsonSubRazas.add("Subrazas", listaSubrazas);
        return jsonSubRazas;
    }
}