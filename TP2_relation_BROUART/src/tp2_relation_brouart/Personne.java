/*BROUART ANDREA TDB 28/10/22*/
package tp2_relation_brouart;

/**
 *
 * @author Asus
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
public Personne(String unNom, String unPrenom){
    nom = unNom;
    prenom = unPrenom;
    liste_voitures = new Voiture[3];
    nbVoitures = 0;
}    
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ( nom + prenom );
return chaine_a_retourner ;
}
}
