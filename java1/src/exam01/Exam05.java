package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("니가 생각하는 숫자를 읊어보렴~");
		String str = scan.nextLine();
		
		int inputNum = Integer.parseInt(str);
		if(inputNum==1) {
			System.out.println("니가 입력한 숫자가 1이구나");
		}else if(inputNum==2) {
			System.out.println("니가 입력한 숫자가 2구나");
		}else {
			System.out.println("난 도저히 니가 입력한 숫자가 뭔지 모르겠다");			
		}
		
	}
}
