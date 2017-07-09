package exam01;

public class Exam07 {

	public static void main(String[] args) {
//		int num = 1;
//		System.out.println(num);
//		num = num + 1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num += 1;
		
		for(int i=0;i<10;i++) {
			if(i!=0) {
				if(i%3==0) {
					System.out.println("3의 배수:" + i);
				}
				if(i%2==0) {
					System.out.println("2의 배수:" + i);
				}
			}
		}
	}
}
