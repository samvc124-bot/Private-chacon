import java.util.Scanner;
public class circunferencias_y_medias {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        Scanner Scanner = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("Elige una operacion a realizar:");
            System.out.println("1. Hallar Longitud");
            System.out.println("2. Hallar area");
            System.out.println("3. Hallar media de notas");
            System.out.print("4. salir");
            System.out.println(" ");
            eleccion = variable.nextInt();
            switch (eleccion) {
                case 1:
                    float pi = 3.14f;
                    System.out.println("Inserte el radio de la circunferencia en metros ej:3,5");
                    float Radio =Scanner.nextFloat();
                    float Longitud = 2f * pi * Radio;
                    System.out.println("La Longitud es: " + Longitud + "m");
                    break;
                case 2:
                    double Pi = 3.14;
                    System.out.println("Inserte el radio en centimetros ej:5,2");
                    double radio =Scanner.nextDouble();
                    double area = (radio * radio) * Pi;
                    System.out.println("El area de " + radio + " es igual a: " + area + "cm");
                    break;
                case 3:
                    System.out.println("Inserta las 3 notas que quieras calcular"); 
                    double a = Scanner.nextDouble();
                    double b = Scanner.nextDouble();
                    double c = Scanner.nextDouble();
                    double x = a + b + c;
                    double Notafin = x / 3;
                    System.out.println("Media en bruto: " + Notafin);
                    double rounded = Math.round(Notafin * 10.0) / 10.0;
                    System.out.println("Media con un decimal: " + rounded);

                    double NotafinRedondeada;
                    if (Notafin - Math.floor(Notafin) > 0.5) {
                        //calculamos la parte decimal de mi variable notafin
                        //si la decimal es mayor que .5
                        //redondea hacia arriba
                        NotafinRedondeada = Math.ceil(Notafin);
                    } else {
                        NotafinRedondeada = Math.floor(Notafin);
                        //sino redondea hacia abajo
                    }
                    System.out.println("Media redondeada: " + (int)NotafinRedondeada);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Comando no reconocido");

            }
        }
            while (eleccion <=3);
    }
}
