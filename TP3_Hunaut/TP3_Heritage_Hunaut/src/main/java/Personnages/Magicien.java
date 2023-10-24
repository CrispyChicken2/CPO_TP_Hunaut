/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author Asus
 */
public class Magicien extends Personnage {
        boolean Conf ;
        public static int Nb_Magiciens = 0;
    
public Magicien(String Name, int uneVie, Boolean Confirmé) {
    super(Name,uneVie);
    Conf = Confirmé;
    Nb_Magiciens+=1;
} 
public void Modifier(){
    if (this.Conf==true){
        this.Conf=false;
    } else {
        this.Conf=true;
    }
}
public boolean toConf(){
    if (Conf = true){
        return true ;
    } else {
        return false;
    }
}
}