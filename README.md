# Job-finder

Job finder is a Java-based project designed to provide users with a comprehensive dashboard for navigating real-time employee offers, conducting web scraping from three user-selected websites, and utilizing machine learning algorithms for job prediction. This project is intentionally crafted to be minimalist, relying solely on Java and MySQL along with specific libraries catering to web scraping, machine learning, and database interactions.

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
   - Advanced job title prediction using machine learning algorithms.
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
   git clone https://github.com/yourusername/JobScope-InsightHub.git
2. **Database configuration:**
   - Make sure to change the port and the ip based on your configuration.
3. **Build and Run**
