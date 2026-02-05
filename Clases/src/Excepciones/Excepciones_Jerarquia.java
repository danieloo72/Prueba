//package Excepciones;
//
//import java.net.MalformedURLException;
//import java.net.UnknownHostException;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.time.format.DateTimeParseException;
//import java.util.InputMismatchException;
//import java.util.concurrent.TimeoutException;
//
///**
// * Clase de ejemplo para visualizar la jerarquía y descripción de Excepciones en Java.
// * Nota: El orden de los catch va de la más específica a la más genérica.
// */
//public class Excepciones_Jerarquia {
//    public static void main(String[] args) {
//
//        try {
//            System.out.println("Ejecutando lógica de prueba...");
//        }
//        /* --- EXCEPCIONES ESPECÍFICAS DE RUNTIME (Unchecked) --- */
//
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error que se produce al intentar acceder a un número de índice que no existe en una matriz.");
//        }
//        catch (NullPointerException e) {
//            System.out.println("Error que se produce al intentar acceder a una referencia de objeto que es nula.");
//        }
//        catch (NumberFormatException e) {
//            System.out.println("Error cuando no es posible convertir una cadena especificada a un tipo numérico.");
//        }
//        catch (InputMismatchException e) {
//            System.out.println("Error cuando se hace mal la introducción de datos (ej: texto en numeros)");
//        }
//        catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Error que se produce al intentar acceder a un carácter en una cadena que no existe.");
//        }
//        catch (IllegalStateException e) {
//            System.out.println("Error que se produce cuando se invoca un método en un momento no válido.");
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("Error que indica que un método ha recibido un argumento con un valor no válido o inapropiado.");
//        }
//        catch (NegativeArraySizeException e) {
//            System.out.println("Tamaño de array negativo: No se puede crear un array con longitud menor a 0.");
//        }
//        catch (ArrayStoreException e) {
//            System.out.println("Almacenamiento de array: Tipo de objeto incompatible con el array.");
//        }
//
//        /* --- EXCEPCIONES VERIFICADAS (Checked - Requieren manejo obligatorio) --- */
//
//        catch (SQLException e) {
//            System.out.println("Error que ocurre cuando hay errores al interactuar con una base de datos.");
//        }
//        catch (MalformedURLException e) {
//            System.out.println("Error que se lanza cuando se intenta crear un objeto URL a partir de una cadena que no tiene un formato web válido.");
//        }
//        catch (UnknownHostException e) {
//            System.out.println("Host desconocido: No se pudo encontrar la dirección IP del servidor.");
//        }
//        catch (ParseException e) {
//            System.out.println("Error que ocurre habitualmente al trabajar con fechas o formatos de texto específicos (ej. convertir un String a un objeto Date) si el texto no coincide con el formato esperado.");
//        }
//        catch (TimeoutException e) {
//            System.out.println("Error por tiempo de espera agotado: La operación tardó demasiado.");
//        }
//        catch (NoSuchFieldException e) {
//            System.out.println("Error por campo no encontrado: No existe el atributo solicitado en la clase.");
//        }
//
//        /* --- EXCEPCIONES DE INICIALIZACIÓN Y GENERALES --- */
//
//        catch (ExceptionInInitializerError e) {
//            System.out.println("Error de inicialización: Falló un bloque estático de la clase.");
//        }
//        catch (TypeNotPresentException e) {
//            System.out.println("Error que se produce cuando no se encuentra un type.");
//        }
//        catch (RuntimeException e) {
//            // Captura cualquier otra excepción de tiempo de ejecución no listada arriba
//            System.out.println("Error cuando se genera una excepción en tiempo de ejecución");
//        }
//        catch (Exception e) {
//            // El "padre" de todas las excepciones (siempre al final)
//            System.out.println("Error general inesperado: " + e.getMessage());
//        }
//    }
//}