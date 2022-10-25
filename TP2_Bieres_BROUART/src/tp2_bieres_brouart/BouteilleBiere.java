/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_brouart;

/**
 *
 * @author Asus
 */
public class BouteilleBiere {
   String nom;
   double degreAlcool;
   String brasserie;
   boolean ouverte;
   
   public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie +"\n ouverte? :" + ouverte) ;

}
    public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie, boolean ouverte1) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = ouverte1;
    }
    public boolean Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
                    }else{
            System.out.println("La biere est deja ouverte"); 
            return false;
        }
}
}

