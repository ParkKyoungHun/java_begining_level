package exam04;

public class OverLoading {

	public void over(int a, String b) {
		System.out.println("첫번째 오버함수를 호출했네요~~");
	}
	public void over(String b, int a) {
		System.out.println("두번째 오버함수를 호출했네요~~");
	}

	public String over(String str) {
		System.out.println("세번째 오버함수를 호출했네요~~");
		System.out.println(1);
		System.out.println('a');
		System.out.println(true);
		System.out.println(0.123);
		return "str";
	}
}
