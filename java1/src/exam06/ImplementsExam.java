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
		System.out.println("printStr2�� ȣ���߳׿�?");
	}
	
	public static void main(String[] args) {
		InterFaceExam ife = new ImplementsExam();
		ife.printStr("������");
		InterFaceExam ife2 = new PrintExam();
		ife2.printStr("������");
		
		List list = new ArrayList();
		list.add("adfasdf");
		List list2 = new LinkedList();
		list2.add("aadfs");
		
		ListInterface le = new ListExam();
		le.printString();
	}

}
