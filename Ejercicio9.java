/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3 πr2h
 * * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio del cono: ");
        double radio = sc.nextDouble();
        System.out.println("Introduzca la altura del cono: ");
        double h = sc.nextDouble();
        System.out.println("El volumen de este cono es de : "+(Math.PI*(Math.pow(radio, 2)*h))/3+" in");

    }
}