public class Examen_1_ejercicio_2 {
    public static void main(String[] args) {

        String fraseOriginal = "Java es un lenguaje muy popular porque Java permite crear aplicaciones, Java es multiplataforma y Java tiene una gran comunidad de desarrolladores.";

        // El array debe crearse MANTENIENDO la puntuación para la impresión numerada.
        // Dividimos la frase por los espacios en blanco (\\s+).
        String[] palabrasArray = fraseOriginal.split("\\s+");

        // --- Variables ---
        int numeroPalabras = palabrasArray.length;
        String palabraMasLarga = "";
        int contadorJava = 0;

        // --- Impresión Inicial ---
        System.out.println("Número de palabras: " + numeroPalabras + "\n");

        // --- 1. Lógica Principal: Iteración y Análisis ---
        int indice = 1; // Contador para la lista numerada (1. 2. 3. ...)

        for (String palabraConPuntuacion : palabrasArray) {

            // 1.1. Imprimimos la palabra en el formato solicitado (MANTENIENDO la puntuación)
            System.out.println(indice + ". " + palabraConPuntuacion);

            // --- 2. Preparación para el Análisis (QUITAR la puntuación SÓLO para la lógica) ---
            // Creamos una versión limpia de la palabra (sin , o .) para el análisis de longitud y conteo.
            String palabraLimpia = palabraConPuntuacion.replaceAll("[.,]", "");

            // 2.1. Requisito de la Palabra Más Larga:
            // Usamos la versión LIMPIA de la palabra para determinar su longitud REAL.
            if (palabraLimpia.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraLimpia; // Guardamos la versión limpia.
            }

            // 2.2. Requisito de Contar "Java":
            // Comparamos usando la versión limpia y convertida a minúsculas.
            if (palabraLimpia.toLowerCase().equals("java")) {
                contadorJava++;
            }

            indice++; // Incrementamos el índice de la lista.
        }

        // --- 3. Mostrar Resultados Finales ---
        System.out.println("\nPalabra más larga: " + palabraMasLarga);
        System.out.println("La palabra \"Java\" aparece " + contadorJava + " veces.");
    }
}