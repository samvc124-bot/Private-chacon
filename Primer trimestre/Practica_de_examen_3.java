import java.util.Scanner;
class Practica_de_examen_3 {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] primo = new int[10];
        int[] dobleprimo = new int[10];
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] < 2) {
                return false;
            }
        }
        for (int i = 2; i <= Math.sqrt(numeros[i]); i++) {
            if (numeros[i] % 1 == 0) {
                return false;
            }
        }
        return true;
    }

}
