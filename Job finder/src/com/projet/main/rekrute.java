package com.projet.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class rekrute {

    public void scrap_rekrute(){
        try {
            int j;
            int k = 1;

            for (int i = 0; i < 2; i++) {
                Document doc = Jsoup.connect("https://www.rekrute.com/offres.html?s=3&p=" + i + "&o=1").get();
                Elements newsHeadlines = doc.select(".post-id");

                for (Element docuElement : newsHeadlines) {
                    if (k == 244 || k == 391){
                        k += 1;
                        break;
                    }
                    // Scraped data
                    String postNameText = "";
                    Element titreJobElement = docuElement.selectFirst(".titreJob");
                    if (titreJobElement != null) {
                        postNameText = titreJobElement.text();
                    }

                    String dateDePublicationText = docuElement.selectFirst(".date span").text();
                    String lienHref = "https://www.rekrute.com" + docuElement.selectFirst(".section h2 a").attr("href");
                    Document emploi = Jsoup.connect(lienHref).get();
                    String typeDeContratText = emploi.selectFirst("span[title=Type de contrat]").text();
                    String experienceText = emploi.selectFirst("li[title=Expérience requise]").text();
                    String regionText = emploi.selectFirst("li[title=Région]").text();
                    String niveauText = emploi.selectFirst("li[title=\"Niveau d'étude et formation\"]").text();
                    String competenceText = emploi.selectFirst(".tagSkills").text();
                    Element entreprise = emploi.selectFirst("#recruiterDescription p");
                    String entrepriseText = (entreprise != null) ? entreprise.text() : "";
                    String secteurText = emploi.selectFirst(".h2italic").text();
                    String datePostMaxText = emploi.selectFirst(".newjob b").text();
                    Element descriptionElement = emploi.selectFirst("#recruiterDescription p");
                    String descriptionText = (descriptionElement != null) ? descriptionElement.text() : "";
                    Element profilRechercheElement = emploi.selectFirst("div:has(h2:contains(Profil recherché))");
                    String profilRechercheText = (profilRechercheElement != null) ? profilRechercheElement.text() : "";

                    // Insert into the database
                    insererDansBaseDeDonnees("rekrute.com", postNameText, dateDePublicationText, typeDeContratText,
                            experienceText, regionText, niveauText, competenceText, entrepriseText,
                            secteurText, datePostMaxText, descriptionText, profilRechercheText,lienHref);

                    System.out.println("Emploi " + k + " collected ");
                    k++;
                }
                j = i + 1;
                System.out.println("Page " + j + " successfully collected!!!!!");
            }

        } catch (IOException  e) {
            System.out.println("Error during the scraping process : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error during database insertion: " + e.getMessage());

        }
    }

    private static void insererDansBaseDeDonnees(String sitename, String postName, String dateDePublication, String typeDeContrat,
                                                 String experience, String region, String niveau, String competence,
                                                 String entreprise, String secteur, String datePostMax,
                                                 String description, String profilRecherche,String url) throws SQLException {
        try (Connection connection = DatabaseConnection1.connectToDatabase()) {
            String query = "INSERT INTO rekrute_jobs (site, post_name, date_de_publication, type_de_contrat, " +
                    "experience, region, niveau_etude, competence, entreprise, secteur, date_post_max, " +
                    "description, profil_recherche,url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sitename);
            preparedStatement.setString(2, postName);
            preparedStatement.setString(3, dateDePublication);
            preparedStatement.setString(4, typeDeContrat);
            preparedStatement.setString(5, experience);
            preparedStatement.setString(6, region);
            preparedStatement.setString(7, niveau);
            preparedStatement.setString(8, competence);
            preparedStatement.setString(9, entreprise);
            preparedStatement.setString(10, secteur);
            preparedStatement.setString(11, datePostMax);
            preparedStatement.setString(12, description);
            preparedStatement.setString(13, profilRecherche);
            preparedStatement.setString(14, url);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }
}
