/*
Daniel Cerda Dominguez 164013
Inicio: 1:04
Termino: 1:06
Dia: 21 feb
*/

import java.util.Scanner;

public class Ejercicio18{
public static void main(String[] args){

 String n1, n2;

 Scanner entrada = new Scanner(System.in);

 System.out.println("Ingresa el primer numero: ");
 n1 = entrada.nextLine();
 
 System.out.println("Ingresa el segundo numero: ");
 n2 = entrada.nextLine();
 
 System.out.print("El resultado es: " +(Integer.toBinaryString(Integer.parseInt(n1, 2)*Integer.parseInt(n2, 2))));

}
}