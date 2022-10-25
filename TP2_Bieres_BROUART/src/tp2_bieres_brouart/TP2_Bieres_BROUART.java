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
     BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0,"Dubuisson", false) ;
     //uneBiere.nom = "Cuvee des trolls";
     //uneBiere.degreAlcool = 7.0 ;
     //uneBiere.brasserie = "Dubuisson";
     //uneBiere.ouverte = false;
     uneBiere.lireEtiquette(); 
     
     BouteilleBiere Biere2 = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe",true) ;
     Biere2.lireEtiquette();
     
     BouteilleBiere Biere3 = new BouteilleBiere("Goudale",7.2,"Novelty",true);
     Biere3.lireEtiquette();
     
     BouteilleBiere Biere4 = new BouteilleBiere("Chouffe",8.0,"Chez Margaux",false);
     Biere4.lireEtiquette();
     
     BouteilleBiere Biere5 = new BouteilleBiere("Heineken",5.2,"Babar",true);
     Biere5.lireEtiquette();
}
}