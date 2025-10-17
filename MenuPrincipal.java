import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu principal");
            System.out.println("1. Conversor MorseaTexto");
            System.out.println("2. Conversor TextoaMorse");
            System.out.println("3. Verificador mayor edad y signo zodiacal");
            System.out.println("4. Validador numero perfecto");
            System.out.println("5. validador PalindromoCapicua");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ConversorMorseaTexto.main(null);
                    break;
                case 2:
                    ConversorTextoaMorse.main(null);
                    break;
                case 3:
                    main.main(null);
                    break;
                case 4:
                    Numeroperfecto.main(null);
                    break;
                case 5:
                    validadorPalindromoCapicua.main(null);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
