/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_stats_hunaut;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class TP1_stats_Hunaut {

    public static void main(String[] args) {
        int tab [] = new int[6] ;
        int m = 0 ;
        int i, j ;
        Scanner sc ;
        Random generateurAleat = new Random();
        sc = new Scanner(System.in) ;
        System.out.println("Veuillez rentrer un nombre :") ;
        m = sc.nextInt() ;
        for (i=0 ; i<m ; i++) {
            int n = generateurAleat.nextInt(6) ;
            tab [n] +=1 ;
        }  
        for (j=0 ; j<6 ; j++) {
            double k = tab[j]*100/m ;
            System.out.println(k + "%") ;
        }
    }
}

