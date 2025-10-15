import java.util.Scanner;

public class ConversorTextoaMorse {

    private static final String[] MORSE = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....",
        "-....", "--...", "---..", "----."
    };

    private static final String[] LETRAS = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE TEXTO A CÓDIGO MORSE ===");
        System.out.print("Escribe el texto que quieres convertir: ");
        String texto = scanner.nextLine().toUpperCase().trim();

        String morse = convertirTextoAMorse(texto);
        System.out.println("\nCódigo Morse:\n" + morse);

        scanner.close();
    }

    private static String convertirTextoAMorse(String texto) {
        StringBuilder resultado = new StringBuilder();

        String[] palabras = texto.split(" "); // separa por palabras

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                String codigo = letraAMorse(letra);
                resultado.append(codigo).append(" ");
            }
            resultado.append("/ "); // separador de palabras en Morse
        }

        return resultado.toString().trim();
    }