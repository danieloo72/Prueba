import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el temperatura en celsius: ");
        float tempCelsius = sc.nextFloat();
        float conversor = (tempCelsius * 9/5) + 32;

        System.out.println(conversor + " ºF");
    }
}