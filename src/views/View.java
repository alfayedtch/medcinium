package views;

import controllers.UserController;
import core.App;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.Model;
import models.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saadel
 */
public class View extends javax.swing.JFrame {

    // this model contains all necessary data to display the view
    private Model model; 
        
    /**
     * Creates new form View
     */
    public View(Model model, User loggedInUser) {
        
        this.model = model;
        
        initComponents();
        this.welcomeNameLabel.setText(loggedInUser.getUsername());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        rightPanel.add(new AccueilPanel());
        rightPanel.repaint();
        rightPanel.revalidate();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        settingsLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        accueilLabel = new javax.swing.JLabel();
        patientsLabel = new javax.swing.JLabel();
        consultationsLabel = new javax.swing.JLabel();
        statistiquesLabel = new javax.swing.JLabel();
        paiementsLabel = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        welcomeNameLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 0, 51));

        settingsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsLabelMouseClicked(evt);
            }
        });

        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        accueilLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accueilLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accueilLabelMouseClicked(evt);
            }
        });

        patientsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientsLabelMouseClicked(evt);
            }
        });

        consultationsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultationsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultationsLabelMouseClicked(evt);
            }
        });

        statistiquesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statistiquesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statistiquesLabelMouseClicked(evt);
            }
        });

        paiementsLabel.setForeground(new java.awt.Color(255, 255, 255));
        paiementsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paiementsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paiementsLabelMouseClicked(evt);
            }
        });

        rightPanel.setBackground(new java.awt.Color(241, 241, 241));
        rightPanel.setLayout(new java.awt.CardLayout());

        welcomeNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        welcomeNameLabel.setText("Admin");

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/accueil.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accueilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paiementsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultationsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statistiquesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(welcomeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(accueilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statistiquesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paiementsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeNameLabel)
                            .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accueilLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accueilLabelMouseClicked
        
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/accueil.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        model.load();
        rightPanel.add(new AccueilPanel());
        rightPanel.repaint();
        rightPanel.revalidate();
    }//GEN-LAST:event_accueilLabelMouseClicked

    private void patientsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsLabelMouseClicked
        
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/patients.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        rightPanel.add(new PatientPanel());
        rightPanel.repaint();
        rightPanel.revalidate();
    }//GEN-LAST:event_patientsLabelMouseClicked

    private void consultationsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultationsLabelMouseClicked
        
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/consultations.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        rightPanel.add(new ConsultationPanel());
        rightPanel.repaint();
        rightPanel.revalidate();        
    }//GEN-LAST:event_consultationsLabelMouseClicked

    private void statistiquesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statistiquesLabelMouseClicked
        
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/statistiques.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        rightPanel.add(new StatisticsPanel());
        rightPanel.repaint();
        rightPanel.revalidate();  
    }//GEN-LAST:event_statistiquesLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        setVisible(false);
        this.dispose();
        database.Database.getInstance().disconnect();        
        App.runApp();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void paiementsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paiementsLabelMouseClicked
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/paiements.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        rightPanel.add(new PaymentPanel());
        rightPanel.repaint();
        rightPanel.revalidate(); 
    }//GEN-LAST:event_paiementsLabelMouseClicked

    private void settingsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseClicked
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png")));
        // removing panel
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        // adding panels
        rightPanel.add(new DBInsertPanel());
        rightPanel.repaint();
        rightPanel.revalidate(); 
    }//GEN-LAST:event_settingsLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accueilLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel consultationsLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel paiementsLabel;
    private javax.swing.JLabel patientsLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel statistiquesLabel;
    private javax.swing.JLabel welcomeNameLabel;
    // End of variables declaration//GEN-END:variables
}
