package com.projet.main;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class m_job {
    

    private static void insererDansBaseDeDonnees(String title, String titleoffer, String location, String company, String contractType, String salary, String recruiterInfo, String jobInfo, String profileInfo, String sector, String profession, String experienceLevel, String educationLevel, String languageRequired, String lien) {
        try (Connection connection = DatabaseConnection1.connectToDatabase()) {
            String query = "INSERT INTO `m_job`(`title`, `titleoffer`, `location`, `company`, `contractType`, `salary`, `recruiterInfo`, `jobInfo`, `profileInfo`, `sector`, `profession`, `experienceLevel`, `educationLevel`, `languageRequired`, `lien`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, titleoffer);
            preparedStatement.setString(3, location);
            preparedStatement.setString(4, company);
            preparedStatement.setString(5, contractType);
            preparedStatement.setString(6, salary);
            preparedStatement.setString(7, recruiterInfo);
            preparedStatement.setString(8, jobInfo);
            preparedStatement.setString(9, profileInfo);
            preparedStatement.setString(10, sector);
            preparedStatement.setString(11, profession);
            preparedStatement.setString(12, experienceLevel);
            preparedStatement.setString(13, educationLevel);
            preparedStatement.setString(14, languageRequired);
            preparedStatement.setString(15, lien);
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully into the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

	public void m_job_scrap() {
		try {
			for (int i = 1; i < 3; i++) {
				Document document = Jsoup.connect("https://m-job.ma/recherche?page="+i).get();
				Elements hrefs = document.select(".offer-title a[href]");
	            for (Element href : hrefs) {
	            	String lien = href.attr("href");
	                Document doc = Jsoup.connect(href.attr("href")).get();
	 			    String title = doc.title();
	 			    String titleoffer = doc.select("h1.offer-title").text();
	 		        String location = doc.select("div.location span").text();
	 		        String company = doc.select("li:has(span:contains(Société:)) h3").text();
	 		        String contractType = doc.select("li:has(span:contains(Type de contrat:)) h3").text();
	 		        String salary = doc.select("li:has(span:contains(Salaire:)) h3").text();
	 		        
	 		        String recruiterInfo = doc.select("h3:contains(Le recruteur) + div").text();
	 		        String jobInfo = doc.select("h3:contains(Poste à occuper) + div").text();
	 		        String profileInfo = doc.select("h3:contains(Profil recherché) + div").text();
	 		        String sector = doc.select("h3:contains(Secteur(s) d\\'activité)+ div").text();
	 		        String profession = doc.select("h3:contains(Métier(s)) + div").text();
	 		        String experienceLevel = doc.select("h3:contains(Niveau d\\'expériences requis) + div").text();
	 		        String educationLevel = doc.select("h3:contains(Niveau d\\'études exigé) + div").text();
	 		        String languageRequired = doc.select("h3:contains(Langue(s) exigée(s)) + div").text();
	 		       
	 		        insererDansBaseDeDonnees(title,titleoffer,location,company,contractType,salary,recruiterInfo,jobInfo,profileInfo,sector,profession,experienceLevel,educationLevel,languageRequired ,lien);
	 		        
	            }
				
			}  
			  } catch(IOException e) {
				  e.printStackTrace();
			  }

	}

}