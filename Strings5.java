public class Strings5 {
    public static void main(String[] args) {
        String palabra = "Java Java Java";
        String nospaces = palabra.replaceAll(" ","");
        int vocales = 0;
        int consonantes = 0;
        for (char c :nospaces.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
            else {
                consonantes++;
            }
        }

        System.out.println(palabra + " Tiene " + vocales + " vocales y " + consonantes);
    }
}
