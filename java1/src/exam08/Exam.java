package exam08;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	public List<String> getSomeList() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		return list;
	}
	
	public static void main(String[] args) {
		Exam e = new Exam();
		List<String> list = e.getSomeList();
		
		for(String str : list) {
			System.out.println(str);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
