import java.util.ArrayList;
import java.util.Scanner;

class Caballero {
    private String nombre;
    private String armadura;
    private int cosmos;

    public Caballero(String nombre, String armadura, int cosmos) {
        this.nombre = nombre;
        this.armadura = armadura;
        this.cosmos = cosmos;
        }

    public String getNombre() {
        return nombre;
    }

    public String getArmadura() {
        return armadura;
    }

    public int getCosmos() {
        return cosmos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Armadura: " + armadura + " | Cosmos: " + cosmos;
    }
}
public class GestorCaballeros {
    private static ArrayList<Caballero> caballeros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== ⚔️ GESTOR DE CABALLEROS DEL ZODIACO ⚔️ ===");
            System.out.println("1. Crear Caballero");
            System.out.println("2. Mostrar Caballeros");
            System.out.println("3. Eliminar Caballero");
            System.out.println("4. Batalla de Caballeros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> crearCaballero();
                case 2 -> mostrarCaballeros();
                case 3 -> eliminarCaballero();
                case 4 -> batallaCaballeros();
                case 5 -> System.out.println("👋 Saliendo del programa...");
                default -> System.out.println("❌ Opción no válida, intente de nuevo.");
            }

        } while (opcion != 5);
    }
   