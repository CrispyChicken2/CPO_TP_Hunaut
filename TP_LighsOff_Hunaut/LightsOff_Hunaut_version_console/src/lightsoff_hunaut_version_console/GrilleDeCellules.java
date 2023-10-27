/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;

import java.util.Random;

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
    */
    @Override
    public String toString () { 
        String CAR ="" ;
        for (int x = 0 ; x < (this.Nb_Lignes)/2-2 ; x++){
            if (x==0){
                for (int d=0 ; d<this.Nb_Colonnes+1 ; d++){
                    if (d==0){
                        CAR += ("   |");
                    }else {
                        int h = d-1 ;
                    CAR+=(" " + h + " |");
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
                    }else {
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
            }} 
        }
        } }   
    
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
            if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                
            } else {
                System.out.println("Impossible ! La matrice n'est pas carrée !");
            }
        }else if (r==3){
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
                System.out.println("Impossible ! La matrice n'est pas carrée !");
            }
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
                System.out.println("Impossible ! La matrice n'est pas carrée !");
            }
    }
    
    /**
    *
    * @author Asus
    * Oscar Hunaut
    * TDC
    * Methode qui active la diagonale descendante de la matrice de cellules
    */ 
    public void activerDiagonaleDescendante(){
        if (this.Nb_Colonnes==this.Nb_Lignes){
                for (int c=0; c<this.Nb_Lignes;c++){
                    if (this.matriceCellules[c][c].Etat == false){
                    this.matriceCellules[c][c].Etat = true;
                } else {
                    this.matriceCellules[c][c].Etat = false;
                }
                }
                
            } else {
                System.out.println("Impossible ! La matrice n'est pas carrée !");
            }
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
    * Methode qui prends en parametre un bombe de tours et melange aléatoirement la matrice de cellules X fois, X etant le nombre de tours 
    */ 
    public void melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int a=0 ; a<nbTours ; a++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
}




