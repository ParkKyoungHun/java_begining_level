package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ����� ���۰��� �Է����ּ���.");
		String initStr = scan.nextLine();
		
		int initNum = Integer.parseInt(initStr);
		
		int num = 0;
		System.out.println("�ݺ����� ���ᰪ�� �Է����ּ���.");
		String maxStr = scan.nextLine();
		int maxNum = Integer.parseInt(maxStr);
		
		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(i);
		}
		System.out.println(num);
	}
}
