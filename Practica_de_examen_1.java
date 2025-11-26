import java.util.Scanner;
public class Practica_de_examen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] List1 = new int[20];
        for (int i = 0; i < List1.length; i++) {
            System.out.println("Ingresa un numero");
            List1[i] = sc.nextInt();
        }
        int suma = 0;

        for (int numero : List1) {
            suma = suma + numero;
        }
        int media = suma / List1.length;

        int max = List1[0];
        int posicionmax = 0;
        for (int i = 1; i < List1.length; i++) {
            if (List1[i] > max) {
                max = List1[i];
                posicionmax = i;
            }
        }
        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("La media de los numeros introducidos es: " + media);
        System.out.println("El número más alto es: " + max);
        System.out.println("La posicion del nummero mas alto que ingresaste es : " + (posicionmax+1));
    }
}


