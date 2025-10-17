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
            System.out.println("Gestor de caballeros del zodiaco");
            System.out.println("1. Crear Caballero");
            System.out.println("2. Mostrar Caballeros");
            System.out.println("3. Eliminar Caballero");
            System.out.println("4. Batalla de Caballeros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> crearCaballero();
                case 2 -> mostrarCaballeros();
                case 3 -> eliminarCaballero();
                case 4 -> batallaCaballeros();
                case 5 -> System.out.println(" Saliendo del programa...");
                default -> System.out.println(" Opción no válida, intente de nuevo.");
            }

        } while (opcion != 5);
    }
    private static void crearCaballero() {
        System.out.print("Ingrese el nombre del caballero: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la armadura del caballero: ");
        String armadura = scanner.nextLine();

        System.out.print("Ingrese el nivel de cosmos (1-100): ");
        int cosmos = scanner.nextInt();
        scanner.nextLine();

        Caballero nuevo = new Caballero(nombre, armadura, cosmos);
        caballeros.add(nuevo);

        System.out.println("Caballero creado con éxito!");
    }

    private static void mostrarCaballeros() {
        if (caballeros.isEmpty()) {
            System.out.println("⚠️ No hay caballeros registrados.");
            return;
        }

        System.out.println("\n=== LISTA DE CABALLEROS ===");
        for (int i = 0; i < caballeros.size(); i++) {
            System.out.println((i + 1) + ". " + caballeros.get(i));
        }
    }
    private static void eliminarCaballero() {
        mostrarCaballeros();
        if (caballeros.isEmpty()) return;

        System.out.print("Ingrese el número del caballero a eliminar: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > caballeros.size()) {
            System.out.println("❌ Número inválido.");
            return;
        }

        Caballero eliminado = caballeros.remove(index - 1);
        System.out.println("🗑️ Caballero eliminado: " + eliminado.getNombre());
    }
   