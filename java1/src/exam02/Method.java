package exam02;

public class Method {

	int[] num1 = new int[10]; 
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int[] getNum1() {
		return num1;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int[] a = method.getNum1();
		System.out.println(a[0]);
		String str ="주소값이 나올까? 내 문자열 값이 나올까?";
		String str2 = new String("여기요~");
	} 
	
}
