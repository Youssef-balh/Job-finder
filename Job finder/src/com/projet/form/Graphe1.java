package com.projet.form;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.main.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Color;
import com.projet.chart.ModelChart;
import com.projet.chart.chart_model;
import java.sql.Connection;

public class Graphe1 extends javax.swing.JFrame {

    public Graphe1() {
        initComponents();
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        getContentPane().setBackground(new Color(51, 40, 69));
        chart.addLegend("Bac", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Bac +1", new Color(67, 189, 135), new Color(0, 255, 0));
        chart.addLegend("Bac +2", new Color(135, 189, 245), new Color(30, 144, 255));
        chart.addLegend("Bac +3", new Color(189, 135, 245), new Color(138, 43, 226));
        chart.addLegend("Bac +4", new Color(245, 189, 135), new Color(255, 140, 0));
        chart.addLegend("Bac +5 et plus", new Color(245, 189, 135), new Color(255, 69, 0));
        chart.addLegend("Qualification avant Bac", new Color(189, 135, 245), new Color(148, 0, 211));
        
        
        chart2.addLegend("CDI", new Color(67, 189, 135), new Color(0, 255, 0));
        chart2.addLegend("CDD", new Color(135, 189, 245), new Color(30, 144, 255));
        chart2.addLegend("Lettere", new Color(189, 135, 245), new Color(138, 43, 226));
        chart2.addLegend("Others", new Color(245, 189, 135), new Color(255, 140, 0));
        // Execute only SQL1
        chart3.addLegend("Ingénieur", new Color(12, 84, 175), new Color(0, 108, 247));
        chart3.addLegend("Technicien", new Color(54, 4, 143), new Color(104, 49, 200));
        chart3.addLegend("Gestionnaire", new Color(5, 125, 0), new Color(95, 209, 69));
        chart3.addLegend("Manager", new Color(186, 37, 37), new Color(241, 100, 120));
        chart3.addLegend("Comptable", new Color(255, 104, 51), new Color(217, 84, 37));
        chart3.addLegend("Gestionnaire", new Color(243, 255, 51), new Color(243, 255, 51));
        chart3.addLegend("Others", new Color(178, 255, 51), new Color(179, 187, 46));
       
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    void populateData(boolean m_job, boolean emploi_ma, boolean rekrute_jobs) {
        chart.clear();

        // Établir la connexion à la base de données
        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            // Requête SQL pour extraire des données
            String sql = "SELECT niveau_etude, COUNT(*) AS total FROM emploi_ma GROUP BY niveau_etude";
            String sql1 = "SELECT educationLevel, COUNT(*) AS total FROM m_job GROUP BY educationLevel";
            String sql2 = "SELECT niveau_etude, COUNT(*) AS total FROM rekrute_jobs GROUP BY niveau_etude";

            // Add legends only once
            if (emploi_ma) {
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        int countBac = 0;
                        int countBac1 = 0;
                        int countBac2 = 0;
                        int countBac3 = 0;
                        int countBac4 = 0;
                        int countBac5Plus = 0;
                        int countNivBacEtMoins = 0;

                        while (resultSet.next()) {
                            String niveauEtude = resultSet.getString("niveau_etude");
                            int totalCount = resultSet.getInt("total");

                            if (niveauEtude.matches(".*\\bBac\\b(?!\\+).*")) {
                                countBac += totalCount;
                            }
                            if (niveauEtude.contains("Bac+1")) {
                                countBac1 += totalCount;
                            }
                            if (niveauEtude.contains("Bac+2")) {
                                countBac2 += totalCount;
                            }
                            if (niveauEtude.contains("Bac+3")) {
                                countBac3 += totalCount;
                            }
                            if (niveauEtude.contains("Bac+4")) {
                                countBac4 += totalCount;
                            }
                            if (niveauEtude.contains("Bac+5")) {
                                countBac5Plus += totalCount;
                            }
                            if (niveauEtude.contains("Qualification avant bac")) {
                                countNivBacEtMoins += totalCount;
                            }
                            // Update counts based on niveau_etude
                        }

                        chart.addData(new ModelChart("Emploi.ma", new double[]{countBac, countBac1, countBac2, countBac3, countBac4, countBac5Plus, countNivBacEtMoins}));
                    }
                }
            }
            if (m_job) {
                try (PreparedStatement statement = connection.prepareStatement(sql1)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        int countBac = 0;
                        int countBac1 = 0;
                        int countBac2 = 0;
                        int countBac3 = 0;
                        int countBac4 = 0;
                        int countBac5Plus = 0;
                        int countNivBacEtMoins = 0;

                        while (resultSet.next()) {
                            String niveauEtude = resultSet.getString("educationLevel");
                            int totalCount = resultSet.getInt("total");
                            System.out.println(niveauEtude);
                            if (niveauEtude.matches(".*\\bBAC\\b(?!\\+).*")) {
                                countBac += totalCount;
                            }
                            if (niveauEtude.contains("BAC+1")) {
                                countBac1 += totalCount;
                            }
                            if (niveauEtude.contains("BAC+2")) {
                                countBac2 += totalCount;
                            }
                            if (niveauEtude.contains("BAC+3")) {
                                countBac3 += totalCount;
                            }
                            if (niveauEtude.contains("BAC+4")) {
                                countBac4 += totalCount;
                            }
                            if (niveauEtude.contains("BAC+5")) {
                                countBac5Plus += totalCount;
                            }
                            if (niveauEtude.contains("NIV BAC ET MOINS")) {
                                countNivBacEtMoins += totalCount;
                            }
                        }

                        // Add data to the chart based on the boolean parameter
                        chart.addData(new ModelChart("M_job", new double[]{countBac, countBac1, countBac2, countBac3, countBac4, countBac5Plus, countNivBacEtMoins}));
                    }
                }
            }
            if (rekrute_jobs) {
                try (PreparedStatement statement = connection.prepareStatement(sql2)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        int countBac = 0;
                        int countBac1 = 0;
                        int countBac2 = 0;
                        int countBac3 = 0;
                        int countBac4 = 0;
                        int countBac5Plus = 0;
                        int countMoinsBac = 0;

                        while (resultSet.next()) {
                            String niveauEtude = resultSet.getString("niveau_etude");
                            int totalCount = resultSet.getInt("total");

                            if (niveauEtude.contains("Bac Minimum")) {
                                countBac += totalCount;
                            }
                            if (niveauEtude.contains("Bac +1")) {
                                countBac1 += totalCount;
                            }
                            if (niveauEtude.contains("Bac +2")) {
                                countBac2 += totalCount;
                            }
                            if (niveauEtude.contains("Bac +3")) {
                                countBac3 += totalCount;
                            }
                            if (niveauEtude.contains("Bac +4")) {
                                countBac4 += totalCount;
                            }
                            if (niveauEtude.contains("Bac +5")) {
                                countBac5Plus += totalCount;
                            }
                            if (niveauEtude.contains("Autodidacte Minimum")) {
                                countMoinsBac += totalCount;
                            }

                        }

                        // Add data to the chart based on the boolean parameter
                        chart.addData(new ModelChart("Rekrute", new double[]{countBac, countBac1, countBac2, countBac3, countBac4, countBac5Plus, countMoinsBac}));

                    }
                }
            }

            // Display the combined chart
            chart.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fetchDataAndPopulateChart(boolean executeSql1, boolean executeSql2, boolean executeSql3) {
       chart2.clear();
       
        int cdiCount = 0, cddCount = 0, lettreCount = 0, other = 0;

        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            if (executeSql1) {
                String sql1 = "SELECT contractType FROM m_job";
                try (PreparedStatement statement = connection.prepareStatement(sql1)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("contractType");

                            if (contractType.contains("CDI")) {
                                cdiCount++;
                            } else if (contractType.contains("CDD")) {
                                cddCount++;
                            } else if (contractType.contains("Lettre")) {
                                lettreCount++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql1
                     chart2.addData(new ModelChart("M_job", new double[]{cdiCount, cddCount, lettreCount, other}));
                    }
                }

                // Reset counts for the next query
                cdiCount = 0;
                cddCount = 0;
                lettreCount = 0;
                other = 0;
            }

            if (executeSql2) {
                String sql2 = "SELECT Type_de_contrat FROM emploi_ma";
                try (PreparedStatement statement = connection.prepareStatement(sql2)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("Type_de_contrat");

                            if (contractType.contains("CDI")) {
                                cdiCount++;
                            } else if (contractType.contains("CDD")) {
                                cddCount++;
                            } else if (contractType.contains("Lettre")) {
                                lettreCount++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql2
                        chart2.addData(new ModelChart("Emploi.ma", new double[]{cdiCount, cddCount, lettreCount, other}));
                    }
                }

                // Reset counts for the next query
                cdiCount = 0;
                cddCount = 0;
                lettreCount = 0;
                other = 0;
            }

            if (executeSql3) {
                String sql3 = "SELECT type_de_contrat FROM rekrute_jobs";
                try (PreparedStatement statement = connection.prepareStatement(sql3)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("type_de_contrat");

                            if (contractType.contains("CDI")) {
                                cdiCount++;
                            } else if (contractType.contains("CDD")) {
                                cddCount++;
                            } else if (contractType.contains("Lettre")) {
                                lettreCount++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql3
                        chart2.addData(new ModelChart("Rekrute", new double[]{cdiCount, cddCount, lettreCount, other}));
                    }
                }
            }

          chart2.start();
        } catch (Exception e) {
            e.printStackTrace();
        
    
}
}
    
    void fetch_DataAndPopulateChart(boolean executeSql1, boolean executeSql2, boolean executeSql3) {
        chart3.clear();
        int Ing = 0, Tech = 0, Cons = 0, Man = 0, Comp = 0, Gest = 0, other = 0;

        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            if (executeSql1) {
                String sql1 = "SELECT titleoffer FROM m_job";
                try (PreparedStatement statement = connection.prepareStatement(sql1)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("titleoffer");

                            if (contractType.contains("Ingénieur")) {
                                Ing++;
                            } else if (contractType.contains("Technicien")) {
                                Tech++;
                            } else if (contractType.contains("Conseiller")) {
                                Cons++;
                            } else if (contractType.contains("Manager")) {
                                Man++;
                            } else if (contractType.contains("Comptable")) {
                                Comp++;
                            } else if (contractType.contains("Gestionnaire")) {
                                Gest++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql1
                        chart3.addData(new ModelChart("M_job", new double[]{Ing, Tech, Cons, Man, Comp, Gest, other}));
                    }
                }

                // Reset counts for the next query
                Ing = 0;
                Tech = 0;
                Cons = 0;
                Man = 0;
                Comp = 0;
                Gest = 0;
                other = 0;
            }

            if (executeSql2) {
                String sql2 = "SELECT Postname FROM emploi_ma";
                try (PreparedStatement statement = connection.prepareStatement(sql2)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("Postname");

                            if (contractType.contains("Ingénieur")) {
                                Ing++;
                            } else if (contractType.contains("Technicien")) {
                                Tech++;
                            } else if (contractType.contains("Conseiller")) {
                                Cons++;
                            } else if (contractType.contains("Manager")) {
                                Man++;
                            } else if (contractType.contains("Comptable")) {
                                Comp++;
                            } else if (contractType.contains("Gestionnaire")) {
                                Gest++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql2
                        chart3.addData(new ModelChart("Emploi.ma", new double[]{Ing, Tech, Cons, Man, Comp, Gest, other}));
                    }
                }

                // Reset counts for the next query
                Ing = 0;
                Tech = 0;
                Cons = 0;
                Man = 0;
                Comp = 0;
                Gest = 0;
                other = 0;
            }

            if (executeSql3) {
                String sql3 = "SELECT post_name FROM rekrute_jobs";
                try (PreparedStatement statement = connection.prepareStatement(sql3)) {
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            String contractType = resultSet.getString("post_name");

                            if (contractType.contains("Ingénieur")) {
                                Ing++;
                            } else if (contractType.contains("Technicien")) {
                                Tech++;
                            } else if (contractType.contains("Conseiller")) {
                                Cons++;
                            } else if (contractType.contains("Manager")) {
                                Man++;
                            } else if (contractType.contains("Comptable")) {
                                Comp++;
                            } else if (contractType.contains("Gestionnaire")) {
                               Gest++;
                            } else {
                                other++;
                            }
                        }
                        // Create a single ModelChart instance after fetching the data from sql3
                        chart3.addData(new ModelChart("Rekrute", new double[]{Ing, Tech, Cons, Man, Comp, Gest, other}));
                    }
                }
            }
            chart3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new com.projet.chart.Chart();
        chart2 = new com.projet.chart.Chart();
        chart3 = new com.projet.chart.Chart();
        titleBar11 = new com.projet.swing.titlebar.TitleBar1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        chart.setBackground(new java.awt.Color(51, 51, 51));

        titleBar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleBar11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleBar11MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chart3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chart2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(chart2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(chart3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleBar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBar11MouseClicked
        dispose();
    }//GEN-LAST:event_titleBar11MouseClicked

    private void titleBar11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBar11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_titleBar11MouseEntered

    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.projet.chart.Chart chart;
    private com.projet.chart.Chart chart2;
    private com.projet.chart.Chart chart3;
    private com.projet.swing.titlebar.TitleBar1 titleBar11;
    // End of variables declaration//GEN-END:variables
}
