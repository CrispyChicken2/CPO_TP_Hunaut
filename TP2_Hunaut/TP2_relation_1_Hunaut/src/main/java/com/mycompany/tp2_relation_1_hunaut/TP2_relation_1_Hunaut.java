/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_hunaut;

/**
 *
 * @author Asus
 */
public class TP2_relation_1_Hunaut {

    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture une911 = new Voiture ("911 GT3 RS", "Porsche", 525 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles : "+ "\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra + "\n" + une911) ;
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.proprietaire = bob ;
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures = 2 ;
        une2008.proprietaire = bob ;
        reno.liste_voitures[0] = uneAutreClio ;
        reno.nbVoitures = 1 ;
        uneAutreClio.proprietaire = reno ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneMicra.proprietaire = reno ;
        bob.ajouter_voiture(une911) ;
        reno.ajouter_voiture(une911) ;
        System.out.println("Bob a " + bob.liste_voitures[0] + " et "+ bob.liste_voitures[1] + " et " + bob.liste_voitures[2]);
        System.out.println("Reno a " + reno.liste_voitures[0] + " et "+ reno.liste_voitures[1]);

        
    }
}
