/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_hunaut;

import java.util.Scanner;

/**
 *
 * @author Asus
 * Prénom : Oscar
 * Nom : Hunaut
 * TDC
 */
public class TP2_convertisseurObjet_Hunaut {

    public static void main(String[] args) {
        Convertisseur unConvertisseur = new Convertisseur (0) ;
        Scanner sc, sp ;
        sc = new Scanner(System.in) ;
        sp = new Scanner(System.in) ;
        String str = "" ;
        String qst = "" ;
        int i = 0 ;
        double tempA ;
        double tempZ ;
        while (!"non".equals(qst)) {
            i+=1 ;
            System.out.println("Veuillez rentrer un réel ( température) :") ;
            tempA = sc.nextDouble() ;
            System.out.println("""
                            Saisissez la conversion que vous souhaitez effectuer : 
                            1) Celsius vers Kelvin
                            2) Kelvin vers Celsius
                            3) Celsius vers Fahrenheit
                            4) Fahrenheit vers Celsius
                            5) Kelvin vers Fahrenheit
                            6) Fahrenheit vers Kelvin""");
            str = sp.nextLine() ;
            if (null==str) {
                System.out.println("Choisissez une conversion parmis celle disponible") ;
            } else switch (str) {
                case "Celsius vers Kelvin":
                case "1" :
                    tempZ = unConvertisseur.CelsiusVersKelvin((float) tempA);
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + " Kelvin");
                    System.out.println("Vous avez fait " + i + " conversions");
                    break;

                case "Kelvin vers Celsius":
                case "2":
                    tempZ = unConvertisseur.KelvinVersCelsius((float) tempA);
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + "° Celsius");
                    System.out.println("Vous avez fait " + i + " conversions");
                    break;
                case "Celsius vers Fahrenheit":
                case "3":
                    tempZ = unConvertisseur.CelsiusVersFahrenheit((float) tempA) ;
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + "° Fahrenheit");
                    System.out.println("Vous avez fait " + i + " conversions");
                    break;
                case "Fahrenheit vers Celsius":
                case "4":
                    tempZ = unConvertisseur.FahrenheitVersCelsius((float) tempA) ;
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + "° Celsius");
                    System.out.println("Vous avez fait " + i + " conversions");
                    break;
                case "Kelvin vers Fahrenheit":
                case "5":
                    tempZ = unConvertisseur.KelvinVersFahrenheit((float) tempA);
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + "° Fahrenheit");
                    System.out.println("Vous avez fait " + i + " conversions");
                    break;
                case "Fahrenheit vers Kelvin" :
                case "6" :
                    tempZ = unConvertisseur.FahrenheitVersKelvin((float) tempA);
                    System.out.println("Le resultat donne donc une temperature de : " + tempZ + " Kelvin");
                    System.out.println("Vous avez fait " + i + " conversions");
                default:
                    break;
                
                }
            System.out.println("Voulez-vous faire encore une conversion ?") ;
            qst = sp.nextLine() ;
            
    }
}
}
