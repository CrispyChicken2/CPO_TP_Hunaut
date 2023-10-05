/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_hunaut;


/**
 *
 * @author Asus
 */
public class TP2_manip_Hunaut {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        assiette2 = assiette1 ;
        assiette1 = assiette3 ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        Moussaka [] tabMoussaka = new Moussaka[10];
        for (int i=0 ; i<=9 ; i++){
            int n = 350+50*(i+1) ;
            tabMoussaka[i] = new Moussaka(n) ;
        System.out.println(tabMoussaka);
            

    }
}
}

