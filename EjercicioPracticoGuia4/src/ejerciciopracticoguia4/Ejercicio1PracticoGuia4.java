/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package ejerciciopracticoguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1PracticoGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opcion, retorno;
        double retorno1;
        boolean salir = false;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();

        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.Division");
        System.out.println("Elija una opción:");
        opcion = leer.nextInt();
        System.out.println("═══════════════════════════════════════════════════");

        do {

            switch (opcion) {
                case 1:
                    retorno = suma(num1, num2);
                    System.out.println("La suma de los numeros ingresados es: " + retorno);
                    salir = true;
                    break;

                case 2:
                    retorno = resta(num1, num2);
                    System.out.println("La resta de los numeros ingresados es: " + retorno);
                    salir = true;
                    break;

                case 3:
                    retorno = multiplicacion(num1, num2);
                    System.out.println("La multiplicación de los numeros ingresados es: " + retorno);
                    salir = true;
                    break;

                case 4:
                    retorno1 = division(num1, num2);
                    System.out.println("La division de los numeros ingresados es: " + retorno1);
                    salir = true;
                    break;

                default:
                    System.out.println("Elija una opcion disponible");
                    opcion = leer.nextInt();
                    break;
            }

        } while (salir == false);

    }

    public static int suma(int num1, int num2) {
        int sumar;

        sumar = num1 + num2;

        return sumar;
    }

    public static int resta(int num1, int num2) {
        int restar;

        restar = num1 - num2;

        return restar;
    }

    public static int multiplicacion(int num1, int num2) {
        int multiplicaciones;

        multiplicaciones = num1 * num2;

        return multiplicaciones;
    }

    public static double division(int num1, int num2) {
        int divisiones;

        divisiones = num1 / num2;

        return divisiones;
    }
}
