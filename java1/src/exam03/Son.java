package exam03;

public class Son extends Father{
	
	String house = "서울";
	public Son() {
		System.out.println("아들 생성자를 호출했네요");
	}
	public void printHouse() {				
		System.out.println("아들집1");
	}

	public static void main(String[] args) {
		Father s = new Son();
		s.doJob();
		s.printHouse();
		s.doSleep();
	}

}
