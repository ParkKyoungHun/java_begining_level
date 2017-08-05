package db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProperties {

	public DBProperties(String fileName) throws IOException {
		
		
		ClassLoader loader = DBProperties.class.getClassLoader();
		InputStream fis = loader.getResourceAsStream("db.properties");
		

		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("jdbc.url"));
	}
	
	public static void main(String[] args) {
		try {
		DBProperties dbp = new DBProperties("a");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
