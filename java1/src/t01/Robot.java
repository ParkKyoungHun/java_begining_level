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
		System.out.println(name+"�κ�Ʈ�� " + m.name + "��(��) �߻� �ߴ�");
	}

	@Override
	public void doFly() {
		System.out.println(name+"�κ�Ʈ�� ���� ���ϴ�.");
	}

	@Override
	public void doEscape() {
		System.out.println(name+"�κ�Ʈ�� Ż���մϴ�.");
	}

	@Override
	public void doKick() {
		System.out.println(name+"�κ�Ʈ�� �����⸦ �����մϴ�.");
	}
	
	public void doRun() {
		System.out.println(name+"�κ�Ʈ �ݴϴ�.");
	}
	
}
