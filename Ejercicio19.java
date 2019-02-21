/*
Daniel Cerda Dominguez 164013
Inicio: 1:07
Termino: 1:24
Dia: 21 febrero
*/

import java.util.Scanner;

public class Ejercicio19{
public static void main(String[] args){

 Scanner entrada = new Scanner(System.in);

 int dec, mod;
 String bin = "";

 System.out.println("Ingresa el numero decimal: ");
 dec = entrada.nextInt();
 
 while(dec>0){
 mod = (dec%2);
 bin = mod + bin;
 dec = dec/2;
 }

 System.out.println("El resultado en binario es: "+ bin);

}
}