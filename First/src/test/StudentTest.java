package test;

import staticex.Person;
import staticex.Student;
import junit.framework.TestCase;


public class StudentTest extends TestCase{

	public void testStudent(){
		
		Student student = new Student("Tomas", "Seoul", "English");
		assertEquals("Tomas", student.getStudentName());
		
		Student student2 = new Student();
		assertEquals(1002, student2.getStudentNumber());
		
	}
	
	public void testPerson(){
		
		Person person = new Person("Edward");
		assertEquals("Edward", person.getName());
	}
}
