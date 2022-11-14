/*BROUART Andréa TDB*/
package tp3_brouart;

import java.util.ArrayList;

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
     
     int m;
     ArrayList tableau = new ArrayList();
     tableau.add(Excalibur);
     tableau.add(Durandal);
     tableau.add(Chene);
     tableau.add(Charme);
    }
   
}
