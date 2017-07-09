package exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		//입력받은 id와 pwd를 여러분들이 직접 출력(콘솔창에)해주시기 바랍니다.
		Scanner s = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요=>");
		String id =s.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.println("단비밀번호는 숫자만 입력해주셔야 합니다.");

		String pwd =s.nextLine();
		int pwdNum=0;
		
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			System.out.println("너 임마 사람말이 말같지 않지? 왜 문자 입력해!!");
		}
		System.out.println("입력하신 아이디 = " + id);
		System.out.println("입력하신 비밀번호 = " + pwd);
		System.out.println("입력하신 숫자 비밀번호 = " + pwdNum);
	}
}
