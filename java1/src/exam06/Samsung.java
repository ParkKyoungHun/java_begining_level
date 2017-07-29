package exam06;

import java.util.ArrayList;
import java.util.List;

public class Samsung implements Car{

	private String carName;
	private List<String> carList;
	
	public Samsung(String carName) {
		carList = new ArrayList<String>();
		carList.add(carName);
	}
	
	public Samsung(List<String> carList) {
		this.carList = carList;
	}

	
	public void chioceCar(String carName) {
		int index = carList.indexOf(carName);
		if(index ==-1) {
			System.out.println("���� �ڵ����Դϴ�.");
		}else {
			this.carName = carList.get(index);
		}
	}

	@Override
	public void move() {
		System.out.println(carName + "�� �����Դϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(carName + "�����մϴ�.");
	}
	@Override
	public void printName() {
		System.out.println(carName);
	}

	@Override
	public boolean checkCarName() {
		if(carName==null) {
			return false;
		}
		return true;
	}

}
