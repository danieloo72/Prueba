package notasEJ;

import recursos.MyScanner;

public class MainNota {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {



    }

    public static Nota addNota(){
        String nombre = sc.pedirSoloTexto("Introduce el nombre de la asignatura: ");
        double nota = sc.pedirDecimal("Introduce la nota de la asignatura: ");

        return new Nota(nombre, nota);
    }

    public static void pedirNotas(){
        for (int i = 0; i < cantidad)
    }
}
