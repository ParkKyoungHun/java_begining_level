package exam06;

import java.util.List;

public class CarMaker  implements Car{
	private String carName;
	private List<String> carList;
		
	public CarMaker() {}
	public CarMaker(List<String> carList) {
		this.carList = carList;
	}
	
	public void chioceCar(String carName) {
		try {
			int index = carList.indexOf(carName);
			if(index ==-1) {
				System.out.println("없는 자동차입니다.");
			}
			this.carName = carList.get(index);
		}catch(Exception e) {
			System.out.println("사랑합니다 고객님. 죄송해요 오류나서");
		}
	}
	
	@Override
	public void move() {
		System.out.println(carName + "가 움직입니다.");
	}

	@Override
	public void stop() {
		System.out.println(carName + "정지합니다.");
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
