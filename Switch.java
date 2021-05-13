/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;

/**
 *
 * @author pc10
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner días=new Scanner (System.in);
        System.out.println("Ingrese un número para saber qué día es ");
        int día=días.nextInt();
        String nomdía;
        switch (día){
            case 1:nomdía="Lunes";
            break;
            case 2:nomdía="Martes";
            break;
            case 3:nomdía="Miércoles";
            break;
            case 4:nomdía="Jueves";
            break;
            case 5:nomdía="Viernes";
            break;
            case 6:nomdía="Sábado";
            break;
            case 7:nomdía="Domingo";
            break;
            default:nomdía="Día Inválido";
            break;
        }
            System.out.println(nomdía);
    }
    }
    
}
