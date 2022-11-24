package day23;

import lombok.Data;

@Data
public class Money {
	public static final String UNIT = "원";
	public int money;
	

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
