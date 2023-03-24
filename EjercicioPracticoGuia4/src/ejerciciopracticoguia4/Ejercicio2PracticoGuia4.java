/*
Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejerciciopracticoguia4;

import java.util.Scanner;

/**
 *
 * @author Gabriel Lewicki
 */
public class Ejercicio2PracticoGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        identidad();
    }

    public static void identidad() {
        String nombre, salir;
        int edad;
        
        
        
        do {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.nextLine();
            
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            
            if (edad<18) {
                System.out.println("La persona " + nombre + " tiene " + edad + " años lo que la hace menor de edad");
            } else{
                System.out.println("La persona " + nombre + " tiene " + edad + " años lo que la hace mayor de edad");
            }
            
            System.out.println("Quiere seguir mostrando personas? (si/no)");
            salir = leer.next();
            
            if (salir.equalsIgnoreCase("no")) {
                System.out.println("Nos vemos!!!");
            }else {
                System.out.println("═══════════════════════════════════════════");
            }
        } while (salir.equalsIgnoreCase("si"));
        
    }
}
