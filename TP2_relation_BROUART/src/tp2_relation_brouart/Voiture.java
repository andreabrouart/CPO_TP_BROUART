/*BROUART ANDREA TDB 28/10/22*/
package tp2_relation_brouart;

/**
 *
 * @author Asus
 */
public class Voiture {
String modele;
String marque;
int puissanceCV;
Personne proprietaire;

public Voiture(String unModele, String uneMarque, int unepuissanceCV){
modele = unModele;
marque = uneMarque;
puissanceCV = unepuissanceCV;
proprietaire = null;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ( "modele: "+modele +" marque: "+ marque +" puissance sous le capot: "+ puissanceCV +" cv");
return chaine_a_retourner ;
}

}
