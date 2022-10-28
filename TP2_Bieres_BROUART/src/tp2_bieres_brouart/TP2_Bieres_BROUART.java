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
     // on définit de deux manières les caractéristiques de uneBiere   
     BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0,"Dubuisson", false) ;
     //uneBiere.nom = "Cuvee des trolls";
     //uneBiere.degreAlcool = 7.0 ;
     //uneBiere.brasserie = "Dubuisson";
     //uneBiere.ouverte = false;
     System.out.println(uneBiere) ;
     //uneBiere.lireEtiquette(); 
     
     BouteilleBiere Biere2 = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe",true) ;
     Biere2.lireEtiquette();
     
     BouteilleBiere Biere3 = new BouteilleBiere("Goudale",7.2,"Novelty",true);
     Biere3.lireEtiquette();
     
     BouteilleBiere Biere4 = new BouteilleBiere("Chouffe",8.0,"Chez Margaux",false);
     Biere4.lireEtiquette();
     //Biere4.Decapsuler();
     //Biere4.lireEtiquette();
     
     BouteilleBiere Biere5 = new BouteilleBiere("Heineken",5.2,"Babar",true);
     Biere5.lireEtiquette();
     //Biere5.Decapsuler();
     
     //Derniers tests avec toString et fonction Décapsuler
     BouteilleBiere Biere6 = new BouteilleBiere("Modelo", 7.4, "Quincallerie", false);
       System.out.println(Biere6);
       Biere6.Decapsuler();
       
     BouteilleBiere Biere7 = new BouteilleBiere ("1664 blonde", 5.6, "Pinnochio",true);
      System.out.println(Biere7) ;
      Biere7.Decapsuler();
      
    }
}
       