/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales4;
import java.util.Scanner;
/**
 *
 * @author pc10
 */
public class Condicionales4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner (System.in);
    System.out.println("Ingrese dos números: ");
    int a=entrada.nextInt();
    int b=entrada.nextInt();
    while (a==b){
        System.out.println("Ingrese dos números distintos: ");
        a=entrada.nextInt();
        b=entrada.nextInt();
    }
    if (a>b){
        System.out.println(a+" es el mayor");
    }
    else {
        System.out.println(b+" es el mayor");
    }
    if (a<b){
        System.out.println(a+" es el menor");
    }
    else {
        System.out.println(b+" es el menor");
    }
    }
}