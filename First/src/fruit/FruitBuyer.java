package fruit;

public class FruitBuyer {

	private int money;
	private int fruit_count;

	public FruitBuyer(int money){
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getFruit_count() {
		return fruit_count;
	}
	public void setFruit_count(int fruit_count) {
		this.fruit_count = fruit_count;
	}

	public void buyFruit(FruitSeller seller, int money) {
	
		int count = seller.sellFruit(money);
		fruit_count += count;
		this.money -= money;
		
	}

	public void printBuyer() {
		System.out.println("과일 수:" + fruit_count);
		System.out.println("money:" + money);
	}
	
}
