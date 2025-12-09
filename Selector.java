import java.util.Scanner;

public class Selector {
    public static void main(String[] args) {
        Scanner Variable = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        java.util.Scanner Numfact1 = new java.util.Scanner(System.in);
        java.util.Scanner Numdowhile = new java.util.Scanner(System.in);
        int eleccion;

        do{
            System.out.println("Elige una operacion a realizar:");
            System.out.println("1. Par o impar");
            System.out.println("2. Factorial");
            System.out.println("3. Detectar numero introducido");
            System.out.println("4. Conteo descendente hasta 0 usando do while");
            System.out.print("5. salir");
            System.out.println("");
            eleccion = Variable.nextInt();
            switch (eleccion) {
                case 1:

                    System.out.println("Haz elegido par o impar");
                    System.out.println("introducir un numero:");
                    int numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("el numero introducido es par: " + numero);
                    } else {
                        System.out.println("el numero introducido es impar: " + numero);
                    }
                    break;
                case 2:
                    System.out.println("Haz elegido factorial");
                    System.out.println("introucir un numero para calcular su factorial:");
                    int factnum = Numfact1.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <=   factnum; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " +    factnum + " es: " + factorial);
                    break;
                case 3:
                    System.out.println("Haz elegido detectar numero introducido");
                    System.out.println("introducir un numero:");
                    int scannum = scan.nextInt();
                    System.out.println("el numero introducido es: " + scannum);
                    break;
                case 4:
                    System.out.println("Haz elegido conteo descendente hasta 0 usando do while");
                    System.out.println("Introduce un numero y usaremos conteo descendente hasta 0 usando do while:");
                    int dowhilenum = Numdowhile.nextInt();
                    int contador = dowhilenum;
                    do {
                        System.out.println(contador);
                        contador--;
                    } while (contador >= 0);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Operacion no valida");
                    break;

            }
        }
        while (eleccion <= 4);
    }
}