/*
*Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere
convertir debe ser introducida por teclado
Author: Pablo Camino Vázquez
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca una cantidad de pesetas: ");
        double pesetas = sc.nextDouble();
        System.out.println("La cantidad introducida de "+pesetas+" pesetas, equivale a la cantidad de "+(int)(pesetas/166)+" euros");
        sc.close();
    }
}