package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력해주세요.");
		String initStr = scan.nextLine();
		
		int initNum = Integer.parseInt(initStr);
		
		int num = 0;
		System.out.println("반복문의 종료값을 입력해주세요.");
		String maxStr = scan.nextLine();
		int maxNum = Integer.parseInt(maxStr);
		
		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(i);
		}
		System.out.println(num);
	}
}
