package t02;

public class Execute {

	public static void main(String[] args) {
		Connection c = DataBaseManager.getConnection("adsf", "id", "pwd");
		try {
			c.printStr("adffsad");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
