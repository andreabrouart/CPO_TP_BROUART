/*BROUART Andréa TDB*/
package tp3_brouart;

import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import java.util.Vector;

/**
 *
 * @author Asus
 */
public class TP3_BROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Epee Excalibur = new Epee("Excalibur",7,5);
     Epee Durandal = new Epee("Durandal",4,7);
     Baton Chene = new Baton("Chene",4,5);
     Baton Charme = new Baton("Charme",5,6);
     
     
     Vector tableau = new Vector();
     tableau.add(Excalibur);
     tableau.add(Durandal);
     tableau.add(Chene);
     tableau.add(Charme);
     
     for (int i =0; i<tableau.size();i++){
       System.out.println(tableau.elementAt(i));
     }
     
     Magicien Gandalf = new Magicien("Gandalf",65,true);
     Magicien Garcimore = new Magicien("Garcimore",44,false);
     Guerrier Conan = new Guerrier("Conan",78,false);
     Guerrier Lannister = new Guerrier("Lannister",45,true);
     
     Vector tableau2 = new Vector();
     tableau2.add(Gandalf);
     tableau2.add(Garcimore);
     tableau2.add(Conan);
     tableau2.add(Lannister);  
     
     for (int i =0; i<tableau2.size();i++){
       System.out.println(tableau2.elementAt(i));
     }
     }
     
    }
