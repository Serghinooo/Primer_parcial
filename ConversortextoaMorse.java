import java.util.Scanner;

public class ConversortextoaMorse {
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
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Conversor de texto a morse ");
        System.out.print("Introduce el código Morse: ");
        String morseInput = scanner.nextLine().trim();

        String texto = convertirMorseATexto(morseInput);
        System.out.println("Texto traducido: " + texto);
        scanner.close();
    }

    private static String convertirMorseATexto(String morse) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = morse.split(" / "); 
        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letra : letras) {
                String simbolo = morseALetra(letra);
                resultado.append(simbolo);
            }
            resultado.append(" ");
        }

        return resultado.toString().trim();
    }

    private static String morseALetra(String codigo) {
        for (int i = 0; i < MORSE.length; i++) {
            if (MORSE[i].equals(codigo)) {
                return LETRAS[i];
            }
        }
        return "error"; 
    }
}

