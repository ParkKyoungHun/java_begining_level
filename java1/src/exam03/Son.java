package exam03;

public class Son extends Father{
	
	String house = "����";
	public Son() {
		System.out.println("�Ƶ� �����ڸ� ȣ���߳׿�");
	}
	public void printHouse() {				
		System.out.println("�Ƶ���1");
	}

	public static void main(String[] args) {
		Father s = new Son();
		s.doJob();
		s.printHouse();
		s.doSleep();
	}

}
