import java.util.Scanner;
public class Arrays5_5 {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros enteros");
        int[] Misnumeros = leernumeros();
        System.out.println("Proceso completado. Primer numero ingresado: " + Misnumeros[0]);
        System.out.println("Ultimo numero ingresado: " + Misnumeros[9]);
        }


    public static int[] leernumeros() {
    Scanner sc = new Scanner(System.in);
        int[] Lista = new int[10];
        for(int i=0; i<Lista.length;i++){
            System.out.print("Numero " + (i + 1) + ": ");
            Lista[i] = sc.nextInt();
    }
        return Lista;
}
}

