package segunda_evalucion;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Asignatura, Integer> notas = new LinkedHashMap<Asignatura, Integer>();

        Asignatura sistemas = new Asignatura("Sistemas Informaticos", "Linux");
        notas.put(sistemas, 10);

        Asignatura programacion = new Asignatura("Programacion", "Java");
        notas.put(programacion, 10);

        for (Map.Entry<Asignatura, Integer>entry : notas.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("Nota:"+ entry.getValue());
        }
    }
}
