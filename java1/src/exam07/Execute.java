package exam07;

public class Execute {

	public static void main(String[] args) {
		VendingMachine vm = new DrinkVendingMachine();
		VendingMachine vm2 = new TissueVandingMachine();
		vm.insertMoney(1000);
		vm.clickButton(new Coke());
		Drink d = vm.getDrink();
		System.out.println(d.getName() + "�� ���ְ� ���ʴϴ�.");
		vm.clickButton(new Fanta());
		d = vm.getDrink();
		
		System.out.println(d.getName() + "�� ���ְ� ���ʴϴ�.");
	}
}
