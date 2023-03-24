/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que 
 el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
package ejercicio1teoriaguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2teoriaGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros y le dire si el primero es multiplo del segundo");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);

    }

    public static void EsMultiplo(int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
}
