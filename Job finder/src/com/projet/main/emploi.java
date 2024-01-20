package com.projet.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class emploi {
    
    public void emploi_scrap(){
        try {
            int j;
            int k = 1;

            for (int i = 0; i < 2; i++) {

                Document doc = Jsoup.connect("https://www.emploi.ma/recherche-jobs-maroc?page=" + i).get();
                Elements newsHeadlines = doc.select(".job-description-wrapper");
                for (Element documentElement : newsHeadlines) {

                    Elements Postname = documentElement.select(".job-title h5");
                    Elements DateDePublication = documentElement.select(".job-title .job-recruiter");
                    Elements Entreprise = documentElement.select(".job-title .job-recruiter .company-name");
                    Elements description = documentElement.select(".job-title .search-description");
                    Elements region = documentElement.select(".job-title p");
                    Elements Competence = documentElement.select(".job-title .job-tags .badge");
                    Document emploi = Jsoup.connect(documentElement.absUrl("data-href")).get();

                    Elements Type_de_contrat = emploi.select(".field-name-field-offre-contrat-type .field-item");
                    Elements secteur = emploi.select(".field-name-field-offre-secteur .field-item");
                    Elements experience = emploi.select(".field-name-field-offre-niveau-experience .field-item");
                    Elements niveau_etude = emploi.select(".field-name-field-offre-niveau-etude .field-item");
                    Elements langue = emploi.select(".field-name-field-offre-niveau-langue .field-item");
                    Elements EntrepriseDes = emploi.select(".job-ad-company-description");
                    String sitename = "Emploi.ma";

                    // Store data in variables
                    int id = k;
                    String postName = Postname.text();
                    String descriptionText = description.text();
                    String dateDePublication = DateDePublication.text().split(" ")[0];
                    String entreprise = Entreprise.text();
                    String entrepriseDes = EntrepriseDes.text();
                    String regionText = region.last().text().split(":")[1];
                    String competence = Competence.text();
                    String typeDeContrat = Type_de_contrat.text();
                    String secteurText = secteur.text();
                    String experienceText = experience.text();
                    String niveauEtude = niveau_etude.text();
                    String langueText = langue.text();
                    String url = documentElement.absUrl("data-href");

                    System.out.println("Emploi " + k + " successfully collected !!!!!!!!!!");

                    insererDansBaseDeDonnees(id, sitename, postName, descriptionText, dateDePublication,
                            entreprise, entrepriseDes, regionText, competence, typeDeContrat,
                            secteurText, experienceText, niveauEtude, langueText, 1, url);

                    k++;

                }
                j = i + 1;
                System.out.println("page " + j + " successfully collected!!!!!");

            }

        } catch (Exception e) {
            System.out.println("Erreur de la connexion");
        }
    }

    private static void insererDansBaseDeDonnees(int id, String sitename, String postName, String description,
                                                  String dateDePublication, String entreprise, String entrepriseDes,
                                                  String region, String competence, String typeDeContrat,
                                                  String secteur, String experience, String niveauEtude,
                                                  String langue, int nombreDePoste, String url) {
        try (Connection connection = DatabaseConnection1.connectToDatabase()) {
            String query = "INSERT INTO emploi_ma (id, sitename, Postname, description, DateDePublication, " +
                    "Entreprise, EntrepriseDes, region, Competence, Type_de_contrat, secteur, experience, niveau_etude, " +
                    "langue, nombre_de_poste, url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, sitename);
            preparedStatement.setString(3, postName);
            preparedStatement.setString(4, description);
            preparedStatement.setString(5, dateDePublication);
            preparedStatement.setString(6, entreprise);
            preparedStatement.setString(7, entrepriseDes);
            preparedStatement.setString(8, region);
            preparedStatement.setString(9, competence);
            preparedStatement.setString(10, typeDeContrat);
            preparedStatement.setString(11, secteur);
            preparedStatement.setString(12, experience);
            preparedStatement.setString(13, niveauEtude);
            preparedStatement.setString(14, langue);
            preparedStatement.setInt(15, nombreDePoste);
            preparedStatement.setString(16, url);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
