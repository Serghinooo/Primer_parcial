import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);

        System.out.println("ingrese dia de nacimiento:");
        int dianacimiento = leer.nextInt();

        System.out.println("ingrese el mes de nacimiento:");
        int mesnacimiento = leer.nextInt();


        System.out.println("ingrese su año de nacimiento:");
        int anonacimiento = leer.nextInt();


        System.out.println("ingrese año actual:");
        int anoactual = leer.nextInt();

        System.out.println("ingrese mes actual:");
        int mesactual = leer.nextInt();

        int edad = anoactual - anonacimiento;

        if(mesactual < mesnacimiento){
            edad--;
        }
        System.out.println("Su edad es:"+ edad + " años");

        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
        else {
            System.out.println("Usted es menor de edad");
        }


        determinarSigno(mesnacimiento,dianacimiento);
    }
    public static void determinarSigno(int mesnacimiento, int dianacimiento){
        System.out.println("Su signo zodiacal es:");
        if (mesnacimiento == 1) {
            if (dianacimiento >= 20) System.out.println("Acuario");
            else System.out.println("Capricornio");
        } else if (mesnacimiento == 2) {
            if (dianacimiento >= 19) System.out.println("Piscis");
            else System.out.println("Acuario");
        } else if (mesnacimiento == 3) {
            if (dianacimiento >= 21) System.out.println("Aries");
            else System.out.println("Piscis");
        } else if (mesnacimiento == 4) {
            if (dianacimiento >= 20) System.out.println("Tauro");
            else System.out.println("Aries");
        } else if (mesnacimiento == 5) {
            if (dianacimiento >= 21) System.out.println("Géminis");
            else System.out.println("Tauro");
        } else if (mesnacimiento == 6) {
            if (dianacimiento >= 21) System.out.println("Cáncer");
            else System.out.println("Géminis");
        } else if (mesnacimiento == 7) {
            if (dianacimiento >= 23) System.out.println("Leo");
            else System.out.println("Cáncer");
        } else if (mesnacimiento == 8) {
            if (dianacimiento >= 23) System.out.println("Virgo");
            else System.out.println("Leo");
        } else if (mesnacimiento == 9) {
            if (dianacimiento >= 23) System.out.println("Libra");
            else System.out.println("Virgo");
        } else if (mesnacimiento == 10) {
            if (dianacimiento >= 23) System.out.println("Escorpio");
            else System.out.println("Libra");
        } else if (mesnacimiento == 11) {
            if (dianacimiento >= 22) System.out.println("Sagitario");
            else System.out.println("Escorpio");
        } else if (mesnacimiento == 12) {
            if (dianacimiento >= 22) System.out.println("Capricornio");
            else System.out.println("Sagitario");
        } else {
            System.out.println("Fecha inválida");
        }

        }
    }



