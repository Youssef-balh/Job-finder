package com.projet.form;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.JOptionPane;
import com.projet.main.rekrute;
import com.projet.main.DatabaseConnection;
import com.projet.main.m_job;
import javax.swing.table.DefaultTableModel;
import com.projet.main.emploi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import com.projet.table.Test;

public class Scrapping extends javax.swing.JPanel {
    public Scrapping() {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        initComponents(); 
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel7 = new com.projet.swing.RoundPanel();
        imageAvatar3 = new com.projet.swing.ImageAvatar();
        imageAvatar4 = new com.projet.swing.ImageAvatar();
        jCheckBox3 = new javax.swing.JCheckBox();
        roundPanel8 = new com.projet.swing.RoundPanel();
        imageAvatar2 = new com.projet.swing.ImageAvatar();
        jCheckBox2 = new javax.swing.JCheckBox();
        roundPanel9 = new com.projet.swing.RoundPanel();
        imageAvatar1 = new com.projet.swing.ImageAvatar();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/joblogo.png"))); // NOI18N
        imageAvatar3.add(imageAvatar4);
        imageAvatar4.setBounds(0, 0, 0, 0);

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Emploi_ma");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        roundPanel7Layout.setVerticalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel7Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addGap(40, 40, 40))
                    .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/m_job.jpg"))); // NOI18N

        jCheckBox2.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("M_job.ma");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel8Layout = new javax.swing.GroupLayout(roundPanel8);
        roundPanel8.setLayout(roundPanel8Layout);
        roundPanel8Layout.setHorizontalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jCheckBox2)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        roundPanel8Layout.setVerticalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addGroup(roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jCheckBox2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel9.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/rekrute.jpg"))); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Rekrute.ma");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel9Layout = new javax.swing.GroupLayout(roundPanel9);
        roundPanel9.setLayout(roundPanel9Layout);
        roundPanel9Layout.setHorizontalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jCheckBox1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        roundPanel9Layout.setVerticalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(40, 40, 40))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start Scrapping");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Visualiser par Graphe");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Visualiser Tableau");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(roundPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        checkBox2Selected = jCheckBox1.isSelected();
        checkBox3Selected = jCheckBox2.isSelected();
        checkBox4Selected = jCheckBox3.isSelected();                
        if (!checkBox2Selected && !checkBox3Selected && !checkBox4Selected) {
            JOptionPane.showMessageDialog(this, "Please select at least one checkbox", "Error", JOptionPane.ERROR_MESSAGE);
            jButton1.setEnabled(true);  // Enable the button for retry
            return;  // Exit the method without enabling the components
        }
        jButton1.setEnabled(false); // Disable the button during scraping
        String websites = "";
       
        if (checkBox2Selected) {
            deselect();
            System.out.println("Rekrute scrapping started");
            rekrute scrap_rekrute = new rekrute();
            //scrap_rekrute.scrap_rekrute();
            websites += "Rekrute ";
        }
        if (checkBox4Selected) {            
            deselect();
            System.out.println("M_job scrapping started");
            m_job scrap_mjob = new m_job();
            //scrap_mjob.m_job_scrap();
            
            websites += "M Job ";

        }
        if (checkBox3Selected) {  
            deselect();
            System.out.println("Emploi scrapping started");
            emploi scrap_emploi = new emploi();
            //scrap_emploi.emploi_scrap();            
            websites += "Emploi ";

        }
        JOptionPane.showMessageDialog(this,"Scraping "+websites +"finished","Scraping process" , JOptionPane.INFORMATION_MESSAGE);

        enable_checkboxes();
        SwingUtilities.invokeLater(() -> {
            jButton1.setEnabled(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
    
        });

      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deselect() {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
    }
    private void enable_checkboxes() {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        checkBox2Selected = jCheckBox1.isSelected();
        checkBox3Selected = jCheckBox2.isSelected();
        checkBox4Selected = jCheckBox3.isSelected();
        
        Graphe graphe = new Graphe(checkBox2Selected,checkBox3Selected,checkBox4Selected);
        graphe.populateData(checkBox3Selected,checkBox4Selected,checkBox2Selected);
        graphe.fetch_DataAndPopulateChart(checkBox3Selected,checkBox4Selected,checkBox2Selected);
        graphe.fetchDataAndPopulateChart(checkBox3Selected,checkBox4Selected,checkBox2Selected);
        graphe.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

   
   
    private void unshow_schéma() {
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        unshow_schéma();
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
            Test test = new Test(checkBox2Selected,checkBox3Selected ,checkBox4Selected);
            test.setVisible(true);

            if (checkBox2Selected) {
                String rekrute_query = "SELECT * FROM rekrute_jobs";
                test.populateTableFromDatabase(rekrute_query, new String[]{"site", "post_name", "entreprise", "description", "competence", "experience", "region", "type_de_contrat", "secteur", "niveau_etude"});
            }
            if (checkBox3Selected) {     
                String m_job_query = "SELECT * FROM m_job";
                test.populateTableFromDatabase(m_job_query, new String[]{"sitename", "title", "company", "jobInfo", "location", "profession", "contractType", "sector", "experienceLevel", "educationLevel"});
            }
            if (checkBox4Selected) {
                String emploi_ma_query = "SELECT * FROM emploi_ma";
                test.populateTableFromDatabase(emploi_ma_query, new String[]{"sitename", "Postname", "Entreprise", "description", "Competence", "experience", "region", "Type_de_contrat", "secteur", "niveau_etude"});

            }
          }
        });
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private boolean checkBox4Selected;
    private boolean checkBox2Selected;
    private boolean checkBox3Selected;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.projet.swing.ImageAvatar imageAvatar1;
    private com.projet.swing.ImageAvatar imageAvatar2;
    private com.projet.swing.ImageAvatar imageAvatar3;
    private com.projet.swing.ImageAvatar imageAvatar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private com.projet.swing.RoundPanel roundPanel7;
    private com.projet.swing.RoundPanel roundPanel8;
    private com.projet.swing.RoundPanel roundPanel9;
    // End of variables declaration//GEN-END:variables
}
