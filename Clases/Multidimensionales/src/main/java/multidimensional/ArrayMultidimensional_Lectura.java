package multidimensional;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;

public class ArrayMultidimensional_Lectura {
    public static void main(String[] args) {

        try {
                Gson gson = new Gson();
                JsonObject nombres = gson.fromJson(
                        new FileReader("Multidimensionales/data/nombres.json"), JsonObject.class
                );
            System.out.println(nombres);
        } catch (IOException e) {
            System.out.println("Error al leer los datos" + e.getMessage());
        }
    }
}

