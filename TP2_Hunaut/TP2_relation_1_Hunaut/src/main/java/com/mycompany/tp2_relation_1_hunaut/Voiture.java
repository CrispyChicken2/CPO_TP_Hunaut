/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hunaut;

/**
 *
 * @author Asus
 */
public class Voiture {
    String modele ;
    int Pcv ;
    String marque ;
    Personne proprietaire ;

public Voiture (String unModele, String uneMarque, int PuiCV ){ 
    modele = unModele ;
    marque = uneMarque;
    Pcv = PuiCV ;
    proprietaire = null ;
    
}
@Override
public String toString () {
    String chaine_a_retourner ;
    chaine_a_retourner = chaine_a_retourner = "La " + marque + " " + modele +" avec une puissance de " + Pcv + "chevaux" ;
    return chaine_a_retourner ;  
}    
}

