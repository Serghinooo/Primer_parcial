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
   