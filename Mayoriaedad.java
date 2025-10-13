import java.util.scanner;
public class Main{
    public static void main(string[] args){
        Scanner leer= new Scanner(System.in);

        System.out.println("ingrese su año de nacimiento");
        int añonacimiento = leer.nextInt();

        System.out.println("ingrese año actual");
        int añoactual = leer.nextInt();

        System.out.println("Su edad es:"+(añoactual-añonacimiento)+"años");
    }
}
