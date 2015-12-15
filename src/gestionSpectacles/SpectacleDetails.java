package gestionSpectacles;

import classesMetier.Spectacle;
import classesMetier.Intermittent;
import nezdames.serialisation.NezDamesSerialisation;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author gaellecastel
 */
public class SpectacleDetails extends javax.swing.JFrame {

    private ArrayList<Intermittent> liste;

    DefaultListModel modele = new DefaultListModel();

    public SpectacleDetails(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //chargement des éléments de la fiche de cet intermittent
        txtNumeroObjet.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getNumeroObjet())));
        txtTitre.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getTitre())));
        txtDuree.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getDuree())));
        txtAnneeCreation.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getAnneeCreation())));
        txtPrixVenteTheorique.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getPrixVenteTheorique())));
        txtFichierContraintesTechniques.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getFichierContraintesTechniques())));
        txtFichierSynopsis.setText(String.valueOf((((Spectacle) NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee)).getFichierSynopsis())));
        
        //chargement de la liste des intermittents de ce spectacle               
        liste = new ArrayList<Intermittent>();
        liste.addAll(NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee).getLesIntermittents());
        jListIntermittents.removeAll();
        DefaultListModel modele = new DefaultListModel();
        for (Intermittent unIntermittent : liste) {
            modele.addElement(unIntermittent.getNomIntermittent() + " " + unIntermittent.getPrenomIntermittent());
        }
        jListIntermittents.setModel(modele);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitre1 = new javax.swing.JLabel();
        txtPrixVenteTheorique = new javax.swing.JTextField();
        btnFermer = new javax.swing.JButton();
        lblNumeroObjet = new javax.swing.JLabel();
        lblPrixVenteTheorique = new javax.swing.JLabel();
        lblFichierContraintesTechniques = new javax.swing.JLabel();
        txtTitre = new javax.swing.JTextField();
        lblTitre = new javax.swing.JLabel();
        lblAnneeCreation = new javax.swing.JLabel();
        txtAnneeCreation = new javax.swing.JTextField();
        txtFichierContraintesTechniques = new javax.swing.JTextField();
        txtNumeroObjet = new javax.swing.JTextField();
        lblFichierSynopsis = new javax.swing.JLabel();
        txtFichierSynopsis = new javax.swing.JTextField();
        txtDuree = new javax.swing.JTextField();
        lblDuree = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListIntermittents = new javax.swing.JList();
        lblListeDroite = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(204, 51, 0));
        lblTitre1.setText("DÉTAILS SUR UN SPECTACLE");

        txtPrixVenteTheorique.setEditable(false);
        txtPrixVenteTheorique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrixVenteTheoriqueActionPerformed(evt);
            }
        });

        btnFermer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        lblNumeroObjet.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNumeroObjet.setForeground(new java.awt.Color(204, 51, 0));
        lblNumeroObjet.setText("Numéro d'objet");

        lblPrixVenteTheorique.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblPrixVenteTheorique.setForeground(new java.awt.Color(204, 51, 0));
        lblPrixVenteTheorique.setText("Prix de vente théorique");

        lblFichierContraintesTechniques.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblFichierContraintesTechniques.setForeground(new java.awt.Color(204, 51, 0));
        lblFichierContraintesTechniques.setText("Fichier contraintes techniques");

        txtTitre.setEditable(false);
        txtTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitreActionPerformed(evt);
            }
        });

        lblTitre.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(204, 51, 0));
        lblTitre.setText("Titre");

        lblAnneeCreation.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblAnneeCreation.setForeground(new java.awt.Color(204, 51, 0));
        lblAnneeCreation.setText("Année création");

        txtAnneeCreation.setEditable(false);
        txtAnneeCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnneeCreationActionPerformed(evt);
            }
        });

        txtFichierContraintesTechniques.setEditable(false);
        txtFichierContraintesTechniques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFichierContraintesTechniquesActionPerformed(evt);
            }
        });

        txtNumeroObjet.setEditable(false);
        txtNumeroObjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroObjetActionPerformed(evt);
            }
        });

        lblFichierSynopsis.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblFichierSynopsis.setForeground(new java.awt.Color(204, 51, 0));
        lblFichierSynopsis.setText("Fichier synopsis");

        txtFichierSynopsis.setEditable(false);
        txtFichierSynopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFichierSynopsisActionPerformed(evt);
            }
        });

        txtDuree.setEditable(false);

        lblDuree.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblDuree.setForeground(new java.awt.Color(204, 51, 0));
        lblDuree.setText("Durée du spectacle (mn)");

        jListIntermittents.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListIntermittents);

        lblListeDroite.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblListeDroite.setForeground(new java.awt.Color(204, 51, 0));
        lblListeDroite.setText("Intermittents participant à ce spectacle");

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)
                        .addGap(155, 155, 155)
                        .addComponent(lblTitre1)
                        .addGap(72, 72, 72)
                        .addComponent(lblImageOlivier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnFermer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFichierContraintesTechniques)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFichierContraintesTechniques, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFichierSynopsis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFichierSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitre)
                                    .addComponent(lblNumeroObjet)
                                    .addComponent(lblDuree))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDuree, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(lblAnneeCreation)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAnneeCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblPrixVenteTheorique))
                                            .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrixVenteTheorique, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNumeroObjet, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(192, 192, 192))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListeDroite)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitre1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImageManu)
                            .addComponent(lblImageOlivier))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroObjet)
                    .addComponent(txtNumeroObjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitre)
                    .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuree)
                    .addComponent(txtDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnneeCreation)
                    .addComponent(txtAnneeCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrixVenteTheorique)
                    .addComponent(txtPrixVenteTheorique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFichierContraintesTechniques, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFichierContraintesTechniques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichierSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFichierSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblListeDroite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFermer)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(744, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void txtTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitreActionPerformed

    private void txtAnneeCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnneeCreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnneeCreationActionPerformed

    private void txtFichierContraintesTechniquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFichierContraintesTechniquesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFichierContraintesTechniquesActionPerformed

    private void txtFichierSynopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFichierSynopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFichierSynopsisActionPerformed

    private void txtPrixVenteTheoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrixVenteTheoriqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrixVenteTheoriqueActionPerformed

    private void txtNumeroObjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroObjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroObjetActionPerformed

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
            java.util.logging.Logger.getLogger(SpectacleDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpectacleDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpectacleDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpectacleDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpectacleDetails().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JList jListIntermittents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnneeCreation;
    private javax.swing.JLabel lblDuree;
    private javax.swing.JLabel lblFichierContraintesTechniques;
    private javax.swing.JLabel lblFichierSynopsis;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblListeDroite;
    private javax.swing.JLabel lblNumeroObjet;
    private javax.swing.JLabel lblPrixVenteTheorique;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JTextField txtAnneeCreation;
    private javax.swing.JTextField txtDuree;
    private javax.swing.JTextField txtFichierContraintesTechniques;
    private javax.swing.JTextField txtFichierSynopsis;
    private javax.swing.JTextField txtNumeroObjet;
    private javax.swing.JTextField txtPrixVenteTheorique;
    private javax.swing.JTextField txtTitre;
    // End of variables declaration//GEN-END:variables
}