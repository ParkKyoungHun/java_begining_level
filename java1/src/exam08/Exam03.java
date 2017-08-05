package exam08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exam03 {
	public List<String> getList(){
		List<String> list= new ArrayList<String>();
		list.add("abc");
		list.add("bbc");
		list.add("1");
//		list.add(1);
		return list;
	}

	public static void main(String[] args) {
		Exam03 e = new Exam03();
		List<String> list = e.getList();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
		}
		
		UserInfo ui = new UserInfo();
		ui.setUiNum(3);
		System.out.println(ui.getUiNum());
	}
}
