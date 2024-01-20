package com.projet.table;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.main.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Test1 extends javax.swing.JFrame {

    public Test1() {
        initComponents();
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
    
public static void removeRowsWithNullAndEmptyValues() {
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

  private void unshow_schéma() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
