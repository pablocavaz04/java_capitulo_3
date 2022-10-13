/*
*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado
Author: Pablo Camino Vázquez
*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca una cantidad de euros: ");
        double euros = sc.nextDouble();
        System.out.println("La cantidad introducida de "+euros+" €, equivale a la cantidad de "+(int)(euros*166)+" pesetas");
        sc.close();
    }
}
