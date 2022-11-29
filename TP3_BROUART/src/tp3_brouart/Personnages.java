/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_brouart;

import java.util.Vector;

/**
 *
 * @author Asus
 */
public abstract class Personnages {
    String Nom;
    int Nivvie;
    Vector tab_armes = new Vector();
    
    
    public Personnages(String nom, int nivvie){
        Nom = nom;
        Nivvie = nivvie;
    }

    @Override
    public String toString() {
        return "Personnages{" + "Nom= " + Nom + ", Niveau de vie = " + Nivvie + '}';
    }
    
}
