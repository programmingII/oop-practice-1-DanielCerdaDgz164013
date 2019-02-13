/*
Daniel Cerda Dominguez 164013
Inicio: 3:08;
Termino: 3:17
Dia: 13 febrero
*/

import java.util.Scanner;

public class Ejercicio13{
public static void main(String[] args){

int area, perimetro;
int lado1, lado2;

Scanner entrada = new Scanner (System.in);

System.out.println("Vamos a calcular el area y perimetro del rectangulo: ");
System.out.println("Ingresa el primer lado: ");
lado1 = entrada.nextInt();
System.out.println("Ingresa el segundo lado: ");
lado2 = entrada.nextInt();

area = (lado1*lado2);
perimetro = (lado1+lado1+lado2+lado2);

System.out.println("El resultado del area es: "+area);
System.out.println("El resultado del perimetro es: "+perimetro);
 }
}