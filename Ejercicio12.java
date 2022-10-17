/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduza la nota de tu primer examen: ");
    float nota1 = sc.nextFloat();
    System.out.println("Que nota final quieres sacar en el trimestre: ");
    float notafin = sc.nextFloat();
    float nota2 = ((notafin*100)-(nota1*40))/60;
    System.out.println("Para tener un "+notafin+" en el trimestre necesitas sacar un "+nota2+" en el 2º examen.");


    }
}
