/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heritage_hunaut;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class TP3_Heritage_Hunaut {

    public static void main(String[] args) {
    int k ;
    Arme v;
    Epee Lame1 = new Epee("Excalibur",7,5);
    Epee Lame2 = new Epee("Durandal",4,7);
    Epee Lame3 = new Epee("Le katana de Hattori Hanzo",9,11);
    Epee LameFinale = new Epee("Le sabre laser de Luke Skywalker",14,12);
    Baton Stick1 = new Baton("Chene",4,5);
    Baton Stick2 = new Baton("Charme",5,6);
    Baton Stick3 = new Baton("Cerisier",6,7);
    Baton StickFinal = new Baton("Tharkûn",8,9);
    ArrayList<Arme> Tab =new ArrayList<Arme>() ;
    Tab.add(Lame1 );
    Tab.add(Lame2 );
    Tab.add(Lame3 );
    Tab.add(Stick1 );
    Tab.add(Stick2 );
    Tab.add(Stick3 );
    for (int i=0 ; i<Tab.size()  ; i++){
        v=Tab.get(i) ;
        System.out.println(v ) ;
    }
    Magicien Mage1 = new Magicien("Gandalf",65,true);
    Magicien Mage2 = new Magicien("Garcimore",44,false);
    Guerrier Warrior1 = new Guerrier("Conan",78,false);
    Guerrier Warrior2 = new Guerrier("Lannister",45, true );
    ArrayList<Personnage> Tib =new ArrayList<Personnage>() ;
    Tib.add(Mage1 );
    Tib.add(Mage2);
    Tib.add(Warrior1 );
    Tib.add(Warrior2 );
    Warrior1.toBackpack(Stick1);
    Warrior1.toBackpack(Lame3);
    Warrior1.toBackpack(Lame2);
    Warrior1.toArme("Le katana de Hattori Hanzo");
    Mage1.toBackpack(Lame1);
    Mage1.toBackpack(Stick3);
    Mage1.toBackpack(Stick2);
    Mage1.ArmesPref();
    Warrior1.ArmesPref();
    Magicien Magefinal = new Magicien("Merlin",76,true);
    Guerrier Warriorfinal = new Guerrier("Genghis Khan",94,true);
    Warriorfinal.toBackpack(LameFinale);
    Magefinal.toBackpack(StickFinal);
    Warriorfinal.toArme("Le sabre laser de Luke Skywalker");
    Magefinal.toArme("Tharkûn");
    System.out.println(Magefinal) ;
    System.out.println(Warriorfinal) ;
    System.out.println(Personnage.Nb_Persos);
    System.out.println(Magicien.Nb_Magiciens);
    System.out.println(Guerrier.Nb_Guerriers);
    Warriorfinal.seFatiguer();
    Warriorfinal.estVivant() ;
    Warriorfinal.attaquer(Magefinal);
    System.out.println(Warriorfinal) ;
    System.out.println(Magefinal) ;
    System.out.println("_________________________MORRRRTALL COMBAT_________________________");
    Warrior2.toBackpack(Lame1);
    Warrior2.toArme("Excalibur");
    Mage2.toBackpack(Stick2);
    Mage2.toArme("Charme");
    System.out.println(Mage2) ;
    System.out.println(Warrior2) ;
    System.out.println("_________________________LE MAGE ATTAQUE_________________________");
    Mage2.attaquer(Warrior2);
    System.out.println(Mage2) ;
    System.out.println(Warrior2) ;
    System.out.println("_________________________LE GUERRIER ATTAQUE_________________________");
    Warrior2.attaquer(Mage2);
    System.out.println(Mage2) ;
    System.out.println(Warrior2) ;
    Mage2.estVivant();
    Warrior2.estVivant();
    
    
    
    }
}
