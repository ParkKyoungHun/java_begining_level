package exam06;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public void printOption(Car c, String carName) {
		c.chioceCar(carName);
		if(!c.checkCarName()) {
			System.out.println("�����Ͻ� �ڵ����� �����ϴ�.");
		}else {
			c.printName();
			System.out.println("�õ��� ŵ�ϴ�.");
			c.move();
			c.stop();
			System.out.println("�õ��� ���ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Execute e = new Execute();
		
		List<String> kiaCarList = new ArrayList<String>();
		kiaCarList.add("K7");
		kiaCarList.add("K5");
		kiaCarList.add("K3");
		Kia k = new Kia(kiaCarList);
		e.printOption(k,"K7");
		
		List<String> hCarList = new ArrayList<String>();
		hCarList.add("Avante");
		hCarList.add("Sonata");
		hCarList.add("Accent");
		
		Hyundai h = new Hyundai(hCarList);
		e.printOption(h,"abc");

		
		List<String> sCarList = new ArrayList<String>();
		sCarList.add("QM5");
		sCarList.add("QM6");
		sCarList.add("QM3");
		Samsung s = new Samsung(sCarList);
		e.printOption(s,"QM5");
	}
}
