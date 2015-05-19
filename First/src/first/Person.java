package first;

public class Person {

	public String name;
	private int weight;
	private int height;
	
	public Person(){
	}
	
	public Person(String name){
		this(name, 180, 90);
		
	}
	
	public Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	public String getName() {
		int i = 10;
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight > 200){
			System.out.println("너무 뚱뚱해요"); 
			return;
		}
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void printThis(){
		System.out.println(this);
	}
	
	
	
	
	
}
