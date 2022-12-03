/*BROUART Andréa TDB */
package Armes;

/**
 *
 * @author Asus
 */
public class Arme {
    String nom;
    int Niv_attak ;
    
    @Override
public String toString(){
    return "Nom de l'arme : "+nom+"\nNiveau d'attaque : "+Niv_attak;
 // visualiser le nom et le niveau d'attaque de l'arme   
}
public Arme(String n, int atk){
nom = n;
Niv_attak = atk;
if (atk >100){
    atk = 100;
}
}

    public String getNom() {
        return nom;
    }
}
