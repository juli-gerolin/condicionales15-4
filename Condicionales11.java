/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales11;

import java.util.Scanner;

/**
 *
 * @author pc10
 */
public class Condicionales11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingrese un numero y le mostrare los multiplos de 5 de dicho numero");
    int num=teclado.nextInt();
    int i=0;
    while (i<=100) {
    if(i%5==0)    
    System.out.println (i);
    i++;
    }
    }
}
    
