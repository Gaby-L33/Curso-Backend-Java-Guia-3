/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla 
y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % * 

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 

 */
package ejercicio1teoriaguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1TeoriaGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        String retorno = cambiar(frase);
        
        System.out.println("La frase nueva es " + retorno);

    }

    public static String cambiar(String frase) {
        String frase_nueva = "";
        int cantidad;

        cantidad = frase.length();
        

        for (int i = 0; i < cantidad; i++) {

            switch (frase.substring(i, i + 1)) {
                case ("a"):
                    frase_nueva= frase_nueva.concat("@");
                    break;
                case ("e"):
                     frase_nueva= frase_nueva.concat("#");
                    break;
                case ("i"):
                     frase_nueva= frase_nueva.concat("$");
                    break;
                case ("o"):
                     frase_nueva= frase_nueva.concat("%");
                    break;
                case ("u"):
                     frase_nueva= frase_nueva.concat("*");
                    break;
                default:
                      frase_nueva= frase_nueva.concat(frase.substring(i,i+1));
                     break;
            }
        }

        return frase_nueva;
    }
}
