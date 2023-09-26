/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_hunaut;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TP1_manipNombresInt_Hunaut {

    public static void main(String[] args) {
        int X = 0 ;
        int Y = 0;
        int S = 0 ;
        int D = 0 ;
        int P = 0 ;
        Scanner sc;
        sc = new Scanner(System.in) ;
        System.out.println("Veuillez entrer deux entier X et Y : " + "\n" + " X : ") ;
        X = sc.nextInt() ;
        System.out.println(" Y : ");
        Y = sc.nextInt() ;
        S = X + Y ;
        D = X - Y;
        P = X * Y ;
        System.out.println("On a alors X = " + X + " et Y = " + Y);
        System.out.println("La somme de ces deux nombres est : " + S );
        System.out.println("La différence de ces deux nombres est : " + D );
        System.out.println("Le produit de ces deux nombres est : " + P );
        System.out.println("Le quotient de X par Y vaut : " + X/Y + " et le reste vaut : " + X % Y) ;
        }
}
       