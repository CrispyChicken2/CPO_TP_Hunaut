/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;

/**
 *
 * @author Asus
 * Classe cellule Lumineuse 
 * Attributs : 
 * Boolean Etat
 */
public class CelluleLumineuse {
    private boolean Etat ;
    
    /**
     *
     * @param unEtat
     * Constructeur de la classe Cellule Lumineuse et qui initialise l'Etat des cellules a false, càd etientes 
     */
    public CelluleLumineuse( boolean unEtat){
        Etat = unEtat = false;
    }
    
    /**
     * methode activerCellule qui permet d'inverser l'Etat d'une cellule
     */
    public void activerCellule(){
        if (Etat==false){
            System.out.println("Et la lumiere fut !");
            Etat = true;
        } else {
            System.out.println("Retourne dans la nuit cellule !");
            Etat = false;
        }
    }
    
    /**
     *Methode qui permet de passer l'etat d'une cellule a false, càd l'éteindre
     */
    public void eteindreCellule(){
        if (this.Etat==true){
            this.Etat=false;
        }
    } 
    
    /**
     *
     * @param Etat
     * @return
     * Methode qui permet de renseigner sur l'etat d'une cellue lumineuse
     * Si la cellule est etiente alors la methode renvoie true et si elle est allumée, elle renvoie false
     */
    public boolean estEteint(boolean Etat){
        if (Etat==false){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     *
     * @param Lampe
     * @return
     * Methode permettant de connaitre l'etat d'un objet de la classe CelluleLumineuse
     */
    public boolean getEtat(){
        if (this.Etat == true){
            System.out.println("Cette cellule emet de la lumiere");
            return true ;
        } else {
            System.out.println("Cette cellule git dans les abysses");
            return false ;
        }
    }

    /**
     *
     * @param Spot
     * @return
     * Methode permettant d'afficher l'etat d'un objet de la classe celluleLumineuse sous forme de string
     */
    @Override
    public String toString () {
    String chaine_a_retourner ;
    if (this.Etat == true){
        chaine_a_retourner = "X" ;
        return chaine_a_retourner ;    
    } else {
        chaine_a_retourner = "O" ;
        return chaine_a_retourner ; 
    }
}
}