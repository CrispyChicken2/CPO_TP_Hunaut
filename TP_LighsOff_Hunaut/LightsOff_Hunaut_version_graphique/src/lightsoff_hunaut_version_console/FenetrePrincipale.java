/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightsoff_hunaut_version_console;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Asus
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    
    GrilleDeCellules grille;
    int nbCoups = 0;
    int i,k ;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        BtnQuitter2.setVisible(false);
        
        
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                this.initialiserPartie();
                }
            }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60,nbColonnes*40, nbLignes*40));
        this.pack();
        this.revalidate();
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        
        // création du panneau de boutons verticaux (pour les lignes)
        for  (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
            final int j = i;
            @Override
            public void actionPerformed(ActionEvent e) {
                 grille.activerLigneDeCellules(j);
                repaint();
                finDePartie(nbCoups);
                }
            };
        bouton_ligne.addActionListener(ecouteurClick);
         PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, nbColonnes* 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontaux (pour les colonnes)
        for  (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener EcouteurClick = new ActionListener() {
            final int j = i;
            @Override
            public void actionPerformed(ActionEvent e) {
                 grille.activerColonneDeCellules(j);
                repaint();
                finDePartie(nbCoups);
                }
            };
        bouton_colonne.addActionListener(EcouteurClick);
        PanneauBoutonsHorizontaux.add(bouton_colonne);
        }
        PanneauBoutonDiagDesc.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonDiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        for  (i = 0; i < 1; i++) {
        JButton bouton_diagdesc = new JButton();
            ActionListener EcouteurClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            grille.activerDiagonaleDescendante();
            repaint();
            finDePartie(nbCoups);
            }
            };  
        bouton_diagdesc.addActionListener(EcouteurClick);
        PanneauBoutonDiagDesc.add(bouton_diagdesc);            
    }
        PanneauBoutonDiagMont.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonDiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(70+nbColonnes*40, 10, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        for  (i = 0; i < 1; i++) {
        JButton bouton_diagmont = new JButton();
            ActionListener EcouteurClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            grille.activerDiagonaleMontante();
            repaint();
            finDePartie(nbCoups);
            }
            };  
        bouton_diagmont.addActionListener(EcouteurClick);
        PanneauBoutonDiagMont.add(bouton_diagmont);            
    }
    }
                    
    
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        
        grille.melangerMatriceAleatoirement(10);
    }

    public void finDePartie(int nbCoups){
            if (grille.cellulesToutesEteintes()==true){
                nbCoups+=1;
                this.PanneauBoutonDiagDesc.setVisible(false);
                this.PanneauBoutonsVerticaux.setVisible(false);
                this.PanneauBoutonsHorizontaux.setVisible(false);
                this.PanneauBoutonDiagMont.setVisible(false);
                FenetreVictoire Bravo = new FenetreVictoire();
                Bravo.setVisible(true);
                BtnQuitter2.setVisible(true);
            } else {
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        PanneauBoutonDiagDesc = new javax.swing.JPanel();
        PanneauBoutonDiagMont = new javax.swing.JPanel();
        BtnQuitter2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 380, 380));
        PanneauGrille.getAccessibleContext().setAccessibleName("");

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 380));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 380, 80));

        PanneauBoutonDiagDesc.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout PanneauBoutonDiagDescLayout = new javax.swing.GroupLayout(PanneauBoutonDiagDesc);
        PanneauBoutonDiagDesc.setLayout(PanneauBoutonDiagDescLayout);
        PanneauBoutonDiagDescLayout.setHorizontalGroup(
            PanneauBoutonDiagDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonDiagDescLayout.setVerticalGroup(
            PanneauBoutonDiagDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        PanneauBoutonDiagMont.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout PanneauBoutonDiagMontLayout = new javax.swing.GroupLayout(PanneauBoutonDiagMont);
        PanneauBoutonDiagMont.setLayout(PanneauBoutonDiagMontLayout);
        PanneauBoutonDiagMontLayout.setHorizontalGroup(
            PanneauBoutonDiagMontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonDiagMontLayout.setVerticalGroup(
            PanneauBoutonDiagMontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        BtnQuitter2.setText("Quitter");
        BtnQuitter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitter2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnQuitter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        getAccessibleContext().setAccessibleName("frame1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnQuitter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitter2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnQuitter2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnQuitter2;
    private javax.swing.JPanel PanneauBoutonDiagDesc;
    private javax.swing.JPanel PanneauBoutonDiagMont;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables
}
