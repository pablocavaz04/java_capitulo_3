/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado
Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("El resultado de "+num1+ "+"+num2+" = "+(num1+num2) );
        System.out.println("El resultado de "+num1+ "-"+num2+" = "+(num1-num2) );
        System.out.println("El resultado de "+num1+ "*"+num2+" = "+(num1*num2) );
        System.out.println("El resultado de "+num1+ "/5"+num2+" = "+(num1/num2) );
    }
}
