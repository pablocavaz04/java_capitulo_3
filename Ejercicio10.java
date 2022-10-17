/*
 * Realiza un conversor de Mb a Kb
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un num de Mb: ");
        double mb = sc.nextDouble();
        System.out.println(mb+" Mb equivale a "+(mb*1024)+" Kb");
    }
}