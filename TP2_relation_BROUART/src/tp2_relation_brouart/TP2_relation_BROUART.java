/*BROUART ANDREA TDB 28/10/22*/
package tp2_relation_brouart;

/**
 *
 * @author Asus
 */
public class TP2_relation_BROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    
//bob 1ere voiture
bob.liste_voitures[0] = uneClio ;
bob.nbVoitures = 1 ;
uneClio.proprietaire = bob ;

//bob 2e voiture
bob.liste_voitures[1] = une2008;
bob.nbVoitures = 2;
une2008.proprietaire = bob;

//reno 1ere voiture
reno.liste_voitures[0] = une2008;
reno.nbVoitures = 1;
une2008.proprietaire = reno;

//reno 2e voiture
reno.liste_voitures[1] = uneMicra;
reno.nbVoitures = 2;
uneMicra.proprietaire = reno;

System.out.println("La premiere voiture de Bob est " +
bob.liste_voitures[0]+" . Et sa deuxieme voiture  est "+bob.liste_voitures[1]) ;

System.out.println("La premiere voiture de reno est " +
reno.liste_voitures[0]+" . Et sa deuxieme voiture  est "+reno.liste_voitures[1]) ;

    }
}
