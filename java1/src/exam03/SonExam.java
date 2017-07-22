package exam03;

public class SonExam extends FatherExam{
	String str = "아들변수str";
	
	SonExam(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		SonExam se = new SonExam();
		System.out.println(se.str);
		se.getStr();
	}
}
