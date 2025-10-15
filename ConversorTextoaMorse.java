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

        System.out.println("Conversor texto a morse");
        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine().toUpperCase().trim();

        String morse = convertirTextoAMorse(texto);
        System.out.println("Código Morse:" + morse);

        scanner.close();
    }

    private static String convertirTextoAMorse(String texto) {
        StringBuilder resultado = new StringBuilder();

        String[] palabras = texto.split(" "); 

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                String codigo = letraAMorse(letra);
                resultado.append(codigo).append(" ");
            }
            resultado.append("/ ");
        }

        return resultado.toString().trim();
    }
    private static String letraAMorse(char letra) {
        for (int i = 0; i < LETRAS.length; i++) {
            if (LETRAS[i].equals(String.valueOf(letra))) {
                return MORSE[i];
            }
        }
        return "error";
    }
}
