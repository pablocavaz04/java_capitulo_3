/*
 * Realiza un conversor de Kb a Mb
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un num de kb: ");
        double kb = sc.nextDouble();
        System.out.println(kb+" Kb equivale a "+(kb/1024)+" Mb");
    }
}