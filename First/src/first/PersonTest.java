package first;

public class PersonTest {

	public static void main(String[] args) {

		 //int i = 10;
		
		Person personA = new Person();
		Person personLee = new Person("이승기", 180, 85);
		Person personKim = new Person("김수현");
		
		System.out.println(personA);
		personA.printThis();
		
		System.out.println(personLee);
		personLee.printThis();
		
		
		
		
		//personA.name = "Lee";
		//personA.setHeight(180);
		//personA.setWeight(90);
		
		System.out.println(personA.name + "," + personA.getHeight()
				+ "," + personA.getWeight());
		
		
		
		String name = personLee.name;
		int height = personLee.getHeight();
		int weight = personLee.getWeight();
		
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
	}

}
