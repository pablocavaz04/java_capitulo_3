/*
 * Escribe un programa que calcule el área de un rectángulo.
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo: ");
        int base = sc.nextInt();
        System.out.println("Introduzca la altura del rectangulo: ");
        int altura = sc.nextInt();
        System.out.println("El área del rectangulo es : "+(base*altura));

    }
}
