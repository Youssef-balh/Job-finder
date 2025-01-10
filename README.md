# Job-finder

Job finder is a Java-based project designed to provide users with a comprehensive dashboard for navigating real-time employee offers, conducting web scraping from three user-selected websites, and utilizing machine learning algorithms for job prediction. This project is intentionally crafted to be minimalist, relying solely on Java and MySQL along with specific libraries catering to web scraping, machine learning, and database interactions.For the machine learning we used unsupervised learning model (Clustering) and supervised learning model (decision tree and random forest).

## Key Features:

1. **User Authentication:**
   - Secure sign-in and sign-up functionalities.
   - Passwords are encrypted using the bcrypt library to ensure user data security.

2. **Real-time Employee Offers:**
   - Dynamic dashboard displaying real-time employee offers.
   - Visual representation through tables and charts for enhanced insights.

3. **Web Scraping:**
   - Users can choose one, two, or three websites for data scraping.
   - Utilizes the Jsoup library to fetch data from selected websites.
   - Scraped data is efficiently stored in the MySQL database.
   - Displays Data in tables and graphs.

4. **Job Search:**
   - Intuitive job search functionality allowing users to filter results based on contract type, location, education level, and sector.

5. **Predictive Analysis:**
   - Advanced job title prediction using machine learning algorithms based on education level,contract type,location and sector. 
   - Employs clustering, decision tree, and random forest algorithms from the Weka library.

## Technologies Used:
- **Java:** Primary programming language for development.
- **MySQL:** Database management system for data storage.
- **Jsoup:** Library for efficient web scraping.
- **Weka:** Machine learning library for predictive analysis.
- **OpenCSV:** Library for seamless data conversion to CSV format.
- **BCrypt:** Library for secure password encryption.
- **MySQL Connector:** Facilitates Java application connectivity to the MySQL database.

## Setup and Installation:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Youssef-balh/JobScope-InsightHub.git
2. **Database configuration:**
   - Make sure to change the port and the ip based on your configuration.
3. **Build and Run**

| ![IMG-20240110-WA0014](https://github.com/Youssef-balh/Job-finder/assets/113738047/fffe2753-0703-4295-845d-ca74c7b49bb4) | ![IMG-20240110-WA0020](https://github.com/Youssef-balh/Job-finder/assets/113738047/eb949451-e442-4559-920c-389f1c1dbd99) |
| --- | --- |
| ![IMG-20240110-WA0019](https://github.com/Youssef-balh/Job-finder/assets/113738047/66502b4e-6cec-474f-bb43-130273243725) | ![IMG-20240110-WA0018](https://github.com/Youssef-balh/Job-finder/assets/113738047/779786bb-9535-4295-99d0-5508309b00a6) |





