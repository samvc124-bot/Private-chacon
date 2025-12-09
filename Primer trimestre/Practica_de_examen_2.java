import java.util.List;
import java.util.Scanner;
public class Practica_de_examen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Listilla = new int[10];
        System.out.println("Ingresa un numero");
        for (int i = 0; i < Listilla.length; i++) {
            Listilla[i] = sc.nextInt();
            System.out.println("Ingresa otro numero");
        }
        System.out.println("Array normal");
        for (int i = 0; i < Listilla.length; i++) {
            System.out.println(Listilla[i]);
        }
        System.out.println("Array al revez");
        for(int i= Listilla.length -1 ; i>= 0 ; i--){
            System.out.println(Listilla[i] + "");
    }
}
}