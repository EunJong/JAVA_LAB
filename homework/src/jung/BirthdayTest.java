package jung;

public class BirthdayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday myBday = new Birthday(1998,12,16);
		Birthday tomBday = new Birthday(2014,2,29);
		Birthday JunBday = new Birthday(2040,2,29);
		Birthday JuliaBday = new Birthday(2000,2,29);
		myBday.birthdayCheck("My birthday is ");
		tomBday.birthdayCheck("Tom's birthday is ");
		JunBday.birthdayCheck("Jun's birthday is ");
		JuliaBday.birthdayCheck("Julia's birthday is ");

	}


}
