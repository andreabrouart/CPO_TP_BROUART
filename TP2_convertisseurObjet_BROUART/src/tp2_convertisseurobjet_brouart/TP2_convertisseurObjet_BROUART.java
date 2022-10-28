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
        System.out.println("conversion "+b+" ° degre K");
        
        //méthode d'appel des fonctions
        System.out.println("Selectionnez la conversion voulue : \n"
                + "1 -> Celcius Vers Kelvin\n"
                + "2 -> Kelvin Vers Celcius\n"
                + "3 -> Farenheit Vers Celcius\n"
                + "4 -> Celcius Vers Farenheit\n"
                + "5 -> Kelvin Vers Farenheit\n"
                + "6 -> Farenheit Vers Kelvin\n");
        int conversion_mode = sc.nextInt();
       if (conversion_mode<1 || conversion_mode>6){
            System.out.println("la valeur entree est incorrecte");
            System.exit(0);
       }
       System.out.println("Saisissez une valeur pour la vraie conversion");
       double t = sc.nextDouble();
       Convertisseur conv = new Convertisseur();
       double resultat;
       int nbConversions = 0;
       if (conversion_mode ==1){
           resultat = conv.CelciusVersKelvin(t);
           System.out.println(t+ "degres Celsius est égal à "+ resultat+ "degres Kelvin");   
   nbConversions = nbConversions +1;
       }
       
       if (conversion_mode ==2){
           resultat = conv.KelvinVersCelcius(t);
           System.out.println(t+ "degres Kelvin est égal à "+ resultat+ "degres Celcius");
    nbConversions = nbConversions +1;
       }
       if (conversion_mode ==3){
           resultat = conv.FarenheitVersCelcius(t);
           System.out.println(t+ "degres Farenheit est égal à "+ resultat+ "degres Celcius");
    nbConversions = nbConversions +1;
       }
    if (conversion_mode ==4){
           resultat = conv.CelciusVersFarenheit(t);
           System.out.println(t+ "degres Celsius est égal à "+ resultat+ "degres Farenheit");   
   nbConversions = nbConversions +1;
    }
    if (conversion_mode ==5){
           resultat = conv.KelvinVersFarenheit(t);
           System.out.println(t+ "degres Kelvin est égal à "+ resultat+ "degres Farenheit");
   nbConversions = nbConversions +1;
    }
    if (conversion_mode ==6){
           resultat = conv.FarenheitVersKelvin(t);
           System.out.println(t+ "degres Farenheit est égal à "+ resultat+ "degres Kelvin");
           nbConversions = nbConversions +1;
    }
    System.out.println("le nbr de conversions est: "+nbConversions);
            
    }
}

 
