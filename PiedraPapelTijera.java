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
        