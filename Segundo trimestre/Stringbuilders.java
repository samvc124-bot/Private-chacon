public class Stringbuilders {
        public static void main(String[] args) {
/*Generamos un String con 100000 caracteres x, añadiéndolos uno detras de otro.
Lo hacemos con un String, con StringBuilder y StringBuffer, para ver cuanto tarda cada uno */
            System.out.println("empieza usamosString");
            long timeStart = System.currentTimeMillis();
            String palabraString = usamosString();
            long timeSpend = (System.currentTimeMillis() - timeStart);
            System.out.println("finaliza usamosString. Tiempo:" + timeSpend+" Milisegundos");
            System.out.println("empieza usamosStringBuilder");
            timeStart = System.currentTimeMillis();
            String palabraStringBuilder = usamosStringBuilder();
            timeSpend = (System.currentTimeMillis() - timeStart);
            System.out.println("finaliza usamosStringBuilder. Tiempo:" + timeSpend+" Milisegundos");
            System.out.println("empieza usamosStringBuffer");
            timeStart = System.currentTimeMillis();
            String palabraStringBuffer = usamosStringBuffer();
            timeSpend = (System.currentTimeMillis() - timeStart);
            System.out.println("finaliza usamosStringBuffer. Time:" + timeSpend+" Milisegundos");
            System.out.println("palabraString, palabraStringBuilder y palabraStringBuffer son iguales "+(palabraString.equals(palabraStringBuilder) && palabraString.equals(palabraStringBuffer)));
        }
        private static String usamosStringBuilder() {
            StringBuilder palabraStringBuilder = new StringBuilder();
            for (int i = 0; i < 100000; i++) {
                palabraStringBuilder.append("x");
            }
            return palabraStringBuilder.toString();
}
    private static String usamosStringBuffer() {
        StringBuffer palabraStringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            palabraStringBuffer.append("x");
        }
        return palabraStringBuffer.toString();
    }
    private static String usamosString() {
        String palabra = "";
        for (int i = 0; i < 100000; i++) {
            palabra = palabra + "x";
        }
        return palabra; }
};
