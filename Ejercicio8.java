/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de horas trabajadas durante la semana: ");
        int horas = sc.nextInt();
        System.out.println("El salario semanal que te corresponde es de : "+(horas*12)+" euros");

    }
}
