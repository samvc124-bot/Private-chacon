import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        bucleexterior:
        while (true) {
            System.out.println("Selecciones una opción del menu\n"
                    + "1- Calcula longitud del círculo.\n"
                    + "2- Calcula EL área del círculo\n"
                    + "3- Calcula la media.\n"
                    + "0- para salir ");
            int opcion = Integer.parseInt(puntoComa());
            switch (opcion) {
                case 1:
                    System.out.println("Introduce Radio del Circulo en m");
                    System.out.println("La longitud del círculo es " + longitud() + "m");
                    break;
                case 2:
                    System.out.println("Introduce Radio del Circulo en m");
                    System.out.println("La longitud del círculo es " + area() + "m");
                    break;
                case 3:
                    System.out.println("Que tipo de media quieres?\n"
                            + "a- Para redondeo sin decimales\n"
                            + "b. La media en bruto\n"
                            + "c- La media con 1 decimal\n");
                    String queMedia = puntoComa();
                    switch (queMedia) {
                        case "a":
                            System.out.println("La media es: " + Math.round(media()) + "\n");
                            break;
                        case "b":
                            System.out.println("La media es: " + media() + "\n");
                            break;
                        case "c":
                            System.out.println("La media es: " + Math.round((media() * 10) / 10.0) + "\n");
                            break;
                        default:
                            System.out.println("Introduce una opción correcta\n");
                            break;
                    }

                case 0:
                    break bucleexterior;


            }
        }

    }


    public static String puntoComa() {
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        dato = dato.replace(",", ".");
        return dato;

    }

    public static double longitud() {
        double L = Double.parseDouble(puntoComa());
        return 2 * Math.PI * L;

    }

    public static double area() {
        double L = Double.parseDouble(puntoComa());
        return Math.pow(L, 2) * Math.PI;
    }

    public static double media() {
        System.out.println("Introduce nota1");
        double n1 = Double.parseDouble(puntoComa());
        System.out.println("Introduce nota2");
        double n2 = Double.parseDouble(puntoComa());
        System.out.println("Introduce nota2");
        double n3 = Double.parseDouble(puntoComa());
        return (n1 + n2 + n3) / 3;

    }


}