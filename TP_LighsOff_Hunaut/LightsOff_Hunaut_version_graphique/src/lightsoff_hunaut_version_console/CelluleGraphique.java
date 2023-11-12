/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_hunaut_version_console;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Asus
 */
public class CelluleGraphique extends JButton{
    
    CelluleLumineuse CelluleLumineuseAssociee;
    int largeur ;
    int longueur ;
    
    public CelluleGraphique (CelluleLumineuse celluleAssociée , int Largeur , int Longueur ){
        CelluleLumineuseAssociee = celluleAssociée ;
        largeur = Largeur ;
        longueur = Longueur;
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 20, 20);
        g.setColor(Color.darkGray);
        g.fillRect(20, 20, 20, 20);
        super.paintComponent(g);
        this.setText(CelluleLumineuseAssociee.toString());
 }
}
