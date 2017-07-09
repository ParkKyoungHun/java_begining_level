package exam01;

public class Exam10 {

	public static void main(String[] args) {
		//int데이터타입의 배열변수 nums를 선언해주세요
		//nums의 방갯수는 5개입니다.
		int[] nums = new int[5];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*10;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
