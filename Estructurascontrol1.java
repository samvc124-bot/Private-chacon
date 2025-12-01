import java.util.Scanner;
class Estructurascontrol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año");
        int año = sc.nextInt();

        System.out.println("Introduce el mes");
        int mes = sc.nextInt();

        System.out.println("Introduce el dia");
        int dia = sc.nextInt();


        if (esFechaValida(año, mes, dia)) {
            System.out.println("La fecha ingresada (" + año + -+mes + -dia + ") es VALIDA.");
        } else {
            System.out.println("La fecha ingresada (" + año + - + mes + - dia + ") NO es VALIDA.");
        }
    }

    public static boolean esFechaValida(int año, int mes, int dia) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        }
        if (mes == 2) {
            if (dia > 28) {
                return false;

            }
        }

        return true;
    }
}

