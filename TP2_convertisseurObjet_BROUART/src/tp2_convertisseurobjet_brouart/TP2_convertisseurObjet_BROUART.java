/* BROUART ANDREA TDB 28/10/22 */

package tp2_convertisseurobjet_brouart;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TP2_convertisseurObjet_BROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double b;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur");
        b = sc.nextDouble();
        System.out.println(b+"  degre C");
        b = b + 273.15;
        System.out.println("convertion "+b+" ° degre K");
        
        //méthode d'appel des fonctions
       System.out.println("Saisissez une valeur pour la vraie convertion");
       double t = sc.nextDouble();
       Convertisseur c = new Convertisseur(); 
       double p = c.FarenheitVersKelvin(t); 
       System.out.println(p);
    }
    
}
