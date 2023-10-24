/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Asus
 */

public class Epee extends Arme {
    public int finesse ;
    
public Epee(String unNom, int unDMG, int uneFinesse) {
    super(unNom, unDMG);
    if (uneFinesse >=100){
        uneFinesse = 1;
    }
    finesse = uneFinesse ;
} 
public int toFinesse(){
    return this.finesse ;
}
}
