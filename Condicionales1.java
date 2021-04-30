/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales1;
import java.util.Scanner;
/**
 *
 * @author pc10
 */
public class Condicionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese el número máximo de la serie: ");
        int a=entrada.nextInt();
        System.out.println("");
        for (int i=0; i<=a; i++) {
            System.out.println (i);
        }
        
    }
    
}
