package t01;

public class ExecuteRobot {

	public void doAction(Action ac, Weapon w) {
		ac.setWeapon(w);
		ac.lunchWeapon();
		if(ac instanceof Robot) {
			Robot r = (Robot) ac;
			r.doRun();
		}else if( ac instanceof Person) {
			System.out.println("사람인데 여기 왜 왔냐?");
		}
	}
	public static void main(String[] args) {
		ExecuteRobot er = new ExecuteRobot();
		er.doAction(new Atom(), new Punch());
		er.doAction(new Gundam(), new Missile());
		er.doAction(new Person(), new Missile());
	}
}
