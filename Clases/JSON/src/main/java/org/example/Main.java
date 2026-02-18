package org.example;

import com.google.gson.*;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            Gson gson = new Gson();
            JsonObject cliente = gson.fromJson(
                    new FileReader("JSON/data/LecturaJSON.json"), JsonObject.class
            );
            System.out.println(cliente);

        } catch (IOException e) {
            System.out.println("Error al leer los datos" + e.getMessage());
        }
    }
}

