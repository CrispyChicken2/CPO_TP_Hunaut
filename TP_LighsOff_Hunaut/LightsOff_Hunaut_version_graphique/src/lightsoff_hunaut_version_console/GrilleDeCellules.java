/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 * Oscar Hunaut
 * TDC
 */
public class GrilleDeCellules {
    int Nb_Lignes;
    int Nb_Colonnes;
    CelluleLumineuse[][] matriceCellules ;

    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * methode qui crée une matrice de taille Lignes x Colonnes et qui rempli chaque case par un nouvel objet Cellule Lumineuse
    */
    public GrilleDeCellules(int Lignes ,int Colonnes){
        Nb_Lignes = Lignes ;
        Nb_Colonnes = Colonnes ; 
        matriceCellules = new CelluleLumineuse[Lignes][Colonnes] ;
        for (int i= 0 ;  i<Lignes ; i++){
            for (int j = 0 ; j< Colonnes ; j++){
                matriceCellules[i][j] = new CelluleLumineuse(false) ;
            }
        }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Mathode qui une affiche la matrice de cellules 
    * Modification de la fonction toString pour pouvoir afficher les matrices de tailles inferieur a 100
    */
    @Override
    public String toString () { 
        int L;
        int K;
        if (this.Nb_Lignes%2 == 0) {
            K = (this.Nb_Lignes/2)-1  ;   
        } else {
            K = ((this.Nb_Lignes-1)/2)-1  ;
        }
        ;
        String CAR ="" ;
        if (this.Nb_Lignes>=8){
            L = 3;
        } else {
            L = 2;
        }
        for (int x = 0 ; x < (this.Nb_Lignes/2)-K ; x++){
            if (x==0){
                for (int d=0 ; d<this.Nb_Colonnes+1 ; d++){
                    if (d==0){
                        CAR += ("   |");
                    }else if (d<=10){
                        int h = d-1 ;
                        CAR+=(" " + h + " |");
                    } else {
                        int h = d-1 ;
                    CAR+=(+ h + " |");
                    }
                }    CAR+=("\n");
                for (int l=0 ; l<this.Nb_Colonnes+1;l++){
                    CAR+=("----");
                }
                CAR+=("\n");
            }
            for (int o=0;o<2;o++){
                if (o==0){
                for (int d=0 ; d<this.Nb_Lignes ; d++){
                    int h = d+1;
                    int p = h-1;
                    if (h==0){
                        CAR += ("   |");
                    }else if (h<=10){
                    CAR+=(" " + p + " |");
                    for (int t = 0; t<this.Nb_Colonnes ; t++){
                        if (this.matriceCellules[d][t].Etat ==  true){
                            CAR+=(" X |");
                        } else {
                            CAR+=(" O |");
                        } 
                }
                    CAR+=("\n");
                    for (int l=0 ; l<this.Nb_Colonnes+1;l++){
                    CAR+=("----");
                }
            CAR+=("\n");
            }
                else {
                    CAR+=( p + " |");
                    for (int t = 0; t<this.Nb_Colonnes ; t++){
                        if (this.matriceCellules[d][t].Etat ==  true){
                            CAR+=(" X |");
                        } else {
                            CAR+=(" O |");
                        } 
                }
                    CAR+=("\n");
                    for (int l=0 ; l<this.Nb_Colonnes+1;l++){
                    CAR+=("----");
                }
            CAR+=("\n");
            } 
        }
        }} }   
    return CAR;
}
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui eteint toutes les cellules de la matrice de cellules
    */
    public void eteindreToutesLesCellules(){
        for (int a=0;a<this.Nb_Lignes;a++){
            for (int b = 0; b<this.Nb_Colonnes;b++){
                this.matriceCellules[a][b].Etat = false ;
            }
        }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active au hasard un ligne un colonne ou une diagonale de la matrice de cellules
    * Modification : 
    * --> Modfication de la fonction pour qu'elle puisse traiter les matrices non carrees 
    */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random rand = new Random() ;
        int r = rand.nextInt(4);
        if (r==0){
            int A = rand.nextInt(this.Nb_Lignes);
            for (int a=0;a<this.Nb_Colonnes;a++){
                if (this.matriceCellules[A][a].Etat == false){
                    this.matriceCellules[A][a].Etat = true;
                } else {
                    this.matriceCellules[A][a].Etat = false;
                }
            }
        }else if (r==1){
            int B = rand.nextInt(this.Nb_Colonnes);
            for (int b=0;b<this.Nb_Lignes;b++){
                if (this.matriceCellules[b][B].Etat == false){
                    this.matriceCellules[b][B].Etat = true;
                } else {
                    this.matriceCellules[b][B].Etat = false;
                }
            }
        } else if (r==2){
            this.activerDiagonaleDescendanteAleatoire();
        }else if (r==3){
            this.activerDiagonaleMontanteAleatoire();
        }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active la colonne X de la matrice de cellules, X etant le numero de la colonne a activer
    */    
    public void activerColonneDeCellules(int IdColonne){
        for (int b=0;b<this.Nb_Lignes;b++){
                if (this.matriceCellules[b][IdColonne].Etat == false){
                    this.matriceCellules[b][IdColonne].Etat = true;
                } else {
                    this.matriceCellules[b][IdColonne].Etat = false;
                }
            }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active la ligne X de la matrice de cellules, X etant le numero de la ligne a activer
    */ 
    public void activerLigneDeCellules(int IdLigne){
        for (int a=0;a<this.Nb_Colonnes;a++){
                if (this.matriceCellules[IdLigne][a].Etat == false){
                    this.matriceCellules[IdLigne][a].Etat = true;
                } else {
                    this.matriceCellules[IdLigne][a].Etat = false;
                }
            }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active la diagonale montante de la matrice de cellules
    */ 
    public void activerDiagonaleMontante(){
        String Str ;
        Scanner sc ;
        sc = new Scanner(System.in);
        if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Colonnes-d-1 ;
                    if (this.matriceCellules[D][d].Etat == false){
                    this.matriceCellules[D][d].Etat = true;
                } else {
                    this.matriceCellules[D][d].Etat = false;
                }
                }
        } else {
                System.out.println("Laquelle : \n" + "1 ) Celle qui arrive du coin superieur droit\n" + "2 ) Celle qui demarre du coin inferieur gauche");
            Str = sc.nextLine();
            if (null==Str) {
                System.out.println("Choisissez une option parmis celles presentees") ;
            } else switch (Str) {
                case "Coin superieur droit ":
                case "droit":
                case "1" :
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Colonnes-d-1;
                    System.out.println(D);
                    System.out.println(d);
                    if (this.matriceCellules[d][D].Etat == false){
                    this.matriceCellules[d][D].Etat = true;
                } else {
                    this.matriceCellules[d][D].Etat = false;
                }}
                    break;
                case "Coin inferieur gauche":
                case "gauche":
                case "2":
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Lignes-d-1 ;
                    if (this.matriceCellules[D][d].Etat == false){
                    this.matriceCellules[D][d].Etat = true;
                } else {
                    this.matriceCellules[D][d].Etat = false;
                }
                }
                    break;
                default:
                    break;
                
            }}
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active la diagonale descendante de la matrice de cellules
    */ 
    public void activerDiagonaleDescendante(){
        String Str ;
        Scanner sc ;
        sc = new Scanner(System.in);
        if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                
        } else {
                System.out.println("Laquelle : \n" + "1 ) Celle qui arrive du coin inferieur droit\n" + "2 ) Celle qui demarre du coin superieur gauche");
            Str = sc.nextLine();
            if (null==Str) {
                System.out.println("Choisissez une option parmis celles presentees") ;
            } else switch (Str) {
                case "Coin inferieur droit ":
                case "droit":
                case "1" :
                    for (int c=0; c<this.Nb_Lignes;c++){
                    int C = this.Nb_Lignes-c-1;
                    int D = this.Nb_Colonnes-c-1;
                    if (this.matriceCellules[C][D].Etat == false){
                    this.matriceCellules[C][D].Etat = true;
                } else {
                    this.matriceCellules[C][D].Etat = false;
                }}
                    break;
                case "Coin superieur gauche":
                case "gauche":
                case "2":
                    for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                    break;
                default:
                    break;
                
            }}
    }

    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui verifie que toutes les cellules de la matrice de cellulmes sont bien éteintes
    */ 
    public boolean cellulesToutesEteintes(){
        int X = 0;
        for (int a=0;a<this.Nb_Lignes;a++){
            for (int b = 0; b<this.Nb_Colonnes;b++){
                if (this.matriceCellules[a][b].Etat == false){ 
                } else {
                    X=+1 ;
                }
            }
        }
        if (X==0){
            return true ;
        } else {
            return false ;
        }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui prends en parametre un bombe de tours et melange aléatoirement la matrice de 
    * cellules X fois, X etant le nombre de tours 
    * --> Modification : adaptée pour les matrices non carrées
    */ 
    public void melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int a=0 ; a<nbTours ; a++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
    *NON UTILISE
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui fonctionne que pour les matrices non carrées ;
    * Active soit la diagonale montante qui commence au coin inferieur gauche de la matrice 
    * soit la diagonale qui arrive au coin superieur droit de la matrice
    * --> methode implémentée dans la methode activerDiagonaleMontante pour la completer et l adapter
    * aux matrices non carrées 
    */ 
    public void activerDiagonaleMontanteMatriceNonCarree(){
        String Str ;
        Scanner sc ;
        sc = new Scanner(System.in);
        if (this.Nb_Colonnes!=this.Nb_Lignes){
            System.out.println("Laquelle : \n" + "1 ) Celle qui arrive du coin superieur droit\n" + "2 ) Celle qui demarre du coin inferieur gauche");
            Str = sc.nextLine();
            if (null==Str) {
                System.out.println("Choisissez une option parmis celles presentees") ;
            } else switch (Str) {
                case "Coin superieur droit ":
                case "droit":
                case "1" :
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Colonnes-d-1;
                    System.out.println(D);
                    System.out.println(d);
                    if (this.matriceCellules[d][D].Etat == false){
                    this.matriceCellules[d][D].Etat = true;
                } else {
                    this.matriceCellules[d][D].Etat = false;
                }}
                    break;
                case "Coin inferieur gauche":
                case "gauche":
                case "2":
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Lignes-d-1 ;
                    if (this.matriceCellules[D][d].Etat == false){
                    this.matriceCellules[D][d].Etat = true;
                } else {
                    this.matriceCellules[D][d].Etat = false;
                }
                }
                    break;
                default:
                    break;
                
            }} else {
                System.out.println("Impossible ! La matrice est carree !");
            }
    }
    
     /**
    *NON UTILISEE
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui fonctionne que pour les matrices non carrées ;
    * Active soit la diagonale descendante qui commence au coin superieur gauche de la matrice 
    * soit la diagonale qui arrive au coin inferieur droit de la matrice
    * --> methode implémentée dans la methode activerDiagonaleDescendante pour la completer et l adapter
    * aux matrices non carrées 
    */
    public void activerDiagonaleDescendanteMatriceNonCarree(){
        String Str ;
        Scanner sc ;
        sc = new Scanner(System.in);
        if (this.Nb_Colonnes!=this.Nb_Lignes){
            System.out.println("Laquelle : \n" + "1 ) Celle qui arrive du coin inferieur droit\n" + "2 ) Celle qui demarre du coin superieur gauche");
            Str = sc.nextLine();
            if (null==Str) {
                System.out.println("Choisissez une option parmis celles presentees") ;
            } else switch (Str) {
                case "Coin inferieur droit ":
                case "droit":
                case "1" :
                    for (int c=0; c<this.Nb_Lignes;c++){
                    int C = this.Nb_Lignes-c-1;
                    int D = this.Nb_Colonnes-c-1;
                    if (this.matriceCellules[C][D].Etat == false){
                    this.matriceCellules[C][D].Etat = true;
                } else {
                    this.matriceCellules[C][D].Etat = false;
                }}
                    break;
                case "Coin superieur gauche":
                case "gauche":
                case "2":
                    for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                    break;
                default:
                    break;
                
            }} else {
                System.out.println("Impossible ! La matrice est carree !");
            }
}
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Reprise de la methode activerDiagonaleDescendante afin 
    * de creer un melange selon les diagonales descendates d'une matrice aléatoirememnt
    */ 
    public void activerDiagonaleDescendanteAleatoire(){
        int A ;
        Random rand = new Random();
        if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                
        } else {
            A = rand.nextInt(1);
            if (A==0) {
                for (int c=0; c<this.Nb_Lignes;c++){
                    int C = this.Nb_Lignes-c-1;
                    int D = this.Nb_Colonnes-c-1;
                    if (this.matriceCellules[C][D].Etat == false){
                    this.matriceCellules[C][D].Etat = true;
                } else {
                    this.matriceCellules[C][D].Etat = false;
                }}
            } else {   
                for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }}}
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Reprise de la methode activerDiagonaleMontante afin 
    * de creer un melange selon les diagonales montantes d'une matrice aléatoirememnt
    */
    public void activerDiagonaleMontanteAleatoire(){
        int A ;
        Random rand = new Random();
        if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Colonnes-d-1 ;
                    if (this.matriceCellules[D][d].Etat == false){
                    this.matriceCellules[D][d].Etat = true;
                } else {
                    this.matriceCellules[D][d].Etat = false;
                }
                }
        } else {
            A = rand.nextInt(1);
            if (A==0) {
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Colonnes-d-1;
                    System.out.println(D);
                    System.out.println(d);
                    if (this.matriceCellules[d][D].Etat == false){
                    this.matriceCellules[d][D].Etat = true;
                } else {
                    this.matriceCellules[d][D].Etat = false;
                }}
            } else {
                    for (int d=0; d<this.Nb_Lignes;d++){
                    int D=this.Nb_Lignes-d-1 ;
                    if (this.matriceCellules[D][d].Etat == false){
                    this.matriceCellules[D][d].Etat = true;
                } else {
                    this.matriceCellules[D][d].Etat = false;
                }
                }
            }}}
}





