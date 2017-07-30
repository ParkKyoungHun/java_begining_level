package t01;

public class Robot implements Action{
	private Weapon m;
	private String name;

	public Robot(String name) {
		this.name = name;
	}
	@Override
	public void setWeapon(Weapon m) {
		this.m = m;
	}

	@Override
	public void lunchWeapon() {
		System.out.println(name+"로보트가 " + m.name + "을(를) 발사 했다");
	}

	@Override
	public void doFly() {
		System.out.println(name+"로보트가 날라 댕깁니다.");
	}

	@Override
	public void doEscape() {
		System.out.println(name+"로보트가 탈출합니다.");
	}

	@Override
	public void doKick() {
		System.out.println(name+"로보트가 발차기를 시전합니다.");
	}
	
	public void doRun() {
		System.out.println(name+"로보트 뜁니다.");
	}
	
}
