package com.projet.form;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.projet.chart.ModelChart;
import com.projet.main.DatabaseConnection;
import com.projet.main.pre;
import static com.projet.main.pre.csv2arff;
import static com.projet.main.pre.writeToCSV;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.filters.unsupervised.attribute.Remove;

public class Form_2 extends javax.swing.JPanel {

    private static boolean isButtonClicked = false;
    private int decisionTree = 0;
    private int randomForest = 0;

    public Form_2() {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        initComponents();
        setOpaque(false);
        roundPanel9.setVisible(false);
        roundPanel8.setVisible(false);
        roundPanel7.setVisible(false);
        roundPanel2.setVisible(false);
        roundPanel1.setVisible(false);
        init();
    }

    private void init() {

        chart.addLegend("Decision Tree", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Random Forest", new Color(12, 84, 175), new Color(0, 108, 247));

        progress2.start();
        progress3.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.projet.swing.RoundPanel();
        chart = new com.projet.chart.Chart();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        roundPanel7 = new com.projet.swing.RoundPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roundPanel8 = new com.projet.swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        roundPanel9 = new com.projet.swing.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        roundPanel2 = new com.projet.swing.RoundPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        progress3 = new com.projet.swing.progress.Progress();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        progress2 = new com.projet.swing.progress.Progress();

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox2.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau d'étude", "Bac", "Bac+2", "Bac+3", "Bac+5" }));

        jComboBox4.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type de contract", "CDI", "CDD", "Freelance", "Stage" }));

        jComboBox5.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ville", "Agadir et région", "Casablanca et région", "Fès et région", "kénitra et région", "Marrakech et région", "Meknès et région", "Rabat et région", "Tanger et région" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Predict");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secteur", "Automobile", "Agriculture", "Agroalimentaire", "Banque", "BTP", "Centre d'appels", "Commerciale", "Comptabilité", "Éducation", "Gestion", "Hôtellerie", "Industrie", "Informatique", "Télécommunications" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextArea3);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setText("Random Forest");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 242, 242));
        jLabel13.setText("jLabel5");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Predicted PosteName:");

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(roundPanel7Layout.createSequentialGroup()
                        .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundPanel7Layout.setVerticalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addGap(17, 17, 17))
        );

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("Decision Tree");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setText("Predicted PosteName:");

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("jLabel5");

        javax.swing.GroupLayout roundPanel8Layout = new javax.swing.GroupLayout(roundPanel8);
        roundPanel8.setLayout(roundPanel8Layout);
        roundPanel8Layout.setHorizontalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(roundPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        roundPanel8Layout.setVerticalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addGap(17, 17, 17))
        );

        roundPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Clustering");

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setText("jLabel5");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(242, 242, 242));
        jLabel14.setText("Predicted PosteName:");

        javax.swing.GroupLayout roundPanel9Layout = new javax.swing.GroupLayout(roundPanel9);
        roundPanel9.setLayout(roundPanel9Layout);
        roundPanel9Layout.setHorizontalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(roundPanel9Layout.createSequentialGroup()
                        .addGroup(roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        roundPanel9Layout.setVerticalGroup(
            roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("Accuracy");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jPanel4.setOpaque(false);

        progress3.setBackground(new java.awt.Color(66, 193, 246));
        progress3.setForeground(new java.awt.Color(26, 132, 181));
        progress3.setValue(85);

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(220, 220, 220));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Random Forest");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(220, 220, 220));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Decision Tree");

        progress2.setBackground(new java.awt.Color(132, 66, 246));
        progress2.setForeground(new java.awt.Color(64, 18, 153));
        progress2.setValue(70);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(progress2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chart.clear();
        String Secteur = (String) jComboBox1.getSelectedItem();
        String Niveau = (String) jComboBox2.getSelectedItem();
        String Type = (String) jComboBox4.getSelectedItem();
        String Ville = (String) jComboBox5.getSelectedItem();

        if (!Secteur.equals("Secteur") && !Niveau.equals("Niveau d'étude") && !Type.equals("Type de contract") && !Ville.equals("Ville")) {
            roundPanel9.setVisible(true);
            roundPanel8.setVisible(true);
            roundPanel7.setVisible(true);
            roundPanel2.setVisible(true);
            roundPanel1.setVisible(true);
            pre Pretraitement = new pre();
            try (Connection connection = DatabaseConnection.connectToDatabase()) {
                Pretraitement.mettreAJourProfils(connection, "rekrute_jobs", "post_name");
                Pretraitement.mettreAJourSecteurs(connection, "rekrute_jobs", "secteur");
                Pretraitement.mettreAJourRegions(connection, "rekrute_jobs", "region");
                Pretraitement.mettreAJourNiveauxEtude(connection, "rekrute_jobs", "niveau_etude");
                Pretraitement.mettreAJourTypeDeContrat(connection, "rekrute_jobs", "type_de_contrat");

                Pretraitement.mettreAJourProfils(connection, "m_job", "title");
                Pretraitement.mettreAJourSecteurs(connection, "m_job", "sector");
                Pretraitement.mettreAJourRegions(connection, "m_job", "location");
                Pretraitement.mettreAJourNiveauxEtude(connection, "m_job", "educationLevel");
                Pretraitement.mettreAJourTypeDeContrat(connection, "m_job", "contractType");

                // mettreAJourProfils(connection, "emploi_ma", "Postname");
                Pretraitement.mettreAJourSecteurs(connection, "emploi_ma", "secteur");
                Pretraitement.mettreAJourRegions(connection, "emploi_ma", "region");
                Pretraitement.mettreAJourNiveauxEtude(connection, "emploi_ma", "niveau_etude");
                Pretraitement.mettreAJourTypeDeContrat(connection, "emploi_ma", "Type_de_contrat");

                Pretraitement.deleteUnsefful(connection);

                Pretraitement.consolidateData(connection);

                writeToCSV();
                String arff = "table.arff";
                csv2arff(arff);
                // LA SUPPRESSION:

                if (Pretraitement.columnExists(connection, "rekrute_jobs", "site") || Pretraitement.columnExists(connection, "m_job", "sitename") || Pretraitement.columnExists(connection, "emploi_ma", "sitename")) {
                    Pretraitement.supprimerColonnes(connection, "rekrute_jobs", new String[]{"site", "date_de_publication", "experience",
                        "competence", "entreprise", "date_post_max", "description", "profil_recherche", "url"});

                    Pretraitement.supprimerColonnes(connection, "m_job",
                            new String[]{"sitename", "company", "titleoffer", "salary", "recruiterInfo", "jobInfo",
                                "profileInfo", "profession", "experienceLevel", "languageRequired", "lien"});

                    Pretraitement.supprimerColonnes(connection, "emploi_ma",
                            new String[]{"sitename", "description", "DateDePublication", "Entreprise", "EntrepriseDes",
                                "Competence", "experience", "langue", "nombre_de_poste", "url"});

                }

                System.out.println("Mises à jour terminées avec succès.");

                KmeansClustering(Secteur, Niveau, Type, Ville);
                DecisionTree(Secteur, Niveau, Type, Ville);
                RandomForest(Secteur, Niveau, Type, Ville);
                chart.addData(new ModelChart("Accuracy of Supervised Model", new double[]{this.decisionTree, this.randomForest}));

                chart.start();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez devez selectionnez tous les champs!!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void KmeansClustering(String Secteur, String Niveau, String Type, String Ville) {
        try {
            jTextArea1.setText("");
            // Charger les données à partir du fichier ARFF
            Instances data = ConverterUtils.DataSource.read("table.arff");

            Map<String, String> dictionary = new HashMap<>();

            dictionary.put("0", "Consultant Financier");
            dictionary.put("1", "IT Manager");
            dictionary.put("2", "Conseillers Commerciaux Experts en Assurance");
            dictionary.put("3", "Technicien maintenance");
            dictionary.put("4", "Chargés Clientèle Réception d'appels");
            dictionary.put("5", "Chef de projet Senior Build");
            dictionary.put("6", "Senior Software Engineer");
            dictionary.put("7", "Concepteur Développeur Python");
            dictionary.put("8", "Data Analyst");
            dictionary.put("9", "Gestionnaire de Paie");
            dictionary.put("10", "Research Scientist");
            dictionary.put("11", "Acheteur Projets Anglophone");
            dictionary.put("12", "Courtier Français en assurance Recrute");
            // Utiliser le filtre Remove pour supprimer la première colonne (index 0)
            Remove removeFilter = new Remove();
            removeFilter.setAttributeIndices("1"); // Modification ici pour supprimer la première colonne
            removeFilter.setInputFormat(data);
            Instances dataWithoutContract = Remove.useFilter(data, removeFilter);

            // Créer le modèle de clustering k-means
            SimpleKMeans kmeans = new SimpleKMeans();
            kmeans.setNumClusters(13); // Définir le nombre de clusters

            // Construire le modèle
            kmeans.buildClusterer(dataWithoutContract);

            // Évaluer la performance du modèle de clustering
            ClusterEvaluation eval = new ClusterEvaluation();
            eval.setClusterer(kmeans);
            eval.evaluateClusterer(dataWithoutContract);

            // Afficher les résultats
            System.out.println("Cluster Assignments:\n" + eval.clusterResultsToString());

            System.out.println("Nouvelle instance à prédire********************");
            //
            Instance newInstance = new Instance(4); // 3 est le nombre d'attributs après suppression
            newInstance.setDataset(dataWithoutContract);
            newInstance.setValue(0, Type);
            newInstance.setValue(1, Ville);
            newInstance.setValue(2, Niveau);
            newInstance.setValue(3, Secteur);

            // Faire la prédiction
            int predictedCluster = kmeans.clusterInstance(newInstance);
            String predictionName = dictionary.get(String.valueOf(predictedCluster));
            jLabel11.setText(predictionName);

            //test
            double[] clusterAssignments = eval.getClusterAssignments();
            Map<Integer, Integer> clusterCounts = new HashMap<>();
            for (double assignment : clusterAssignments) {
                int clusterIndex = (int) assignment;
                clusterCounts.put(clusterIndex, clusterCounts.getOrDefault(clusterIndex, 0) + 1);
            }

            // Display le pourcentage de chaque cluster
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                int clusterIndex = Integer.parseInt(key);
                int instancesInCluster = clusterCounts.getOrDefault(clusterIndex, 0);
                double percentage = (double) instancesInCluster / dataWithoutContract.numInstances() * 100;

                String result = value + ": " + String.format("%.2f", percentage) + "%\n";
                System.out.println(result);
                // Display le résultat
                jTextArea1.append(result);
            }
            // Afficher la prédiction
            System.out.println("Predicted Cluster: " + predictedCluster + " " + predictionName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void DecisionTree(String Secteur, String Niveau, String Type, String Ville) {
        try {
            jTextArea2.setText("");
            // Charger les données à partir du fichier CSV ou ARFF
            Instances data = ConverterUtils.DataSource.read("table.arff");

            // Définir l'attribut à prédire
            data.setClassIndex(0);

            // Créer un classifieur (ici, J48 - un arbre de décision)
            // Classifier classifier = new J48();
            // Exemple de réglage des paramètres pour J48
            J48 classifier = new J48();
            String[] options = {"-C", "0.25", "-M", "2"};
            classifier.setOptions(options);

            // Construire le modèle
            classifier.buildClassifier(data);

            // Imprimer le modèle généré
            System.out.println(classifier);

            // Faire des prédictions pour chaque instance dans le jeu de données
            for (int i = 0; i < data.numInstances(); i++) {
                Instance instance = data.instance(i);
                double predictedClass = classifier.classifyInstance(instance);
                //System.out.println("Instance " + (i + 1) + ": " + data.classAttribute().value((int) predictedClass));
            }

            // Évaluer la performance du modèle
            Evaluation eval = new Evaluation(data);
            eval.crossValidateModel(classifier, data, 10, new java.util.Random(1));
            //System.out.println(eval.toSummaryString("\nResults\n======\n", false));

            System.out.println("Correctly Classified Instances: " + eval.correct());
            System.out.println("Incorrectly Classified Instances: " + eval.incorrect());

            double percentageTotal = eval.correct() / (eval.correct() + eval.incorrect());
            System.out.println("Percentage : " + percentageTotal * 100);

            progress2.setValue((int) (percentageTotal * 100));

            // Nombre total d'instances par classe
            String formattedPercentage = "";
            for (int i = 0; i < data.numClasses(); i++) {
                double totalInstances = eval.numTruePositives(i) + eval.numFalseNegatives(i);
                double correctPercentage = (double) eval.numTruePositives(i) / totalInstances * 100;
                if (correctPercentage > 20) {
                    formattedPercentage = String.format("%.2f", correctPercentage);
                    System.out.println("Correctly Classified Instances for Class " + data.classAttribute().value(i) + ": "
                            + correctPercentage + "%");
                    jTextArea2.append(data.classAttribute().value(i) + ":" + formattedPercentage + "%\n");
                }
            }

            System.out.println("le prediction *******************************");
            Instance newInstance = new Instance(5); // 4 est le nombre d'attributs
            newInstance.setDataset(data);
            newInstance.setValue(1, Type);
            newInstance.setValue(2, Ville);
            newInstance.setValue(3, Niveau);
            newInstance.setValue(4, Secteur);

            // Faire la prédiction pour la nouvelle instance
            double predictedClass = classifier.classifyInstance(newInstance);
            String predictedClassName = data.classAttribute().value((int) predictedClass);

            // Afficher la prédiction
            System.out.println("Predicted Class: " + predictedClassName);
            jLabel6.setText(predictedClassName);

            this.decisionTree = (int) (percentageTotal * 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void RandomForest(String Secteur, String Niveau, String Type, String Ville) {
        try {
            jTextArea3.setText("");
            // Charger les données à partir du fichier CSV ou ARFF
            Instances data = ConverterUtils.DataSource.read("table.arff");

            // Définir l'attribut à prédire (post_name)
            data.setClassIndex(0); // 0 est l'indice de l'attribut "post_name"

            // Créer un classifieur RandomForest
            Classifier classifier = new RandomForest();

            // Construire le modèle
            classifier.buildClassifier(data);

            // Imprimer le modèle généré
            System.out.println(classifier);

            // Faire des prédictions pour chaque instance dans le jeu de données
            for (int i = 0; i < data.numInstances(); i++) {
                Instance instance = data.instance(i);
                double predictedClass = classifier.classifyInstance(instance);
                //System.out.println("Instance " + (i + 1) + ": " + data.classAttribute().value((int) predictedClass));
            }

            // Évaluer la performance du modèle
            Evaluation eval = new Evaluation(data);
            eval.crossValidateModel(classifier, data, 10, new java.util.Random(1));
            //System.out.println(eval.toSummaryString("\nResults\n======\n", false));

            // Afficher des métriques spécifiques
            System.out.println("Correctly Classified Instances: " + eval.correct());
            System.out.println("Incorrectly Classified Instances: " + eval.incorrect());

            double percentageTotal = eval.correct() / (eval.correct() + eval.incorrect());

            System.out.println("Percentage : " + percentageTotal * 100);

            progress3.setValue((int) (percentageTotal * 100));

            System.out.println("---------------\n");
            // Nombre total d'instances par classe
            String formattedPercentage = "";
            for (int i = 0; i < data.numClasses(); i++) {
                double totalInstances = eval.numTruePositives(i) + eval.numFalseNegatives(i);
                double correctPercentage = (double) eval.numTruePositives(i) / totalInstances * 100;
                if (correctPercentage >= 20) {
                    System.out.println("Correctly Classified Instances for Class " + data.classAttribute().value(i) + ": "
                            + correctPercentage + "%");
                    formattedPercentage = String.format("%.2f", correctPercentage);
                    jTextArea3.append(data.classAttribute().value(i) + ":" + formattedPercentage + "%\n");
                }
            }

            System.out.println("le prediction *******************************");
            Instance newInstance = new Instance(5); // 4 est le nombre d'attributs
            newInstance.setDataset(data);
            newInstance.setValue(1, Type);
            newInstance.setValue(2, Ville);
            newInstance.setValue(3, Niveau);
            newInstance.setValue(4, Secteur);

            // Faire la prédiction
            double predictedClass = classifier.classifyInstance(newInstance);
            String predictedClassName = data.classAttribute().value((int) predictedClass);

            // Afficher la prédiction
            System.out.println("Predicted Type de profile: " + predictedClassName);
            jLabel13.setText(predictedClassName);
            this.randomForest = (int) (percentageTotal * 100);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.projet.chart.Chart chart;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private com.projet.swing.progress.Progress progress2;
    private com.projet.swing.progress.Progress progress3;
    private com.projet.swing.RoundPanel roundPanel1;
    private com.projet.swing.RoundPanel roundPanel2;
    private com.projet.swing.RoundPanel roundPanel7;
    private com.projet.swing.RoundPanel roundPanel8;
    private com.projet.swing.RoundPanel roundPanel9;
    // End of variables declaration//GEN-END:variables
}
