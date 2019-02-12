/*
Daniel Cerda Dominguez 164013
Inicio: 1:20
Termino: 1:33
Dia: 12 feb
*/

import java.util.Scanner;

public class Ejercicio11{
public static void main(String[] args){

Scanner entrada = new Scanner(System.in);
double radio, perimetro, area;


System.out.println("Ingresa el radio: ");
radio= entrada.nextDouble();

perimetro = radio* (2*3.1415);
area = (radio*radio)*(3.14159);

System.out.println("El resultado del perimetro es: " +perimetro);
System.out.println("El resultado del area es: " +area);

 }
}