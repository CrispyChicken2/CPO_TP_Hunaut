/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Partie {
    GrilleDeCellules grille ;
    int nbCoups ;
    
    /**
     *Methode qui initailise le nombre de coups a 0 et genere une grille de jeu vierge ( avec les lumieres off)
     */
    public Partie(){
        this.nbCoups = 0  ;
        grille = new GrilleDeCellules(7,7);
    }
    
    /**
     *Methode qui mealange la grille 8 tours et s'assure qu'elle est bien melangée, sinon la remelange
     */
    public void initialiserPartie(){
        this.grille.melangerMatriceAleatoirement(8);
        if (this.grille.cellulesToutesEteintes()==true){   
        } else {
            this.grille.melangerMatriceAleatoirement(8);
        }
    }
    
    /**
     *Methode qui lance la partie et s'assure du bon fonctionnement du jeu, des tours de jeu et des manipulations
     */
    public void lancerPartie(){
        Scanner sc;
        sc = new Scanner(System.in) ;
        int Nb_Coups=0;
        int verif = 0 ;
        String str ;
        while(verif == 0){
                System.out.println("----------------------------------------------");
                System.out.println("Nombres de Coups effectues : " + Nb_Coups);
                System.out.println(this.grille.toString());
                System.out.println("""
                                   Choisissez un coup ajouer parmis les suivants :
                                   1 ) activer une ligne 
                                   2 ) activer une colonne 
                                   3 ) activer la diagonale montante 
                                   4 ) activer la diagonale descendante""");
                str = sc.nextLine();
                if (null==str) {
                System.out.println("Choisissez un coup parmis ceux disponible") ;
            } else switch (str) {
                case "activer une ligne":
                case "1" :
                    int X ;
                    System.out.println("Quelle ligne voulez vous activer ?");
                    X = sc.nextInt();
                    this.grille.activerLigneDeCellules(X);
                    Nb_Coups+=1;
                    break;
                case "activer une colonne":
                case "2":
                    int Y ;
                    System.out.println("Quelle colonne voulez vous activer ?");
                    Y = sc.nextInt();
                    this.grille.activerColonneDeCellules(Y);
                    Nb_Coups+=1;
                    break;
                case "activer la diagonale montante":
                case "3":
                    this.grille.activerDiagonaleMontante();
                    Nb_Coups+=1;
                    break;
                case "activer la diagonale descendante":
                case "4":
                    this.grille.activerDiagonaleDescendante();
                    Nb_Coups+=1;
                    break;
                default:
                    break;
                
                }
                if (this.grille.cellulesToutesEteintes()==true){
                verif+=1;
                break;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println(this.grille.toString());
        System.out.println("Felicitations !! Vous avez termine la partie en " + Nb_Coups +  " coups !");
    }
}
