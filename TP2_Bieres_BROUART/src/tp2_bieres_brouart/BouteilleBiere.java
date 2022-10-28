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
//Création de la fonction BouteilleBiere définissant les caractéristiques de la bouteille
    public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie, boolean ouverte1) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = ouverte1;
    }
// méthode toString permettant de réecrire les caractéristiques de la bouteille
 @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degres)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;

    }
//Création de la fonction afin de savoir si la bouteille est ouverte ou s'il faut l'ouvrir
    public boolean Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            System.out.println("La biere est maintenant ouverte"); 
            return ouverte;
                    }else{
            System.out.println("La biere est deja ouverte"); 
            ouverte = false;
            return ouverte;
        }
}
}

