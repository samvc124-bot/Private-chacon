import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int[] lista = new int[5]; //creo el array
        int cont_ceros = 0;
        int suma_pos = 0;
        int suma_neg = 0;
        int cont_pos = 0;
        int cont_neg = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el numero:");
            lista[i] = teclado.nextInt();
        }

        for (int i = 0; i < lista.length; i++)
            if (lista[i] == 0) {
                cont_ceros++;
            } else if (lista[i] > 0) {
                suma_pos += lista[i];
                cont_pos++;
            } else {
                suma_neg += lista[i];
                cont_neg++;
            }
        System.out.println("Cantidad de ceros: " + cont_ceros);
        if (cont_pos > 0) {
            double mediapositivos = suma_pos / cont_pos;
            System.out.println("La media de los positivos es :" + mediapositivos);
        } else {
            System.out.println("Los valores establecidos no son positivos");
        }
        if (cont_neg > 0) {
        double mediasnegativas = suma_neg / cont_neg;
        System.out.println("La media negativa es :" + mediasnegativas);
    } else {System.out.println("Los valores introducidos no son negativos"); }
    }
    }

