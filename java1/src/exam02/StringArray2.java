package exam02;

public class StringArray2 {
	int num;
	public void printStr() {
		num = 2;
		System.out.println(num);
		System.out.println("함수 : printStr을 호출하셨네요");
	}
	
	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();
		st2.printStr();
	}
}
