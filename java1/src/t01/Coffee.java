package t01;

public class Coffee extends Food{

	public Coffee() {
		this("Ŀ��");
	}
	public Coffee(String str) {
		this(str, "adsf");
	}
	public Coffee(String str, String str2) {
		this(str, str2, "bcd");
	}

	public Coffee(String str, String str2, String str3) {
		super(str);
	}
	public void discountInfo() {
		System.out.println("���� 50%������縦 �������Դϴ�.");
	}
}
