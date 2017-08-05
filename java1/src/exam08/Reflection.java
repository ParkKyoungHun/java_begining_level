package exam08;

import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("exam08.Exam");
			Exam e = (Exam)cls.newInstance();
			Exam e2 = new Exam();
			
		}catch(Exception ec) {
			System.out.println(ec);
		}
	}
}
