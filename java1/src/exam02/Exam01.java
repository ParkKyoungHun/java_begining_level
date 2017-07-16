package exam02;

public class Exam01 {
	int num1 = 10;
	public void print1() {
		int num3 = 5;
		System.out.println(num3);
	}

	public void print2() {
		System.out.println(num1);
	}
	
	public int printNum1() {
		return num1;
	}
	
	public String printStr() {
		return ""+num1;
	}
	
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.num1 = 20;
//		e.num3 = 10;
		e.print1();
		e.print2();
//		int a = e.printNum1();
//		System.out.println(a);
//		String str = 
		System.out.println(e.printStr());
	}
}
