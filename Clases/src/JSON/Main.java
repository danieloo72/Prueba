//package JSON;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        try {
//            Gson gson = new GSon();
//            JsonObject cliente = gson.fromJson(new FileReader("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Documents\\Programacion\\JSON\\LecturaJSON.json"), JsonObject.class);
//        } catch (IOException e) {
//            System.out.println("Error al cargar el archivo: " + e.getMessage());
//        }
//    }
//}