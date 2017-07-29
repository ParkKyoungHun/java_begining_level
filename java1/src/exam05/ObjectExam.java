package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectExam {

	public static void main(String[] args) {

		Object o = "asdf";
		o = new HashMap();
		o = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		al2.add("adsf");
		al2.add(1);
		String str = new String("123");
		String str2 = new String("123");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.equals(str2));

		ObjectExam oe = new ObjectExam();
		ObjectExam oe2 = new ObjectExam();
		System.out.println(oe.equals(oe2));
	}
}
