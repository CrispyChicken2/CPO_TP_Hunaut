/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes ;

/**
 *
 * @author Asus
 */
public class Baton extends Arme {
    public int age ;
    
public Baton(String unNom, int unDMG, int unAge) {
    super(unNom, unDMG);
    if (unAge>=100){
        unAge = 1;
    }
    age = unAge ;
} 
public int toAge(){
    return this.age ;
}
}
