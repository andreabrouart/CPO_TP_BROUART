/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Asus
 */
public class Guerrier extends Personnages{
    boolean Acheval;
    
    public Guerrier(String nom, int nivvie, boolean acheval){
        Acheval = acheval;
         
    }
    public void setter_acheval(boolean acheval){
        Acheval = acheval;
    }
}

