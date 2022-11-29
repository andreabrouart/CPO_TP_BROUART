/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.Vector;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;


/**
 *
 * @author Asus
 */
public abstract class Personnages {
    String Nom;
    int Nivvie;
    Vector liste_armes = new Vector();
    Arme Arme_en_Main;
    
    
    public Personnages(String nom, int nivvie){
        Nom = nom;
        Nivvie = nivvie;
    }

    @Override
    public String toString() {
        return "Personnages{" + "Nom= " + Nom + ", Niveau de vie = " + Nivvie + '}';
    }
    
    public void ajouter_arme(Arme arme){
        if (liste_armes.size() <5){
            liste_armes.addElement(arme);
        }else{
            System.out.println(Nom + "possède déjà ses 5 armes");
        }
    }
    public void choisir_arme(Arme arme){
        if (liste_armes.contains(arme)){
            Arme_en_Main = arme;
            System.out.println("L'arme en main est : "+Arme_en_Main.get_nom());
        }
    }

    public String get_nom() {
        return Nom;
    }

    public Vector getListe_armes() {
        return liste_armes;
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
}
