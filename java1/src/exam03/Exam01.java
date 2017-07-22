package exam03;

public class Exam01 {
	String str;
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.setStr("내가 나오겠지 임마!");
		System.out.println(e.getStr());
	}
}
