import java.util.Scanner;
public class Arrays5 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[20];
        System.out.println("Escribe los numeros enteros a mezclar");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + " Para lista A");
            listaA[i] = teclado.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero" + (i + 1) + "Para lista B");
            listaB[i] = teclado.nextInt();
        }
        int indiceC = 0;
        for (int i = 0; i < 10; i++) {
            listaC[indiceC++] = listaA[i];
            listaC[indiceC++] = listaB[i];
        }
        System.out.println("\nLista C (mezclada):");
        for (int i = 0; i < listaC.length; i++) {
            System.out.print(listaC[i] + " "); 
        }


        //public static String Buclefor(){
           // for (int i = 0; i < 10; i++) {
              //  System.out.println("Numero " + (i + 1) + " Para lista A");
                //listaA[i] = teclado.nextInt();
            }
            }
