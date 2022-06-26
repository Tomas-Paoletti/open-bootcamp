/*Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.*/

import java.util.Scanner;

public class mainSuma {

    public static  void main(String[] args){
 int num1,num2,num3;
        Scanner att = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1= att.nextInt();
        System.out.println("ingrese el segundo numero");
        num2= entrada.nextInt();
        System.out.println("ingrese el tercer numero");
        num3= att.nextInt();
        System.out.println(suma(num1,num2,num3));
    }

    public static int suma (int a,int b,int c){

        int resultado= a+b+c;
        return resultado;

    }

}
