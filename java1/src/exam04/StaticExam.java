package exam04;

public class StaticExam {
	public static int num=1;
	
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.num=2;
		System.out.println(se.num);
		
		StaticExam se2 = new StaticExam();
		se2.num=5;
		System.out.println(se2.num);
		System.out.println(se.num);
		System.out.println(StaticExam.num);
		
		
	}
}
