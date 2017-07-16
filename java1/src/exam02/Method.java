package exam02;

public class Method {

	int num1 = 10;
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int getNum1() {
		return num1;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int a = method.getNum1();
		System.out.println(a);
	} 
	
}
