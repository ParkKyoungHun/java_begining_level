package exam04;

public class BizMan extends Person{

	public static void main(String[] args) {
//		Person p = new BizMan();
//		p.doSleep();
//		p.doWakeUp();
//		p.doWork();
//		
//		Person p2 = new Student();
//		p2.doSleep();
//		p2.doWakeUp();
//		p2.doWork();
		
		Person[] arrP = new Person[2];
		arrP[0] = new BizMan();
		arrP[1] = new Student();
		arrP[0].doWork();
		arrP[1].doWork();
			
	}
}
