package com.projet.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.main.DatabaseConnection;
import com.projet.model.StatusType;
import com.projet.swing.ScrollBar;
import com.projet.table.Test;
import com.projet.table.Test1;
import com.projet.table.Test2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Job1 extends javax.swing.JPanel {

    public Job1() {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        initComponents();
        //setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table1.setVisible(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel3 = new com.projet.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.projet.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        roundPanel7 = new com.projet.swing.RoundPanel();
        imageAvatar3 = new com.projet.swing.ImageAvatar();
        imageAvatar4 = new com.projet.swing.ImageAvatar();
        jLabel7 = new javax.swing.JLabel();
        roundPanel8 = new com.projet.swing.RoundPanel();
        imageAvatar2 = new com.projet.swing.ImageAvatar();
        jLabel6 = new javax.swing.JLabel();
        roundPanel9 = new com.projet.swing.RoundPanel();
        imageAvatar1 = new com.projet.swing.ImageAvatar();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/joblogo.png"))); // NOI18N
        imageAvatar3.add(imageAvatar4);
        imageAvatar4.setBounds(0, 0, 0, 0);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(220, 220, 220));
        jLabel7.setText("Emploi.ma");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        roundPanel7Layout.setVerticalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/m_job.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 220, 220));
        jLabel6.setText("M_Job.ma");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout roundPanel8Layout = new javax.swing.GroupLayout(roundPanel8);
        roundPanel8.setLayout(roundPanel8Layout);
        roundPanel8Layout.setHorizontalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        roundPanel8Layout.setVerticalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel9.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projet/icon/rekrute.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("Rekrute.ma");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout roundPanel9Layout = new javax.swing.GroupLayout(roundPanel9);
        roundPanel9.setLayout(roundPanel9Layout);
        roundPanel9Layout.setHorizontalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        roundPanel9Layout.setVerticalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secteur", "Informatique", "Industrie", "Hotellerie", "Automobile", "Nettoyage", "Agriculture", "Education", "Centres d'appels", "Comptabilité", "Banque" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau d'étude", "Bac", "Bac+1", "Bac+2", "Bac+3", "Bac+4", "Bac+5" }));

        jComboBox4.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type de contract", "CDI", "CDD", "Intérim", "Freelance", "Stage", "Lettre" }));

        jComboBox5.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ville", "Rabat", "CasaBlanca", "Kenitra", "Tanger", "Marrakech", "Fes", "Agadir", "Mohammedia" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(roundPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(577, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Secteur = (String) jComboBox1.getSelectedItem();
        String Niveau = (String) jComboBox2.getSelectedItem();
        String Type = (String) jComboBox4.getSelectedItem();
        String Ville = (String) jComboBox5.getSelectedItem();
        String Niveau_rekrute = "";

        if (Niveau.equals("Bac")) {
            Niveau_rekrute = "Bac";
        } else if (Niveau.equals("Bac+1")) {
            Niveau_rekrute = "Bac +1";
        } else if (Niveau.equals("Bac+2")) {
            Niveau_rekrute = "Bac +2";
        } else if (Niveau.equals("Bac+3")) {
            Niveau_rekrute = "Bac +3";
        } else if (Niveau.equals("Bac+4")) {
            Niveau_rekrute = "Bac +4";
        } else if (Niveau.equals("Bac+5")) {
            Niveau_rekrute = "Bac +5";
        }
       
        if (Secteur.equals("Secteur")) {
            Secteur = "";
        }
        if (Type.equals("Type de contract")) {
            Type = "";
        }
        if (Niveau.equals("Niveau d'étude")) {
            Niveau = "";
        }
        if (Ville.equals("Ville")) {
            Ville = "";
        }

        final String finalSecteur = Secteur;
        final String finalNiveau = Niveau;
        final String finalType = Type;
        final String finalVille = Ville;
        final String finalNiveau_rekrute = Niveau_rekrute;
    if ((!Secteur.equals(""))) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Test2 test = new Test2();
                    test.setVisible(true);
                    //m_job
                    
                    String m_job_query = "SELECT * FROM m_job WHERE "
                            + "sector LIKE ? AND educationLevel LIKE ? AND contractType LIKE ? AND location LIKE ?";
                    String[] columnNamesMJob = {"sitename", "title", "company", "profession", "experienceLevel", "lien"};
                    String[] filterValuesMJob = {finalSecteur, finalNiveau, finalType, finalVille};
                    for (int i = 0; i < filterValuesMJob.length; i++) {
                        if (i == 1 && filterValuesMJob[i].equals("Bac")) {
                                filterValuesMJob[i] = "%" + filterValuesMJob[i]+"";
                            
                        } else {
                            filterValuesMJob[i] = "%" + filterValuesMJob[i] + "%";
                        }
                        
                    }
                    test.populateTableFromDatabase(m_job_query, columnNamesMJob, filterValuesMJob);

                    //Emploi 
                    String emploi_query = "SELECT * FROM emploi_ma WHERE "
                            + "secteur LIKE ? AND niveau_etude LIKE ? AND Type_de_contrat LIKE ? AND region LIKE ?";
                    String[] columnNamesEmploi = {"sitename", "Postname", "Entreprise", "Competence", "experience", "url"};
                    String[] filterValuesEmploi = {finalSecteur, finalNiveau, finalType, finalVille};
                    for (int i = 0; i < filterValuesEmploi.length; i++) {
                        if (i == 1 && filterValuesEmploi[i].equals("Bac")){
                            filterValuesEmploi[i] = "%" + filterValuesEmploi[i] + "";
                        } else {
                            filterValuesEmploi[i] = "%" + filterValuesEmploi[i] + "%";
                        }
                    }
                    test.populateTableFromDatabase(emploi_query, columnNamesEmploi, filterValuesEmploi);

                    //Rekrute
                    String rekrute_query = "SELECT * FROM rekrute_jobs WHERE "
                            + "secteur LIKE ? AND niveau_etude LIKE ? AND type_de_contrat LIKE ? AND region LIKE ?";
                    String[] columnNamesRekrute = {"site", "post_name", "entreprise", "competence", "experience", "url"};
                    String[] filterValuesRekrute = {finalSecteur, finalNiveau_rekrute, finalType, finalVille};
                    for (int i = 0; i < filterValuesRekrute.length; i++) {
                        if (i == 1 && filterValuesRekrute[i].equals("Bac")) {
                            filterValuesRekrute[i] = "%" + filterValuesRekrute[i] + "";
                        } else {
                            filterValuesRekrute[i] = "%" + filterValuesRekrute[i] + "%";
                        }
                    }
                    test.populateTableFromDatabase(rekrute_query, columnNamesRekrute, filterValuesRekrute);

                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez devez selectionnez Secteur au minimum!!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.projet.swing.ImageAvatar imageAvatar1;
    private com.projet.swing.ImageAvatar imageAvatar2;
    private com.projet.swing.ImageAvatar imageAvatar3;
    private com.projet.swing.ImageAvatar imageAvatar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.projet.swing.RoundPanel roundPanel3;
    private com.projet.swing.RoundPanel roundPanel7;
    private com.projet.swing.RoundPanel roundPanel8;
    private com.projet.swing.RoundPanel roundPanel9;
    private com.projet.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
