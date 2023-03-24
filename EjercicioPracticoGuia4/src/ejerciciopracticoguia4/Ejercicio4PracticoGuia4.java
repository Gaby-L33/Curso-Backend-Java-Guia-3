/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
 por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
 Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
 Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package ejerciciopracticoguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4PracticoGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean retorno;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo y le dire si es primo o no");
        num = leer.nextInt();
        
        retorno = PrimooNO(num);
        
        System.out.println("La afirmacion que el numero que ingreso es primo es " + retorno);

    }

    public static boolean PrimooNO(int num) {
        boolean confirmacion;
        int j = 0;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                j = j + 1;
            }
        }
        
        if (j==0) {
            confirmacion = true;
        } else {
            confirmacion = false ;
        }
        return confirmacion;
    }

}
