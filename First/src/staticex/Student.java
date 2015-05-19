package staticex;

public class Student {
	
	public String studentName;
	public String studentAddress;
	private String studentMajor;
	private int studentNumber;
	
	static int studentCode = 1000;
	
	public Student(){
		this("이름없음", "주소없음", "학과없음");
	}
	
	public Student(Student student){  
		
		this.studentName = student.studentName;
		this.studentAddress = student.studentAddress;
		this.studentMajor = student.studentMajor;
		this.studentNumber = student.studentNumber;
		
		//initStudentNumber();
	}
	
	public Student(String studentName, String studentAddress, String studentMajor){
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentMajor = studentMajor;
		
		initStudentNumber();
	}
	
	public void initStudentNumber(){
		studentCode++;
		this.studentNumber = studentCode;
	}

	public int getStudentNumber() {
		return studentNumber;
		//return studentCode++;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	public static int getStudentCode() {
		return studentCode;
	}

	public static void setStudentCode(int studentCode) {
		Student.studentCode = studentCode;
	}

	public void getInfomation() {
		System.out.println(studentName + "," + studentAddress + "," + studentMajor);
	}
}
