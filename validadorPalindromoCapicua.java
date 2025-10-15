import java.util.Scanner;

public class validadorPalindromoCapicua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Validador de palindromos y capicuas");

        while (true) {
            System.out.print("Ingrese una palabra o número (o escriba 'salir' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Vuelve pronto, adios");
                break;
            }

            
            if (esNumero(entrada)) {
                if (esCapicua(entrada)) {
                    System.out.println(" Es un numero capicua.");
                } else {
                    System.out.println(" No es un numero capicua.");
                }
            } else {
                if (esPalindromo(entrada)) {
                    System.out.println(" Es un palndromo.");
                } else {
                    System.out.println(" No es un palindromo.");
                }
            }
        }

        scanner.close(); 
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.toLowerCase().replaceAll("[^a-záéíóúüñ0-9]", "");
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    public static boolean esNumero(String texto) {
        return texto.matches("\\d+");
    }

    public static boolean esCapicua(String numero) {
        String invertido = new StringBuilder(numero).reverse().toString();
        return numero.equals(invertido);
    }
}
