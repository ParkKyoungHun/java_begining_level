package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ϰ� �����ϴ� ���ڸ� �����~");
		String str = scan.nextLine();
		
		int inputNum = Integer.parseInt(str);
		if(inputNum==1) {
			System.out.println("�ϰ� �Է��� ���ڰ� 1�̱���");
		}else if(inputNum==2) {
			System.out.println("�ϰ� �Է��� ���ڰ� 2����");
		}else {
			System.out.println("�� ������ �ϰ� �Է��� ���ڰ� ���� �𸣰ڴ�");			
		}
		
	}
}
