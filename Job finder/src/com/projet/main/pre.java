package com.projet.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.opencsv.CSVWriter;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

public class pre {
  
    
    public static void mettreAJourProfils(Connection connection, String nomTable, String nomColonne)
            throws SQLException {
        Map<String, String> labels = new HashMap<>();
        labels.put("Research Scientist", "Research Scientist");
        labels.put("Senior Software", "Senior Software Engineer");
        labels.put("Chef de Projet", "Chef de projet Senior Build");
        labels.put("Concepteur", "Concepteur Développeur Python");
        labels.put("Développeur", "Concepteur Développeur Python");
        labels.put("Gestionnaire", "Gestionnaire de Paie");
        labels.put("Relation Client", "Pôle Relation Client");
        labels.put("Ingénieur", "Ingénieur Qualité");
        labels.put("Data", "Data Analyst");
        labels.put("Conseillers", "Conseillers Commerciaux Experts en Assurance");
        labels.put("Commerciaux", "Conseillers Commerciaux Experts en Assurance");
        labels.put("Courtier", "Courtier Français en assurance Recrute");
        labels.put("Chargés", "Chargés Clientèle Réception d'appels");
        labels.put("Clientèle", "Chargés Clientèle Réception d'appels");
        labels.put("Consultant", "Consultant Financier");
        labels.put("Financier", "Consultant Financier");
        labels.put("Responsable", "Responsable Sécurité du Système d’Information");
        labels.put("Technicien", "Technicien maintenance");
        labels.put("IT", "IT Manager");
        labels.put("Accountant", "Senior Accountant");
        labels.put("Technicien", "Technicien maintenance");
        labels.put("Acheteur", "Acheteur Projets Anglophone");
        for (Map.Entry<String, String> entry : labels.entrySet()) {
            updateValue(connection, nomTable, nomColonne, entry.getKey(), entry.getValue());

        }
    }

    public static void mettreAJourSecteurs(Connection connection, String nomTable, String nomColonne)
            throws SQLException {
        Map<String, String> labels = new HashMap<>();
        labels.put("Informatique", "Informatique");
        labels.put("industrie", "Industrie");
        labels.put("Hôtellerie", "Hôtellerie");
        labels.put("Automobile", "Automobile");
        labels.put("Nettoyage", "Nettoyage");
        labels.put("Agriculture", "Agriculture");
        labels.put("education", "Éducation");
        labels.put("comptabilite", "Comptabilité");
        labels.put("gestion", "Gestion");
        labels.put("call center", "Centre d'appels");
        labels.put("Centres d'appels", "Centre d'appels");
        labels.put("Commercial", "Commerciale");
        labels.put("Banque", "Banque");
        labels.put("Télécommunications", "Télécommunications");
        labels.put("BTP", "BTP");
        labels.put("Ameublement", "Ameublement");
        labels.put("Agroalimentaire", "Agroalimentaire");
        for (Map.Entry<String, String> entry : labels.entrySet()) {
            updateValue(connection, nomTable, nomColonne, entry.getKey(), entry.getValue());

        }

    }

    public static void mettreAJourRegions(Connection connection, String nomTable, String nomColonne)
            throws SQLException {
        Map<String, String> regionsToUpdate = new HashMap<>();
        regionsToUpdate.put("Casablanca", "Casablanca et région");
        regionsToUpdate.put("Fès", "Fès et région");
        regionsToUpdate.put("Rabat", "Rabat et région");
        regionsToUpdate.put("Marrakech", "Marrakech et région");
        regionsToUpdate.put("Agadir", "Agadir et région");
        regionsToUpdate.put("Kénitra", "kénitra et région");
        regionsToUpdate.put("Autres régions", "kénitra et région");
        regionsToUpdate.put("Tout le Maroc", "kénitra et région");
        regionsToUpdate.put("Tanger", "Tanger et région");
        regionsToUpdate.put("Meknès et région", "Meknès et région");
        for (Map.Entry<String, String> entry : regionsToUpdate.entrySet()) {
            updateValue(connection, nomTable, nomColonne, entry.getKey(), entry.getValue());

        }
    }

    public static void mettreAJourNiveauxEtude(Connection connection, String nomTable, String nomColonne)
            throws SQLException {
        Map<String, String> labels = new HashMap<>();
        labels.put("Bac +1", "Bac");
        labels.put("Bac Minimum", "Bac");
        labels.put("Bac +2", "Bac+2");
        labels.put("Bac +3", "Bac+3");
        labels.put("Bac +4", "Bac+3");
        labels.put("Bac +5", "Bac+5");
        labels.put("Bac+1", "Bac");
        labels.put("NIV BAC ET MOINS", "Bac");
        labels.put("Bac+2", "Bac+2");
        labels.put("Bac+3", "Bac+3");
        labels.put("Bac+4", "Bac+3");
        labels.put("Bac+5", "Bac+5");
        for (Map.Entry<String, String> entry : labels.entrySet()) {
            updateValue(connection, nomTable, nomColonne, entry.getKey(), entry.getValue());

        }
    }

    public static void mettreAJourTypeDeContrat(Connection connection, String nomTable, String nomColonne)
            throws SQLException {
        Map<String, String> labels = new HashMap<>();
        labels.put("Stage", "Stage");
        labels.put("Intérim", "Stage");
        labels.put("Lettre d'Engagement", "Freelance");
        labels.put("Freelance", "Freelance");
        labels.put("Free Lance", "Freelance");
        labels.put("Autre", "Freelance");
        labels.put("CDI", "CDI");
        labels.put("CDD", "CDD");
        for (Map.Entry<String, String> entry : labels.entrySet()) {
            updateValue(connection, nomTable, nomColonne, entry.getKey(), entry.getValue());

        }
    }

    public static void deleteUnsefful(Connection connection)
            throws SQLException {
        String query = "DELETE FROM rekrute_jobs WHERE secteur NOT IN (\"Agroalimentaire\",\"Ameublement\",\"BTP\", \"Télécommunications\",\"Banque\",\"Commerciale\",\"Centre d'appels\",\"Gestion\",\"Comptabilité\",\"Éducation\",\"Agriculture\",\"Nettoyage\",\"Automobile\",\"Hôtellerie\",\"Industrie\",\"Informatique\")";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
        String query1 = "DELETE FROM emploi_ma WHERE secteur NOT IN (\"Agroalimentaire\",\"Ameublement\",\"BTP\", \"Télécommunications\",\"Banque\",\"Commerciale\",\"Centre d'appels\",\"Gestion\",\"Comptabilité\",\"Éducation\",\"Agriculture\",\"Nettoyage\",\"Automobile\",\"Hôtellerie\",\"Industrie\",\"Informatique\")";
        PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
        preparedStatement1.executeUpdate();
        String query2 = "DELETE FROM m_job WHERE sector NOT IN (\"Agroalimentaire\",\"Ameublement\",\"BTP\", \"Télécommunications\",\"Banque\",\"Commerciale\",\"Centre d'appels\",\"Gestion\",\"Comptabilité\",\"Éducation\",\"Agriculture\",\"Nettoyage\",\"Automobile\",\"Hôtellerie\",\"Industrie\",\"Informatique\")";
        PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
        preparedStatement2.executeUpdate();

        String query3 = "DELETE FROM rekrute_jobs WHERE region NOT IN(\"Meknès et région\",\"Tanger et région\",\"kénitra et région\",\"Agadir et région\", \"Marrakech et région\",\"Rabat et région\",\"Fès et région\",\"Casablanca et région\")";
        PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
        preparedStatement3.executeUpdate();
        String query4 = "DELETE FROM m_job WHERE location NOT IN(\"Meknès et région\",\"Tanger et région\",\"kénitra et région\",\"Agadir et région\", \"Marrakech et région\",\"Rabat et région\",\"Fès et région\",\"Casablanca et région\")";
        PreparedStatement preparedStatement4 = connection.prepareStatement(query4);
        preparedStatement4.executeUpdate();
        String query5 = "DELETE FROM emploi_ma WHERE region NOT IN(\"Meknès et région\",\"Tanger et région\",\"kénitra et région\",\"Agadir et région\", \"Marrakech et région\",\"Rabat et région\",\"Fès et région\",\"Casablanca et région\")";
        PreparedStatement preparedStatement5 = connection.prepareStatement(query5);
        preparedStatement5.executeUpdate();

        String query6 = "DELETE FROM rekrute_jobs WHERE post_name NOT IN (\"Technicien maintenance\",\"Responsable Sécurité du Système d’Information\",\"Consultant Financier\",\"Chargés Clientèle Réception d'appels\",\"Courtier Français en assurance Recrute\",\"Conseillers Commerciaux Experts en Assurance\",\"Data Analyst\",\"Ingénieur Qualité\",\"Pôle Relation Client\",\"Gestionnaire de Paie\",\"Concepteur Développeur Python\",\"Chef de projet Senior Build\",\"Senior Software Engineer\",\"Research Scientist\",\"Acheteur Projets Anglophone\",\"Technicien maintenance\",\"Senior Accountant\",\"IT Manager\")";
        PreparedStatement preparedStatement6 = connection.prepareStatement(query6);
        preparedStatement6.executeUpdate();
        String query7 = "DELETE FROM emploi_ma WHERE Postname NOT IN (\"Technicien maintenance\",\"Responsable Sécurité du Système d’Information\",\"Consultant Financier\",\"Chargés Clientèle Réception d'appels\",\"Courtier Français en assurance Recrute\",\"Conseillers Commerciaux Experts en Assurance\",\"Data Analyst\",\"Ingénieur Qualité\",\"Pôle Relation Client\",\"Gestionnaire de Paie\",\"Concepteur Développeur Python\",\"Chef de projet Senior Build\",\"Senior Software Engineer\",\"Research Scientist\",\"Acheteur Projets Anglophone\",\"Technicien maintenance\",\"Senior Accountant\",\"IT Manager\")";
        PreparedStatement preparedStatement7 = connection.prepareStatement(query7);
        preparedStatement7.executeUpdate();
        String query8 = "DELETE FROM m_job WHERE title NOT IN (\"Technicien maintenance\",\"Responsable Sécurité du Système d’Information\",\"Consultant Financier\",\"Chargés Clientèle Réception d'appels\",\"Courtier Français en assurance Recrute\",\"Conseillers Commerciaux Experts en Assurance\",\"Data Analyst\",\"Ingénieur Qualité\",\"Pôle Relation Client\",\"Gestionnaire de Paie\",\"Concepteur Développeur Python\",\"Chef de projet Senior Build\",\"Senior Software Engineer\",\"Research Scientist\",\"Acheteur Projets Anglophone\",\"Technicien maintenance\",\"Senior Accountant\",\"IT Manager\")";
        PreparedStatement preparedStatement8 = connection.prepareStatement(query8);
        preparedStatement8.executeUpdate();

    }

    public static void supprimerColonnes(Connection connection, String nomTable, String[] colonnesASupprimer)
            throws SQLException {
        // Création de l'objet Statement
        Statement statement = connection.createStatement();

        // Construction de la requête SQL pour supprimer les colonnes
        StringBuilder queryBuilder = new StringBuilder("ALTER TABLE ").append(nomTable);
        for (String colonne : colonnesASupprimer) {
            queryBuilder.append(" DROP COLUMN ").append(colonne).append(",");
        }
        // Supprimer la virgule en trop à la fin
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);

        // Exécution de la requête
        statement.executeUpdate(queryBuilder.toString());

        System.out.println("Colonnes supprimées avec succès pour la table : " + nomTable);
    }

    public static void updateValue(Connection connection, String nomTable, String nomColonne,
            String ancienneValeur, String nouvelleValeur) throws SQLException {
        String sql = "UPDATE " + nomTable + " SET " + nomColonne + " = ? WHERE " + nomColonne + " LIKE ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nouvelleValeur);
            preparedStatement.setString(2, "%" + ancienneValeur + "%");
            preparedStatement.executeUpdate();
        }
    }

    public static void dropTableIfExists(Connection connection) throws SQLException {
        String dropTableQuery = "DROP TABLE IF EXISTS consolidated_table";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(dropTableQuery);
        }
    }

    public static boolean columnExists(Connection connection, String tableName, String columnName) throws SQLException {
        String query = "SHOW COLUMNS FROM " + tableName + " LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, columnName);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        }
    }
    public static void createTable(Connection connection) throws SQLException {
        String createTableQuery = "CREATE TABLE consolidated_table (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "post_name VARCHAR(255)," +
                "type_de_contrat VARCHAR(50)," +
                "region VARCHAR(50)," +
                "niveau_etude VARCHAR(50)," +
                "secteur VARCHAR(50)" +
                ")";

        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableQuery)) {
            preparedStatement.executeUpdate();
        }
    }

    public static void consolidateData(Connection connection) throws SQLException {
        dropTableIfExists(connection);
        createTable(connection);
        String consolidationQuery = "INSERT INTO consolidated_table (post_name, type_de_contrat, region, niveau_etude, secteur) "
                +
                "SELECT post_name, type_de_contrat, region, niveau_etude, secteur FROM rekrute_jobs " +
                "UNION ALL " +
                "SELECT title, contractType, location, educationLevel, sector FROM m_job " +
                "UNION ALL " +
                "SELECT Postname, Type_de_contrat, region, niveau_etude, secteur FROM emploi_ma";

        try (PreparedStatement preparedStatement = connection.prepareStatement(consolidationQuery)) {
            preparedStatement.executeUpdate();
        }
    }

    public static void writeToCSV() {
        try (Connection connection = DatabaseConnection.connectToDatabase()) {
            String query = "SELECT post_name, type_de_contrat, region, niveau_etude, secteur FROM consolidated_table ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            try (CSVWriter writer = new CSVWriter(new FileWriter("table.csv"))) {
                writer.writeAll(resultSet, true);

                System.out.println("Data written to CSV file.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void csv2arff(String arffFilePath) {
        String csvFilePath = "table.csv";
        try {
            CSVLoader loader = new CSVLoader();
            loader.setSource(new File(csvFilePath));
            Instances data = loader.getDataSet();

            ArffSaver arffSaver = new ArffSaver();
            arffSaver.setInstances(data);
            arffSaver.setFile(new File(arffFilePath));
            arffSaver.writeBatch();

            System.out.println("Conversion completed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}