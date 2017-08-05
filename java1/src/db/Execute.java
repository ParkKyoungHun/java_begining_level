package db;

public class Execute {

	public static void main(String[] args) {
		DBCon dbCon = new DBCon();
		String sql = "select * from test";
		dbCon.printListFromTable(sql);
	}
}
