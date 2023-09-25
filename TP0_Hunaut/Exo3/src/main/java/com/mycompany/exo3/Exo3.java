/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo3;

import java.util.Scanner;

/**
 *
 * @author Asus
 * prénom : Oscar
 * nom : Hunaut
 * groupe : TDC
 * date : 18/09
 */
public class Exo3 {

    public static void main(String[] args) {
        int pesto;
        int carbo;
        int resultat = 0 ;
        String str;
        Scanner sc;
        sc = new Scanner(System.in) ;
        System.out.print("Please enter the operator :" + "\n" + "1) add" + "\n" + "2) substract" + "\n" + "3) multiply" + "\n" + "4) divide" + "\n" + "5) modulo"+ "\n");
        str = sc.nextLine() ;
        System.out.println("Please enter first number :");
        pesto = sc.nextInt() ;
        System.out.println("Please enter second number :");
        carbo = sc.nextInt() ;
        if ((null==str)||(carbo>5)||(carbo<1)||(pesto>5)||(pesto<1)) {
            System.out.println("Enter a correct operator !") ;
        } else switch (str) {
            case "add":
            case "1":
                resultat = carbo + pesto ;
                break;
            case "substract":
            case "2":
                resultat = pesto - carbo ;
                break;
            case "multiply":
            case "3":
                resultat = carbo * pesto ;
                break;
            case "divide":
            case "4":
                resultat = pesto / carbo ;
                break;
            case "modulo":
            case "5":
                resultat = pesto%carbo ;
                break;
            default:
                System.out.println("Enter a correct operator and keep bumber 1 and number 2 between 1 and 5 included !") ;
                break;
        }
        System.out.println("The result is : " + resultat);
        }    
    }
