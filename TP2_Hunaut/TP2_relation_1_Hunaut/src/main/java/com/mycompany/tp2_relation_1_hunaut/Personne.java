/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hunaut;

/**
 *
 * @author Asus
 */
public class Personne {
     String nom ;
     String prenom ;
     int nbVoitures ;
     Voiture [] liste_voitures ;
     
public Personne (String unPrenom, String unNom){ 
    prenom = unPrenom ;
    nom = unNom ;
    liste_voitures = new Voiture[3] ;
    int nbVoitures = 0 ;
}
@Override
public String toString () {
    String chaine_a_retourner ;
    chaine_a_retourner = chaine_a_retourner = prenom + nom;
    return chaine_a_retourner ;  
}  

public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("Voiture volée !!");
        return false ;
    } 
    if (nbVoitures >= 3 ){
        System.out.println("La personne ne peut pas avoir plus de voitures !");
        return false ;
    } else {
        liste_voitures[nbVoitures] = voiture_a_ajouter ;
        nbVoitures +=1 ;
        voiture_a_ajouter.proprietaire = this ;
        return true ;
    }
}
}
