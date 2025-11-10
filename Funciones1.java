public class Funciones1 {
    public static void main(String[] arg) {
        System.out.println("Imprimiendo digitos de N hasta 1");
        ParametroN(20);
    }
    public static void ParametroN(int N) {
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}