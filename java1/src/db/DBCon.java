package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBCon {
	private Connection con;
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/study";
	private String id = "root";
	private String pwd = "rnfma1";
	
	public DBCon(){
		try {
			Class.forName(driver);
			this.dBConnecte();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return con;
	}
	
	private void dBConnecte() throws SQLException {
		con = DriverManager.getConnection(url, id, pwd);
	}
	
	public void printListFromTable(String sql) {
		List<HashMap<String, String>> list = getListFromTable(sql);
		if(list!=null) {
			for(HashMap<String, String> hm : list) {
				System.out.println(hm);
			}
		}
	}
	
	public List<HashMap<String, String>> getListFromTable(String sql){
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int maxNum = rsmd.getColumnCount();
			List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
			while(rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();
				for(int i=1;i<=maxNum;i++) {
					String colName = rsmd.getColumnLabel(i);
					hm.put(colName, rs.getString(colName));
				}
				list.add(hm);
			}
			return list;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
	}
}
