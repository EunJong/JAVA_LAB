package staticex;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.getInfomation(); //이름없음, 주소없음, 학과없음
		
		//Student.studentCode++;
		
		
		Student student2 = new Student("James", "NewYork", "Computer Science");
		student2.getInfomation(); // James, NewYork, Computer Science
	
		Student student3 = new Student(student2);
		System.out.println(student1.getStudentNumber()); // 1001
		System.out.println(student2.getStudentNumber()); // 1002
		System.out.println(student1.getStudentNumber());
	
		
		student3.getInfomation();
		
		
		
		
	}

}
