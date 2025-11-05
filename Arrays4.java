import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] arg) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }
            for (int x = 0, y = 9; x <= y; x++, y--) {
                System.out.println(numeros[x]);
                if (x != y) {
                    System.out.println(numeros[y]);
                }
            }

        }
    }

