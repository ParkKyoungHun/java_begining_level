package t01;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		try {
			int num=Integer.parseInt(str);
			String[] strs = new String[num];
			for(int i=0;i<strs.length;i++) {
				strs[i] = i+"";
			}
			for(int i=0;i<strs.length;i++) {
				System.out.println(strs[i]);
			}
		}catch(Exception e){
			
		}
		
	}
}
