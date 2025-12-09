import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; //creo el array

        System.out.println("Introduce 5 números:");
        //pido 5 numeros
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt(); //bucle for que lee y guarda los numeros introducidos al array
        }

        System.out.println("Los números introducidos son:");
        for (int i = 0; i < 5; i++) { //Entrego los numero que introduci al array antes
            System.out.println(numeros[i]);
        }
    }
}
