/*
Daniel Cerda Dominguez 164013
Inicio: 12:03
Termino: 1:07
Dia: 26 febrero
*/

import java.util.Scanner;

public class Ejercicio21{
public static void main(String[] args){

 Scanner entrada = new Scanner(System.in);

 int oct, mod;
 String bin = "";

 System.out.println("Ingresa el numero decimal: ");
 oct = entrada.nextInt();
 
 while(oct>0){
 mod = (oct%8);
 bin = mod + bin;
 oct = oct/8;
 }

 System.out.println("El resultado en binario es: "+ bin);

}
}