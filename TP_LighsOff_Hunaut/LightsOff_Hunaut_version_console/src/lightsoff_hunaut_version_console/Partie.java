/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Partie {
    GrilleDeCellules grille ;
    int nbCoups ;
    
    /**
     * Constructeur qui initailise le nombre de coups a 0 et genere une grille de jeu vierge ( avec les lumieres off)
     * Modification : la fonction prend un parametre de type int qui definit la difficulté 
     * de la partie et donc la taille de la grille
     */
    public Partie(){
        this.nbCoups = 0  ;
        String STR ;
        Scanner sp;
        sp = new Scanner(System.in);
        System.out.println("Veuillez saisir une difficulte : \n" + "1) Facile \n" + "2) Normal \n" + "3) Difficile \n" + "4) Hardcore");
        STR = sp.nextLine() ;
        if (null==STR) {
                System.out.println("Choisissez une difficulté parmis celles disponibles") ;
            } else switch (STR) {
                case "Facile ":
                case "1" :
                    grille = new GrilleDeCellules(4,4);
                    break;
                case "Normal":
                case "2":
                    grille = new GrilleDeCellules(7,7);
                    break;
                case "Difficile":
                case "3":
                    grille = new GrilleDeCellules(10,10);                  
                    break;
                case "Hardcore":
                case "4":
                    grille = new GrilleDeCellules(14,18);
                    break;
                default:
                    break;
            }
        
    }
    
    /**
     * NON UTILISE
     *Methode qui mealange la grille 8 tours et s'assure qu'elle est bien melangée, sinon la remelange
     * Modifications :
     * --> Creation de difficultés de jeu qui impactent le nombre de mélanges 
     * éffectués lors de l'initlaisation de la partie
     * ---> Desormais inutile
     */
    public void initialiserPartie(){
        String str = null ;
        Scanner sc;
        sc = new Scanner(System.in) ;
        System.out.println("Veuillez saisir une difficulte : \n" + "1) Facile \n" + "2) Normal \n" + "3) Difficile \n" + "4) Hardcore");
        str = sc.nextLine();
        if (null==str) {
                System.out.println("Choisissez une difficulté parmis celles disponibles") ;
            } else switch (str) {
                case "Facile ":
                case "1" :
                    this.grille.melangerMatriceAleatoirement(3);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(3);
                    }
                    break;
                case "Normal":
                case "2":
                    this.grille.melangerMatriceAleatoirement(6);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(6);
                    }
                    break;
                case "Difficile":
                case "3":
                    this.grille.melangerMatriceAleatoirement(9);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(9);
                    }                       
                    break;
                case "Hardcore":
                case "4":
                    System.out.println("Attention ! : La grille n'est pas forcement solvable dans ce mode !");
                    Random rand = new Random() ;
                    for (int a=0;a<this.grille.Nb_Lignes;a++){
                        for (int b = 0; b<this.grille.Nb_Colonnes;b++){
                            int r = rand.nextInt(2);
                            if (r==0){
                                this.grille.matriceCellules[a][b].Etat = false ;
                            } else {
                                this.grille.matriceCellules[a][b].Etat = true ;
                            }    
            }
        }
                default:
                    break;
            }
    }
    
     /**
     *Methode qui mealange la grille 8 tours et s'assure qu'elle est bien melangée, sinon la remelange
     * Modifications :
     * --> Creation de difficultés de jeu qui impactent le nombre de mélanges 
     * éffectués lors de l'initlaisation de la partie
     * Modification : melange la matrice en focntion du nombre de lignes de la matrice
     *                qui depends de la difficulté de la partie demandé dans le constructeur 
     */
    public void initialiserPartie2 (){
        if (this.grille.Nb_Lignes==0) {
                System.out.println("Choisissez une difficulté parmis celles disponibles") ;
            } else switch (this.grille.Nb_Lignes) {
                case 4:
                    this.grille.melangerMatriceAleatoirement(3);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(3);
                    }
                    break;
                case 7:
                    this.grille.melangerMatriceAleatoirement(6);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(6);
                    }
                    break;
                case 10:
                    this.grille.melangerMatriceAleatoirement(9);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(9);
                    }                       
                    break;
                case 14:
                    System.out.println("Attention ! : La grille n'est pas forcement solvable dans ce mode !");
                    Random rand = new Random() ;
                    for (int a=0;a<this.grille.Nb_Lignes;a++){
                        for (int b = 0; b<this.grille.Nb_Colonnes;b++){
                            int r = rand.nextInt(2);
                            if (r==0){
                                this.grille.matriceCellules[a][b].Etat = false ;
                            } else {
                                this.grille.matriceCellules[a][b].Etat = true ;
                            }    
            }
        }
                default:
                    break;
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
                System.out.println("Choisissez un coup parmis ceux disponibles") ;
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
     
    /**
     * NON UTILISE
     */
    public void JEU(){
        String str = null ;
        Scanner sc;
        sc = new Scanner(System.in) ;
        this.nbCoups = 0  ;
        System.out.println("Veuillez saisir une difficulte : \n" + "1) Facile \n" + "2) Normal \n" + "3) Difficile \n" + "4) Hardcore");
        str = sc.nextLine();
        if (null== str ){
            System.out.println("Choisissez une difficulté parmis celles disponibles") ;
        } else switch (str) {
            case "1":
            case "Facile":
                grille = new GrilleDeCellules(3,3);
                this.grille.melangerMatriceAleatoirement(3);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(3);
                    }
                break;
            case "2":
            case "Normal":
                grille = new GrilleDeCellules(6,6);
                this.grille.melangerMatriceAleatoirement(6);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(6);
                    }
                break;
            case "3":
            case "Difficile":
                grille = new GrilleDeCellules(9,9);
                this.grille.melangerMatriceAleatoirement(9);
                    if (this.grille.cellulesToutesEteintes()==true){   
                    } else {
                    this.grille.melangerMatriceAleatoirement(9);
                    }
                break;
            case "4":
            case "Hardcore":
                grille = new GrilleDeCellules(5,15);
                System.out.println("Attention ! : La grille n'est pas forcement solvable dans ce mode !");
                    Random rand = new Random() ;
                    for (int a=0;a<this.grille.Nb_Lignes;a++){
                        for (int b = 0; b<this.grille.Nb_Colonnes;b++){
                            int r = rand.nextInt(2);
                            if (r==0){
                                this.grille.matriceCellules[a][b].Etat = false ;
                            } else {
                                this.grille.matriceCellules[a][b].Etat = true ;
                            }    
            }
        }
                break;
            default:
                break;
        }

    }
}
