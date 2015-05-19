package staticex;

class MyStatic{
	
	int iNum;  			//instance variable
	static int sNum;  // class variable, static variable
	
	
	public static void getMyNum(){
		int k = 10;
		//System.out.println(iNum);
		System.out.println(sNum);
	}
}

public class StaticTest {

	public static void main(String[] args) {

		//MyStatic ms1 = new MyStatic();
		//ms1.iNum = 10;
		MyStatic.sNum = 100;
		MyStatic.getMyNum();
		
		//System.out.println(ms1.iNum);
		//System.out.println(MyStatic.sNum);
		
		
		//MyStatic ms2 = new MyStatic();
		//System.out.println(ms2.iNum);
		System.out.println(MyStatic.sNum);
		
	}

}
