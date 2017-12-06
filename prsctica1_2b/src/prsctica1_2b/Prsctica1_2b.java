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
public class Prsctica1_2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        int edad; 
        Scanner bry= new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        edad= bry.nextInt();
        bry.nextLine();
        System.out.println("ingrese un nombre");
        nombre=bry.nextLine();
        
        
        System.out.println("su nombre es "+" "+nombre);
        System.out.println("su edad es"+" "+edad);
    }
    
}
