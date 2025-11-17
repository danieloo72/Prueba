import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año para comprobar si es bisiesto: ");
        int año = sc.nextInt();
        int formula1 = año % 4;
        int formula2 = año % 100;
        int formula3 = año % 400;

        if (formula1 == 0 && formula2 != 0 || formula3 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
}
