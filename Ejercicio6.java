/*
Daniel Cerda Dominguez
Inicio: 1:19
Termino: 1:30
Dia: 2 febrero
Comentarios: Necesito reforzar el aprendizaje en la libreria import java.util.Scanner, y entrada.nextInt, todo lo demas esta bien.
*/

import java.util.Scanner;

public class Ejercicio6{
public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

int num1;
int num2;
int num3;
int num4;

System.out.println("Ingresa 2 numeros y vamos a hacer suma, resta, mult y div ");

System.out.println("Ingresa el primer numero: ");
num1 = entrada.nextInt();

System.out.println("Ingresa el segundo numero: ");
num2 = entrada.nextInt();

System.out.println("El resultado de la suma es: ");
System.out.println(num1+num2);

System.out.println("El resultado de la resta es: ");
System.out.println(num1-num2);

System.out.println("El resultado de la multiplicacion es: ");
System.out.println(num1*num2);

System.out.println("El resultado de la division es: ");
System.out.println(num1/num2);
 }
}