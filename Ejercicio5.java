/*
Daniel Cerda Dominguez
Inicio: 12:35
Termino: 1:10
Dia: 2 febrero
*/

import java.util.Scanner;

public class Ejercicio5{
public static void main(String[] args) {
  
 Scanner entrada = new Scanner(System.in);
 int num1;
 int num2;

 System.out.println("Digita un numero: ");
 num1 = entrada.nextInt();
 
 System.out.print("Digita el segundo numero: ");
 num2 = entrada.nextInt();

 System.out.println("El resultado es: ");
 System.out.println(num1*num2);
 } 
}