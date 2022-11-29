/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Asus
 */
public class Magicien extends Personnages{
    boolean Confirme;

    public Magicien(String nom, int nivvie, boolean Confirme) {
        super(nom, nivvie);
        this.Confirme = Confirme;
    }
    
    
    public void setter_confirme(boolean confirme){
        Confirme = confirme;
    }
}
