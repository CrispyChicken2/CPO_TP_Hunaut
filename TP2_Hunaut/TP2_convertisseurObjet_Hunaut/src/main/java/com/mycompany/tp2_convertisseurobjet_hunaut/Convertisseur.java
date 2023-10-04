/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_hunaut;

/**
 *
 * @author Asus
 * Prénom : Oscar
 * Nom : Hunaut
 * TDC
 */
public class Convertisseur {
    int nbConversions = 0 ;

public Convertisseur (int NombreConv){ 
nbConversions = NombreConv ;
}

public double CelsiusVersKelvin( double tempC) {
        double tempK;
        tempK = tempC + 273.15 ;
        return tempK;
    }
    public double KelvinVersCelsius( double tempK) {
        double tempC;
        tempC = tempK - 273.15 ;
        return tempC;
    }
    public double CelsiusVersFahrenheit( double tempC) {
        double tempF;
        tempF = (tempC * 9 / 5) + 32 ;
        return tempF;
    }
    public double FahrenheitVersCelsius( double tempF) {
        double tempC;
        tempC = (tempF - 32) * 5 / 9 ;
        return tempC;
    }  
    public double KelvinVersFahrenheit( double tempK) {
        double tempF;
        tempF = (tempK - 273.15) * 9 / 5 + 32 ;
        return tempF;
    }
    public double FahrenheitVersKelvin( double tempF) {
        double tempK;
        tempK = (tempF - 32) * 5 / 9 + 273.15 ;
        return tempK;
    }
    
@Override
public String toString () {
    return "nb conversions" + nbConversions ;  
}
}