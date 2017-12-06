/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prsctica1_2b;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class practica2_2b {
    public static void main(String[] args) {
       // int valor = 10/0;
       Scanner bry= new Scanner(System.in);
     double r=0;
       
       do{
            try{
                System.out.println("ingre el numerador");
                int num=bry.nextInt();
                System.out.println("ingrese el denominador");
                int deno=bry.nextInt();
                r=num/deno;
                double ra=num%deno;
                System.out.println("el resultado es "+" : "+r+ra);
                break;
            }catch(ArithmeticException e){
                System.out.println("ingrese un numero diferente de cero");
                System.err.println(e);
            }
            
        }while(true);
    }
    
}
