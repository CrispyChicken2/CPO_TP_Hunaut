/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_hunaut;

/**
 *
 * @author Asus
 */
public class TP2_Bieres_Hunaut {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere( "Cuvée de Trolls" , (float) 7.0 , "Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere deuxBiere = new BouteilleBiere( "Leffe" , (float) 6.6 , "Abbaye de Leffe") ;
        deuxBiere.lireEtiquette();
        BouteilleBiere troisBiere = new BouteilleBiere( "Punk IPA" , (float) 5.4 , "Brewdog") ;
        troisBiere.lireEtiquette();
        BouteilleBiere quatreBiere = new BouteilleBiere( "Bob's Beer au Piment d'Espelette" , (float) 4.5 , "Etxeko") ;
        quatreBiere.lireEtiquette();
        BouteilleBiere cinqBiere = new BouteilleBiere( "Edelweiss" , (float) 5.0 , "Heineken") ;
        cinqBiere.lireEtiquette();
        BouteilleBiere sixBiere = new BouteilleBiere( "La Blanche" , (float) 4.7 , "Mont-Blanc") ;
        sixBiere.lireEtiquette();
        BouteilleBiere septBiere = new BouteilleBiere( "Triple" , (float) 8.4 , "Ninkasi") ;
        septBiere.lireEtiquette();
        quatreBiere.Décapsuler();
        cinqBiere.Décapsuler();
        septBiere.Décapsuler();
        System.out.println(quatreBiere) ;
        System.out.println(cinqBiere) ;
        System.out.println(septBiere) ;
        
}
}
