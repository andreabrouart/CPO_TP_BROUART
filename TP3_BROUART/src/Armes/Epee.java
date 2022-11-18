/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Asus
 */
public class Epee extends Arme{
int indice;

    public Epee(String n, int atk, int i) {
        super(n, atk);
        if (indice>99){
            indice=99;
        }
        if (indice<0){
            indice=0;
        }
            indice = i;  
    }

    @Override
    public String toString() {
        return "Epee{" + "indice= " + indice + '}';
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}

