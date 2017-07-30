package t02;

public class DataBaseManager {

	public static Connection getConnection(String url, String id, String pwd) {
		return new ConnectionImple2();
	}
}
