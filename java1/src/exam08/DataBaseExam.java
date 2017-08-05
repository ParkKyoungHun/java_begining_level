package exam08;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DataBaseExam {

	public static void main(String[] args) {
		try {
			ClassLoader loader = DataBaseExam.class.getClassLoader();
			InputStream fis = loader.getResourceAsStream("db.properties");
	
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("db.driver");
			String url = prop.getProperty("db.url");
			String id = prop.getProperty("db.id");
			String pwd = prop.getProperty("db.pwd");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(id);
			System.out.println(pwd);

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pwd);
			PreparedStatement ps = con.prepareStatement("");
			String sql = "select * from user_info";
			
			ResultSet rs = ps.executeQuery(sql);
			List<UserInfo> list = new ArrayList<UserInfo>();
			while(rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUiNum(rs.getInt("uinum"));
				ui.setUiName(rs.getString("uiname"));
				ui.setUiAge(rs.getInt("uiage"));
				ui.setUiAddress(rs.getString("uiaddress"));
				list.add(ui);
			}
			
			for(UserInfo ui : list) {
				System.out.print("유저번호 : " + ui.getUiNum());
				System.out.print(", 유저이름 : " + ui.getUiName());
				System.out.print(", 유저나이 : " + ui.getUiAge());
				System.out.print(", 유저주소 : " + ui.getUiAddress());
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
