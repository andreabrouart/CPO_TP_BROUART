/*
BROUART Andréa TDB
TP2 25/10/2022
 */
package tp2_bieres_brouart;

/**
 *
 * @author Asus
 */
public class TP2_Bieres_BROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     BouteilleBiere uneBiere = new BouteilleBiere() ;
     uneBiere.nom = "Cuvee des trolls";
     uneBiere.degreAlcool = 7.0 ;
     uneBiere.brasserie = "Dubuisson";
     uneBiere.ouverte = false;
     uneBiere.lireEtiquette(); 
     
     BouteilleBiere Biere2 = new BouteilleBiere() ;
     Biere2.nom = "Leffe";
     Biere2.degreAlcool = 6.6 ;
     Biere2.brasserie = "Abbaye de Leffe";
     Biere2.lireEtiquette();
}
}