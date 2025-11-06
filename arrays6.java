import java.util.Scanner;

public class arrays6 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        int[] Lista1 = new int[10];
        System.out.println("Escribe los 10 numeros");
        for (int i = 0; i < Lista1.length; i++) {
            Lista1[i] = teclado.nextInt();
        }
            int creciente = 0;
            int decreciente = 0;
            for (int i = 0; i < Lista1.length - 1; i++) {

                if (Lista1[i] < Lista1[i + 1]) {
                    creciente++;
                } else if (Lista1[i] > Lista1[i + 1]) {
                    decreciente++;
                }
            }
            if (creciente == Lista1.length - 1) {
                System.out.println("Es creciente");
            } else if (decreciente == Lista1.length - 1) {
                System.out.println("Es decreciente");
            } else {
                System.out.println("Es aleatorio");
            }
        }
    }
//ehh en conclusion creo los int creciente y decreciente como contadores que empiezan en 0, asi luego si creciente es igual que Lista1.length -1 que seria 9 es creciente caso contrario decreciente si 9 es == que el contador decreciente y el else if es pa eso, else a eso osea si al final el decreciente o creciente es igual a otro numero q no sea 9 es aleatorio

