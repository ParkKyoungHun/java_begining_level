package exam08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exam02 {
	public List<String> getList(){
		List<String> list= new ArrayList<String>();
		return list;
	}

	public static void main(String[] args) {
		HashMap hm2 = new HashMap();
		
		hm2.put("key","abcv");
		
		ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String, Integer>>();
		list.add(hm2);
		
		for(HashMap<String, Integer> hm : list) {
			Integer a = hm.get("key");
			System.out.println(a);
		}
	}
}
