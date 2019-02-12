/*
Daniel Cerda Dominguez 164013
Inicio: 1:37
Termino: 1:45
Dia: 12 feb
*/

import java.util.Scanner;

public class Ejercicio12{
public static void main(String[] args){

int num1, num2, num3, num4, num5;
Scanner entrada = new Scanner(System.in);

System.out.println("Ingresa el primer numero: ");
num1 = entrada.nextInt();

System.out.println("Ingresa el segundo numero: ");
num2 = entrada.nextInt();

System.out.println("Ingresa el tercer numero: ");
num3 = entrada.nextInt();

System.out.println("Ingresa el cuarto numero: ");
num4 = entrada.nextInt();

System.out.println("Ingresa el quinto numero: ");
num5 = entrada.nextInt();

System.out.println((num1+num2+num3+num4+num5)/5);

 }
}