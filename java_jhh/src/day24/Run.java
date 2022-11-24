package day24;


public class Run {

	public static void main(String[] args) {
		Money m = new Money();
		m.setMoney(10000);
		m.print();
	}

}
class Money {
	public static final String UNIT = "원";
	public int money;
	
	public void Money(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public static String getUnit() {
		return UNIT;
	}
	public void print() {
		System.out.println(money + UNIT + "");
	}
}