package fruit;

public class FruitTest {

	public static void main(String[] args) {

		FruitBuyer  buyer = new FruitBuyer(10000);
		
		FruitSeller seller_lower = new FruitSeller(100, 200, 0);
		FruitSeller seller_higher = new FruitSeller(500, 100, 0);
		
		
		buyer.buyFruit(seller_lower, 1000);
		System.out.println("buyer info");
		buyer.printBuyer();
		System.out.println("seller_lower info");
		seller_lower.printSeller();
		
		buyer.buyFruit(seller_higher, 5000);
		System.out.println("buyer info");
		buyer.printBuyer();
		System.out.println("seller_higher info");
		seller_higher.printSeller();
		
		
	}

}
