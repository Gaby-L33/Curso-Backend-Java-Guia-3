/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
 estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
 la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €

 */
package ejerciciopracticoguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3PracticoGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros;
        String moneda;
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de Euros a transformar");
        euros = leer.nextFloat();
        
        do{
        System.out.println("Elija la moneda a transformar:");
        System.out.println("*Dolar");
        System.out.println("*Yen");
        System.out.println("*Libra");
        moneda = leer.next();
        }while(moneda.equalsIgnoreCase("dolar") == false && moneda.equalsIgnoreCase("yen") == false && moneda.equalsIgnoreCase("libra") == false);
        
        transformacion(euros, moneda);
    }
    
    public static void transformacion (double euros, String moneda){
        double cambio;
        
        if (moneda.equalsIgnoreCase("dolar")) {
            
            cambio = (1.28611*euros)/1;
            System.out.println("El cambio de Euro a Dolares es de " + cambio );
            
        } else if (moneda.equalsIgnoreCase("yen")){
            
            cambio = (129.852*euros)/1;
            System.out.println("El cambio de Euro a Yenes es de " + cambio);
            
        } else if (moneda.equalsIgnoreCase("libra")){
            
            cambio = (0.86*euros)/1;
            System.out.println("El cambio de Euro a Libras es de " + cambio);
            
        }
    }
}
    
