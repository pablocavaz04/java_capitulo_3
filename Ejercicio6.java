/*
 * Escribe un programa que calcule el área de un triangulo.
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo: ");
        int base = sc.nextInt();
        System.out.println("Introduzca la altura del triangulo: ");
        int altura = sc.nextInt();
        System.out.println("El área del rectangulo es : "+((base*altura)/2));
    }
}
