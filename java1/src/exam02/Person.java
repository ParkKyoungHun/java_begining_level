package exam02;

public class Person {
	String name;
	String address;
	String job;
	
	public Person(String name, String job) {
		this.job = job;
		this.name = name;
	}
	public void doJob() {
		System.out.println(name + "���� " + job + "�� �ϰ� �ֽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", "������");
		p.doJob();
	}
}
