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
public class Guerrier extends Personnage{
        public boolean Cheval ;
        public static int Nb_Guerriers = 0;
    
public Guerrier(String Name, int uneVie, Boolean Horse){
    super(Name,uneVie);
    Cheval = Horse;
    Nb_Guerriers+=1 ;
} 
public void Modifier(){
    if (this.Cheval==true){
        this.Cheval=false;
    } else {
        this.Cheval=true;
    }
}
static int toGuerrier(){
        return Nb_Guerriers;
    }
}
