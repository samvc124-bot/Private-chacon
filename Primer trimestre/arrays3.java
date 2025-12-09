import java.util.Scanner;

public class arrays3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }


        int suma = 0;

        for (int numero : numeros) {
            suma = suma + numero;

        }

        System.out.println("La suma total de los números introducidos es: " + suma);

        }

}
