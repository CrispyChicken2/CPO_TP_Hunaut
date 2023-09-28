/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_hunaut;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TP1_guessMyNumber_Hunaut {

    public static void main(String[] args) {
        Scanner sc ;
        sc = new Scanner(System.in) ;
        String dif ;
        int g = 0;
        int i = 1;
        Random generateurAleat = new Random() ;
        System.out.println("Veuillez saisir une difficulté : " + "\n" + "1) Facile" + "\n" + "2) Normal" + "\n" + "3) Difficile" + "\n" + "4) Cauchemard" + "\n" + "5) Impossible");
        dif  = sc.nextLine();
        if (null==dif) {
            System.out.println("Saisissez une difficulté disponible!") ;
        } else switch (dif) {
            case "Facile":
            case "1":
                int n = generateurAleat.nextInt(10);
                System.out.println("Veuillez saisir un nombre entre 1 et 10");
                g = sc.nextInt();
                while (g!=n) {
                    if (g<n){
                        System.out.println("trop petit !");
                        g = sc.nextInt();
                        i+=1 ;
                    }else if (g>n) {
                        System.out.println("trop grand !") ;
                        g = sc.nextInt();
                        i+=1 ;
                    } else {
                        i+=1 ;
                    }}
                System.out.println("gagné !!" + "\n" + "Vous avez eu besoin de " + i + " tentatives !") ;
                break ;
            case "Normal":
            case "2":
                int p = generateurAleat.nextInt(100);
                System.out.println("Veuillez saisir un nombre entre 1 et 100");
                g = sc.nextInt();
                while (g!=p) {
                    if ((2*g)<p){
                        System.out.println("beaucoup trop petit !");
                        g = sc.nextInt();
                        i+=1 ;
                    }else if ((2*p)<g) {
                        System.out.println("beacoup trop grand !") ;
                        g = sc.nextInt();  
                        i+=1 ;
                    } else if ((g>p)&&((2*p)>g)){
                        System.out.println("trop grand!");
                        g = sc.nextInt();
                        i+=1 ;
                    } else if ((g<p)&&((2*g)>p)) {
                        System.out.println("trop petit!");
                        g = sc.nextInt();
                        i+=1 ;
                    }}
                System.out.println("gagné !!" + "\n" + "Vous avez eu besoin de " + i + " tentatives !") ;
                break;
            case "Difficile":
            case "3":
                int k = generateurAleat.nextInt(1000);
                System.out.println("Veuillez saisir un nombre entre 1 et 1000");
                g = sc.nextInt();
                while (g!=k) {
                    if (k>g){
                        System.out.println("trop petit !");
                        g = sc.nextInt();
                        i+=1 ;
                    }else if (k<g) {
                        System.out.println("trop grand !") ;
                        g = sc.nextInt(); 
                        i+=1 ;
                    }}
                System.out.println("gagné !!" + "\n" + "Vous avez eu besoin de " + i + " tentatives !") ;
                break;
            case "Impossible":
            case "5":
                int s = generateurAleat.nextInt(1000000);
                System.out.println("Veuillez saisir un nombre entre 1 et 1000000");
                g = sc.nextInt();
                while ((g!=s)&&(i<=9)) {
                    if (s>g){
                        System.out.println("trop petit !");
                        g = sc.nextInt();
                        i+=1 ;
                    }else if (s<g) {
                        System.out.println("trop grand !") ;
                        g = sc.nextInt();
                        i+=1 ;
                    }
                    }
                if (i<=9) {
                System.out.println("gagné !!" + "\n" + "Vous avez eu besoin de " + i + " tentatives !") ;
                } else {
                System.out.println("perdu!") ;   
                }
                break ;
            case "Cauchemard" :
            case "4" :
                int v = generateurAleat.nextInt(1000) ;
                System.out.println("Veuillez saisir un nombre entre 1 et 1000");
                g = sc.nextInt();
                while (g!=v) {
                    int proba = generateurAleat.nextInt(10);
                    if (proba<=3) {
                        if (v>g){
                            System.out.println("trop grand !");
                            g = sc.nextInt();
                            i+=1 ;
                        }else if (v<g) {
                            System.out.println("trop petit !") ;
                            g = sc.nextInt();
                            i+=1 ;
                        }
                    } else { 
                        if (v>g){
                            System.out.println("trop petit !");
                            g = sc.nextInt();
                            i+=1 ;
                        }else if (v<g) {
                            System.out.println("trop grand !") ;
                            g = sc.nextInt();
                            i+=1 ;
                        }
                    }   
                }
                System.out.println("gagné !!" + "\n" + "Vous avez eu besoin de " + i + " tentatives !") ;
                break;
            default :
                System.out.println("Veuillez choisir une des difficulltés disponibles!") ;
                break ;
                        }
        
    }
}
