package exam06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementsExam implements InterFaceExam{

	@Override
	public void printStr(String str) {
		System.out.println(str);
	}
	
	public void printStr2(String str) {
		System.out.println("printStr2를 호출했네요?");
	}
	
	public static void main(String[] args) {
		InterFaceExam ife = new ImplementsExam();
		ife.printStr("나나나");
		InterFaceExam ife2 = new PrintExam();
		ife2.printStr("나나나");
		
		List list = new ArrayList();
		list.add("adfasdf");
		List list2 = new LinkedList();
		list2.add("aadfs");
		
		ListInterface le = new ListExam();
		le.printString();
	}

}
