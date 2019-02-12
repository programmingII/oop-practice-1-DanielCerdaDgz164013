/*
Daniel Cerda Dominguex 
Inicio: 12:10
Termino: 12:27
Dia: 12 feb
*/

import java.util.Scanner;

public class Ejercicio7{
public static void main (String[] args){

int num;

Scanner entrada = new Scanner(System.in);

System.out.println("Ingresa el numero: ");
num = entrada.nextInt();

for(int i=0; i<10; i++){
System.out.println((i+1)*num);
}

 }
}