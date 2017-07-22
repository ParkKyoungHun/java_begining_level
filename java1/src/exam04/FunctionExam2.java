package exam04;

public class FunctionExam2 {

	public void printStr1(Person str) {
//		str.doWakeUp();
		System.out.println("매개변수있는 함수네" + str);
	}
	public void printStr1(int str) {
		System.out.println("인트 매개변수있는 함수네" + str);
	}

	protected void printStr1() {
		System.out.println("매개변수 없는 함수네");
	}
	
	public static void main(String[] args) {
		FunctionExam2 fe = new FunctionExam2();
		BizMan bm = new BizMan();
		fe.printStr1(bm);
		Person p = new Person();
		fe.printStr1(p);
		int a = 3;
		fe.printStr1(a);
	}
}
