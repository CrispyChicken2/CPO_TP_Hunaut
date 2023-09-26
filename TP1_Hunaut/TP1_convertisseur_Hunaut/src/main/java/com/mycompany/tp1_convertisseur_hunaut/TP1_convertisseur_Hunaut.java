/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_hunaut;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TP1_convertisseur_Hunaut {

    public static void main(String[] args) {
       Scanner sc, sp ;
       sc = new Scanner(System.in) ;
       sp = new Scanner(System.in) ;
       String str = "";
       double tempK ;
       double temp ;
       double res ;
       System.out.println("Veuillez rentrer un réel ( température) :") ;
       temp = sc.nextDouble() ;
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
            case "1":
                res = CelsiusVersKelvin(temp) ;
                System.out.println("Le resultat donne donc une temperature de : " + res + " Kelvin");
                break;
            case "Kelvin vers Celsius":
            case "2":
                res = KelvinVersCelsius(temp);
                System.out.println("Le resultat donne donc une temperature de : " + res + "° Celsius");
                break;
            case "Celsius vers Fahrenheit":
            case "3":
                res = CelsiusVersFahrenheit(temp) ;
                System.out.println("Le resultat donne donc une temperature de : " + res + "° Fahrenheit");
                break;
            case "Fahrenheit vers Celsius":
            case "4":
                res = FahrenheitVersCelsius(temp) ;
                System.out.println("Le resultat donne donc une temperature de : " + res + "° Celsius");
                break;
            case "Kelvin vers Fahrenheit":
            case "5":
                res = KelvinVersFahrenheit(temp) ;
                System.out.println("Le resultat donne donc une temperature de : " + res + "° Fahrenheit");
                break;
            case "Fahrenheit vers Kelvin" :
            case "6" :
                res = FahrenheitVersKelvin(temp);
                System.out.println("Le resultat donne donc une temperature de : " + res + " Kelvin");
            default:
                System.out.println("Choissez une conversion disponible") ;
                break;
                
                }
    }  
    public static double CelsiusVersKelvin( double tempC) {
        double tempK;
        tempK = tempC + 273.15 ;
        return tempK;
    }
    public static double KelvinVersCelsius( double tempK) {
        double tempC;
        tempC = tempK - 273.15 ;
        return tempC;
    }
    public static double CelsiusVersFahrenheit( double tempC) {
        double tempF;
        tempF = (tempC * 9 / 5) + 32 ;
        return tempF;
    }
    public static double FahrenheitVersCelsius( double tempF) {
        double tempC;
        tempC = (tempF - 32) * 5 / 9 ;
        return tempC;
    }  
    public static double KelvinVersFahrenheit( double tempK) {
        double tempF;
        tempF = (tempK - 273.15) * 9 / 5 + 32 ;
        return tempF;
    }
    public static double FahrenheitVersKelvin( double tempF) {
        double tempK;
        tempK = (tempF - 32) * 5 / 9 + 273.15 ;
        return tempK;
    }
}
