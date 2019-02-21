/*
Daniel Cerda Dominguez 164013
Inicio: 1:27
Termino: 1:29
Dia: 21 febrero
*/

import java.util.Scanner;

public class Ejercicio20{
public static void main(String[] args){

 Scanner entrada = new Scanner(System.in);

 int hex, mod;
 String bin = "";

 System.out.println("Ingresa el numero decimal: ");
 hex = entrada.nextInt();
 
 while(hex>0){
 mod = (hex%16);
 bin = mod + bin;
 hex = hex/16;
 }

 System.out.println("El resultado en binario es: "+ bin);

}
}