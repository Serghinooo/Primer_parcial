import java.util.Scanner;


public class validadorPalindromo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Validador palindromos");
        System.out.println("Digite una palabra o frase");
        String texto = scan.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Tu palabra es palindromo");
        }
        else {
            System.out.println("Tu palabra no es palindromo");

        }
    }
public static boolean esPalindromo(String texto) {
    String limpio = texto.toLowerCase().replaceAll("[a-z0-9]", "");

    String invertido =  new StringBuilder(limpio).reverse().toString();

    return limpio.equals(invertido);
}

}