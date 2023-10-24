/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author Asus
 */
public abstract class Arme {
    public String Nom ;
    private int ATK ;

public Arme (String unNom , int unDMG) {
    if (unDMG>=100) {
        unDMG=1 ;
    }
    Nom = unNom ;
    ATK = unDMG ;
}
@Override
public String toString () {
    String chaine_a_retourner ;
    chaine_a_retourner = Nom+ " fait " + ATK + " de dégats par coup" ;
    return chaine_a_retourner ;  
} 
public int toDamage () {
    return this.ATK ;
}
public String toName(){
    return this.Nom ;
}


}
