package exam03;

public class ConExam {
	int age = 30;
	String name = "ȫ�浿";

	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		if(age<20) {
			System.out.println("10��");
		}else if(age<30) {
			System.out.println("20��");
		}else if(age<40) {
			System.out.println("30��");
		}else if(age<50) {
			System.out.println("40��");
		}else if(age<60) {
			System.out.println("50��");
		}else if(age>=60) {
			System.out.println("�����̿�~");
		}
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(20, "��浿");
		ConExam ce1 = new ConExam(30, "��浿");
	}

}
