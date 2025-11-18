public class SumaArray {
    public static void main(String[] args) {

        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (int i : numeros) {
            System.out.println(suma += i);
        }
    }
}
