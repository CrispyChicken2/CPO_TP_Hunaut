/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_hunaut;

/**
 *
 * @author Asus
 */
public class BouteilleBiere {
    String nom ;
    float degreAlcool ;
    String  brasserie ;
    boolean ouverte ; 
    
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie) ;
}

public BouteilleBiere (String unNom , float unDegre , String uneBrasserie ){ 
  nom = unNom ;
  degreAlcool = unDegre ;
  brasserie = uneBrasserie ;
  ouverte = false ;
}
public boolean Décapsuler() {
    if (ouverte == false) {
        ouverte = true ;
        System.out.println("Et une " + nom + "! Ta biere est ouverte mon gaté. ");
        return true ;
    } else if (ouverte == true){
        System.out.println("Déja ouverte mon gaté!");
        return false ;
    } 
    return false ;
}
@Override
public String toString () {
    String chaine_a_retourner ;
    chaine_a_retourner = nom + " (" + degreAlcool + "degres) Ouverte ?" ;
    if (ouverte==true) 
        chaine_a_retourner += " Bien sur mon gaté" ;
     else 
        chaine_a_retourner += " Pas encore mon gaté" ;
    return chaine_a_retourner ;  
}
}
