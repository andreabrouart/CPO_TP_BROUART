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
public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire !=null){
            System.out.println(voiture_a_ajouter + "Voiture volee !!!");
            return false;
            //Si la voiture à ajouter possède déjà un propriétaire on retourne "voiture volée !!!")
            }else{
            if(this.nbVoitures == 3){
                System.out.println(this.nom + this.prenom+ "a déjà 3 voitures");
                return false;
                //Si le propriétaire a déjà 3 voitures, le tableau est plein, on retourne "le propriétaire a déjà 3 voitures".
            }else{
                this.liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.proprietaire = this  ;
                return true;
                // on indique à la voiture son propriétaire 
                }
      }
}
}
