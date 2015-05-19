package fruit;

public class FruitSeller {

	private int price;
	private int numberOfFruit;
	private int money;
	
	public FruitSeller(int price, int numberOfFruit, int money){
		this.price = price;
		this.numberOfFruit = numberOfFruit;
		this.money = 0;
	}

	public void printSeller(){
		System.out.println("남은 과일 수:" + numberOfFruit);
		System.out.println("money:" + this.money);
	}

	public int sellFruit(int money) {
		
		int count = money / price;
		this.money += money;
		this.numberOfFruit -= count;
		
		return count;
		
	}
}
