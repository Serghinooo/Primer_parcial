import java.util.Scanner;
public class Numeroperfecto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = entrada.nextInt();
        if(esNumeroperfecto(numero))
            System.out.println(numero + " es un numero perfecto");
        else {
            System.out.println(numero + " no es un numero perfecto");

        }
        }
    public static boolean esNumeroperfecto(int numero) {
        if(numero<=1) return false;

        int sumadivisores = 0;

        for (int i = 1; i <= numero/2; i++){
            if (numero % i == 0) {
                sumadivisores += i;
            }
        }

        return sumadivisores == numero;

    }
}
