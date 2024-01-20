package com.projet.table;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.main.DatabaseConnection;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Test2 extends javax.swing.JFrame {

    public Test2() {
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

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { // Single click
                    int selectedRow = table.getSelectedRow();

                    if (selectedRow != -1) {
                        System.out.println("Opening Info frame");
                        String sitename = (String) table.getValueAt(selectedRow, 0);
                        String url = (String) table.getValueAt(selectedRow, 5);
                        

                        
                        if (sitename.equals("rekrute.com")) {
                            Info info_offre = new Info(url);
                            info_offre.setVisible(true);
                        } else if (sitename.equals("Emploi.ma")) {
                            emploi_ma emploi = new emploi_ma(url);
                            emploi.setVisible(true);
                        } else if (sitename.equals("m-job.ma")) {
                            m_job job = new m_job(url);
                            job.setVisible(true);
                        }
                    }
                }
            }
        });
    }

    public void populateTableFromDatabase(String sqlQuery, String[] columnNames, String[] filterValues) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        try (Connection connection = DatabaseConnection.connectToDatabase(); PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

            // Set filter values as parameters in the prepared statement
            for (int i = 0; i < filterValues.length; i++) {
                preparedStatement.setString(i + 1, filterValues[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] rowData = new Object[columnNames.length];
                    for (int i = 0; i < columnNames.length; i++) {
                        rowData[i] = resultSet.getString(columnNames[i]);
                    }
                    model.addRow(rowData);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }

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
                "Site Name", "Post name", "Entreprise", "Competence", "Experience", "Postuler à"
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
