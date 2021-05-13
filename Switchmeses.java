/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmeses;
import java.util.Scanner;
/**
 *
 * @author pc10
 */
public class Switchmeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner meses=new Scanner (System.in);
        System.out.println("Ingrese un número para saber qué mes es ");
        int mes=meses.nextInt();
        String nomes;
        switch (mes){
            case 1:nomes="Enero";
            break;
            case 2:nomes="Febrero";
            break;
            case 3:nomes="Marzo";
            break;
            case 4:nomes="Abril";
            break;
            case 5:nomes="Mayo";
            break;
            case 6:nomes="Junio";
            break;
            case 7:nomes="Julio";
            break;
            case 8:nomes="Agosto";
            break;
            case 9:nomes="Septiembre";
            break;
            case 10:nomes="Octubre";
            break;
            case 11:nomes="Novimebre";
            break;
            case 12:nomes="Diciembre";
            break;
            default:nomes="Mes Inválido";
            break;
        }
            System.out.println(nomes);
    }
    }
    
}
