/*BROUART ANDREA  TDB 28/10/22*/
package tp2_manip_brouart;

/**
 *
 * @author Asus
 */
public class TP2_manip_BROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;
    Tartiflette assiette3 = assiette2 ;
    //2 tartiflettes ont été créées car assiette2 et assiette3 référencent à une même tartiflette 
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +
    assiette3.nbCalories) ;
    //print montre bien que c'est la même tartiflette à 600 cal
    
    //5.changement des valeurs de assiette1 et assiette2
    int echange;
    echange = assiette1.nbCalories;
    assiette1.nbCalories=assiette2.nbCalories;
    assiette2.nbCalories=echange;
    System.out.println("nb de calories de Assiette 1 : " +
    assiette1.nbCalories) ;
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    
    //6.Moussaka assiette666 = assiette1 ;
    //Moussaka assiette667 = new Tartiflette() ;
    //incorrect, la classe moussaka ne peut être convertie en tartiflette. Une référence objet ne peut en référencer un autre
    
    Moussaka[] tabmoussaka = new Moussaka[10];
    for (int i = 0; i<10; i++){
        tabmoussaka[i] = new Moussaka(400);
    }
    }
    }
    
