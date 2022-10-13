/*
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        float b_i = sc.nextFloat();
        System.out.printf("Base imponible %8.2f\n", b_i);
        System.out.printf("IVA %8.2f\n", (b_i*0.21));
        System.out.println("  ");
        System.out.printf("Total %8.2f\n",(b_i* 1.21));

    }
}
