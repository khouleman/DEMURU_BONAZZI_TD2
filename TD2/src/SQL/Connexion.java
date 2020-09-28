package SQL;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
public class Connexion {
	
	private static Connection maConnexion=null;
	
	private static void creeInstance() throws InvalidPropertiesFormatException, IOException {
		
		
		

		
		try {
			Properties accesBDD = new Properties();
			File FBdd = new File("config/bdd.properties");
			FileInputStream source = new FileInputStream(FBdd);
			accesBDD.loadFromXML(source);
			String url = accesBDD.getProperty("url");
			String login = accesBDD.getProperty("login");
			String mdp =accesBDD.getProperty("pass");
			source.close();
			maConnexion = DriverManager.getConnection(url,
					login,  mdp);
			
			
			
		}catch(SQLException sqle) {
			System.out.println("Erreur connexion " + sqle.getMessage());
		}
		
		
	}
	
	public static Connection creeConnexion() throws InvalidPropertiesFormatException, IOException {
		
		if(maConnexion==null) {
			creeInstance();
		} else
			try {
				if(!maConnexion.isValid(1)) {
					creeInstance();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				maConnexion=null;
			}
		return maConnexion;
	}
}