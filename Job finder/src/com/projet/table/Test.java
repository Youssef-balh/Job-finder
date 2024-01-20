package com.projet.table;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.main.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Test extends javax.swing.JFrame {
    
    boolean check1 ;
    boolean check2 ;
    boolean check3 ;
    public Test(boolean check1 ,boolean check2 ,boolean check3 ) {
        initComponents();
        this.check1=check1;
        this.check2=check2;
        this.check3=check3;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table.setDefaultRenderer(Object.class, new TableGradientCell());
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
    
    }

    
    public void populateTableFromDatabase(String sqlQuery, String[] columnNames) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        //model.setRowCount(0); 

        try (Connection connection = DatabaseConnection.connectToDatabase();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Object[] rowData = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    rowData[i] = resultSet.getString(columnNames[i]);
                }
                model.addRow(rowData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
    
public static void removeRowsWithNullAndEmptyValues_mjob() {
        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            String query = "DELETE FROM m_job WHERE "
                    + "(title IS NULL OR title = '' OR titleoffer IS NULL OR titleoffer = '' OR "
                    + "location IS NULL OR location = '' OR company IS NULL OR company = '' OR "
                    + "contractType IS NULL OR contractType = '' OR salary IS NULL OR salary = '' OR "
                    + "recruiterInfo IS NULL OR recruiterInfo = '' OR jobInfo IS NULL OR jobInfo = '' OR "
                    + "profileInfo IS NULL OR profileInfo = '' OR sector IS NULL OR sector = '' OR "
                    + "profession IS NULL OR profession = '' OR experienceLevel IS NULL OR experienceLevel = '' OR "
                    + "educationLevel IS NULL OR educationLevel = '' OR languageRequired IS NULL OR languageRequired = '' OR "
                    + "lien IS NULL OR lien = '')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows with null or empty values removed from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
}
}

public static void removeRowsWithNullAndEmptyValues_rekrute() {
        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            String query = "DELETE FROM rekrute_jobs WHERE "
                    + "(site IS NULL OR site = '' OR post_name IS NULL OR post_name = '' OR "
                    + "date_de_publication IS NULL OR date_de_publication = '' OR type_de_contrat IS NULL OR type_de_contrat = '' OR "
                    + "experience IS NULL OR experience = '' OR region IS NULL OR region = '' OR "
                    + "niveau_etude IS NULL OR niveau_etude = '' OR competence IS NULL OR competence = '' OR "
                    + "entreprise IS NULL OR entreprise= '' OR secteur IS NULL OR secteur = '' OR "
                    + "date_post_max IS NULL OR date_post_max = '' OR description IS NULL OR description = '' OR "
                    + "profil_recherche IS NULL OR profil_recherche = '')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows with null or empty values removed from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

public static void removeRowsWithNullAndEmptyValues_emploi() {
        try (Connection connection = DatabaseConnection.connectToDatabase();) {
            String query = "DELETE FROM emploi_ma WHERE "
                    + "(sitename IS NULL OR sitename = '' OR Postname IS NULL OR Postname = '' OR "
                    + "description IS NULL OR description = '' OR DateDePublication IS NULL OR DateDePublication = '' OR "
                    + "Entreprise IS NULL OR Entreprise = '' OR EntrepriseDes IS NULL OR EntrepriseDes = '' OR "
                    + "region IS NULL OR region = '' OR Competence IS NULL OR Competence = '' OR "
                    + "Type_de_contrat IS NULL OR Type_de_contrat = '' OR secteur IS NULL OR secteur = '' OR "
                    + "experience IS NULL OR experience = '' OR niveau_etude IS NULL OR niveau_etude = '' OR "
                    + "langue IS NULL OR langue = '' OR nombre_de_poste IS NULL OR nombre_de_poste = '' OR "
                    + "url IS NULL OR url = '')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows with null or empty values removed from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Site Name", "Post name", "Entreprise", "Description", "Competence", "Experience", "Region", "Contrat", "Secteur", "Niveau etude"
            }
        ));
        scroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jPanel1.add(scroll, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Pre-processing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              String websites = "";
              Test1 test = new Test1();
              
             if(check1){
                 websites += "Rekrute ";
                 removeRowsWithNullAndEmptyValues_rekrute();
                  String rekrute_query = "SELECT * FROM rekrute_jobs";
                test.populateTableFromDatabase(rekrute_query, new String[]{"site", "post_name", "entreprise", "description", "competence", "experience", "region", "type_de_contrat", "secteur", "niveau_etude"});
             }
            if(check2){
                websites += "M_job ";
                removeRowsWithNullAndEmptyValues_mjob();
                String m_job_query = "SELECT * FROM m_job";
                test.populateTableFromDatabase(m_job_query, new String[]{"sitename", "title", "company", "jobInfo", "location", "profession", "contractType", "sector", "experienceLevel", "educationLevel"});
            }
            if(check3){
                websites += "Emploi_ma ";
                removeRowsWithNullAndEmptyValues_emploi();
                String emploi_ma_query = "SELECT * FROM emploi_ma";
                test.populateTableFromDatabase(emploi_ma_query, new String[]{"sitename", "Postname", "Entreprise", "description", "Competence", "experience", "region", "Type_de_contrat", "secteur", "niveau_etude"});
            }
            JOptionPane.showMessageDialog(null,"Pre-processing "+websites +"finished"," Pre-process" , JOptionPane.INFORMATION_MESSAGE);
            test.setVisible(true);
            setVisible(false);
            

         
          }
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
