/*BROUART Andréa TDB*/
package tp3_brouart;

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
    }
}
   

