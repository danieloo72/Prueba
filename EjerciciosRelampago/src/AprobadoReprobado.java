import java.util.Scanner;

public class AprobadoReprobado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la nota: ");
        float nota = sc.nextFloat();
        if (nota >= 5 && nota <= 10) {
            System.out.print("Aprobado");
        } else if (nota >= 0 && nota < 5) {
            System.out.print("Reprobado");
        }else {
            System.out.print("Error");
        }
    }
}
