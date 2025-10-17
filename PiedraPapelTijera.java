import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int opcionUsuario, opcionComputadora;

        System.out.println("=== JUEGO: PIEDRA, PAPEL O TIJERA ===");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Elige una opción (1-3): ");
        opcionUsuario = sc.nextInt();

        
        opcionComputadora = random.nextInt(3) + 1;

        System.out.println("\nTú elegiste: " + convertirOpcion(opcionUsuario));
        System.out.println("La computadora eligió: " + convertirOpcion(opcionComputadora));

        if (opcionUsuario == opcionComputadora) {
            System.out.println("¡Empate!");
        } else if (
            (opcionUsuario == 1 && opcionComputadora == 3) || 
            (opcionUsuario == 2 && opcionComputadora == 1) || 
            (opcionUsuario == 3 && opcionComputadora == 2)    
        ) {
            System.out.println("🎉 ¡Ganaste!");
        } else {
            System.out.println("💻 La computadora gana...");
        }

        sc.close();
    }

        