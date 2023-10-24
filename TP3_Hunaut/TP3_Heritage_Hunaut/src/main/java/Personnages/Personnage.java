/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import com.mycompany.tp3_heritage_hunaut.etreVivant;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Personnage implements etreVivant{
    String Nom ;
    private int HP ;
    public static int Nb_Persos = 0;
    ArrayList<Arme> Backpack = new ArrayList<Arme>();
    Arme Arme_en_main = null ;
    
    
    public Personnage(String unNom , int Vie){
        Nom = unNom ;
        HP = Vie ;
        Nb_Persos+=1;
    }
    @Override
    public String toString () {
    String chaine_a_retourner ;
    if (this.Arme_en_main == null){ 
    chaine_a_retourner = Nom+ " a " + HP + " points de vie" ;
    } else {
    chaine_a_retourner = Nom+ " a " + HP + " points de vie et à en Main " + Arme_en_main.Nom + " qui fait " + Arme_en_main.toDamage() + " dégats par coup";  
    }
    return chaine_a_retourner ;  
}

    public int toLife () {
    return this.HP ;
}
    
    public void toBackpack(Arme weap){
        if (Backpack.size()<5){
        Backpack.add(weap);
    } else {
        }
        
        }
    
    public void toArme(String Name){
        for (int a=0 ; a<Backpack.size();a++){
            String G = Backpack.get(a).toName() ;
            if ( Name == G ){
                Arme_en_main = Backpack.get(a) ;
                System.out.println(Name + " a bien été équipée") ;
                break;
            }
        }
        if (Arme_en_main == null){  
        System.out.println(Name + " n'est pas dans ton Inventaire") ;
        }   
    }
    
    public void ArmesPref(){
        ArrayList<Arme> armespref = new ArrayList<Arme>() ;
        if (this instanceof Guerrier){ 
            for (int z=0 ; z<this.Backpack.size(); z++){
                if (this.Backpack.get(z) instanceof Epee) {
                    armespref.add(this.Backpack.get(z));
                }
            }
        } else if (this instanceof Magicien){
            for (int z=0 ; z<this.Backpack.size(); z++){
                if (this.Backpack.get(z) instanceof Baton) {
                    armespref.add(this.Backpack.get(z));
        }
    }
    }
    System.out.println("Ses armes préférées sont :");
    for (int y=0; y<armespref.size();y++){
    System.out.println(" x " + armespref.get(y).toName() + " qui fait " + armespref.get(y).toDamage() + " dégats par coup");
    }
    }
    
    public void seFatiguer(){
        this.HP-=10 ;
    }
    
    public boolean estVivant() {
        if (this.HP > 0){
            System.out.println("Le personnage est encore vivant !");
            return true ;
        } else {
            System.out.println("Le personnage a canné !");
            return false ;
        }
    }
    
    public void estAttaqué(int points) {
        this.HP -= points ;
    }
    
    public void attaquer(Personnage kiki){
        int X = this.Arme_en_main.toDamage();
        if (this.getClass() == Magicien.class) {
            if (this.Arme_en_main.getClass() == Baton.class){
                Arme_en_main = (Baton) Arme_en_main ;
                int A = X * ((Baton) this.Arme_en_main).age ;
                int B = A/2 ;
                if (((Magicien) this).Conf == true ){
                    
                    kiki.estAttaqué(B);
                } else {
                    kiki.estAttaqué(A);
                }
        }
        }else if (this.getClass() == Guerrier.class){
            if (this.Arme_en_main.getClass() == Epee.class){
                Arme_en_main = (Epee) Arme_en_main ;
                int C = X * ((Epee) this.Arme_en_main).finesse ;
                int D = C/2 ;
                if (((Guerrier) this).Cheval == true ){
                    kiki.estAttaqué(D);
                } else {
                    kiki.estAttaqué(C);
                }
        }
    }
        this.seFatiguer();
}
}
