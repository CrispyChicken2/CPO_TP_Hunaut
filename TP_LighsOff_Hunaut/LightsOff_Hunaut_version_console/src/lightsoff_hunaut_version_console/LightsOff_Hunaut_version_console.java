/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsoff_hunaut_version_console;

/**
 *
 * @author Asus
 */
public class LightsOff_Hunaut_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CelluleLumineuse Lampadaire = new CelluleLumineuse(false);
        CelluleLumineuse Decoration_de_Noel = new CelluleLumineuse(false);
        Decoration_de_Noel.getEtat();
        Lampadaire.getEtat();
        Lampadaire.activerCellule();
        Decoration_de_Noel.activerCellule();
        Decoration_de_Noel.getEtat();
        Lampadaire.getEtat();
    }
    
}
