//package Lectura_archivos;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Main {
//
//    public static ArrayList<String> nombres = new ArrayList<>();
//    public static ArrayList<String> nacionalidades = new ArrayList<>();
//    public static ArrayList<String> edades = new ArrayList<>();
//
//    public static void main(String[] args) throws IOException {
//        try (
//                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Downloads\\archivo.txt"))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                if (linea.contains("@empleados")) {
//                    String nombre = linea.split(" ")[1];
//                    nombres.add(nombre);
//                    System.out.println("Nombre: " + nombre);
//                }
////                if (linea.contains("@nacionalidad")) {
////                    System.out.println("Nacional del empleado: " + linea);
////                }
////                if (linea.contains("@edad")) {
////                    System.out.println("Edad del empleado: " + linea);
////                }
////
////                if (linea.contains("@")) {
////                    String nombre = linea.split(" ")[0];
////                    String edad = linea.split(" ")[0];
////                    System.out.println("Nombre del empleado: " + nombre);
////                    System.out.println("Edad del empleado: " + edad);
////                }
//
//
//                HashMap<String, ArrayList<String>> empleados = new HashMap<>();
//
//                nombres.add(linea);
//                nacionalidades.add(linea);
//                edades.add(linea);
//
//                empleados.put(linea, nombres);
//
//                if (empleados.get(linea).contains("@")) {
//
//                    for (String nombre : nombres) {
//                        System.out.println(nombre);
//                        String nombre = linea.split(" ")[0];
////                        nombres = linea.split(" ")[2];
//                    }
//
//                if (empleados.get(linea).contains("@")) {}
////                    nacionalidades = linea.split()
//                    for (String nombre : nombres) {
//                        System.out.println(nombre);
//                    }
//                }
//
//            }
//        } catch (
//                IOException e) {
//            System.out.println("Error al leer el archivo: " + e.getMessage());
//        }
//    }
//}
//
//
//
//
//












////                // 2. Extraer valor después de la etiqueta usando split(" ")
////                if (linea.contains("@empleados")) {
////                    String nombre = linea.split(" ")[1]; // El índice 1 es lo que sigue al espacio
////                    nombres.add(nombre);
////                    System.out.println("Nombre guardado: " + nombre);
////                }
////                else if (linea.contains("@nacionalidad")) {
////                    String nacionalidad = linea.split(" ")[1];
////                    nacionalidades.add(nacionalidad);
////                }
////                else if (linea.contains("@edad")) {
////                    String edad = linea.split(" ")[1];
////                    edades.add(edad);
////                }
////            }
////
////            // 3. Mostrar resultados finales
////            System.out.println("\nLista total de empleados: " + nombres);
////
////        } catch (IOException e) {
////            System.out.println("Error al leer el archivo: " + e.getMessage());
////        } catch (ArrayIndexOutOfBoundsException e) {
////            System.out.println("Error: Una línea con @ no tiene contenido después.");
////        }
////    }
////}
