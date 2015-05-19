package jung;
//���� birthday class �����, day month year�ְ���, valid���� invalid���� check
// Birthday(2000, 10, 20);�̷������� ������ true, false, class�� �ΰ� �ϳ��� main�����¿� 
// day, month, year�� �� private
//'������ 4�� ���������鼭 100���� ������ �������� �ʴ� ��.'
//'400���� ������ �������� ��.' 
public class Birthday {
	private int year;
	private int month;
	private int day;
	private boolean checkValid;
	
	public Birthday(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	public boolean birthdayCheck(String birthday){
		if(this.month < 0 || this.month >12)
			System.out.println(birthday + "False");
		else if(this.month == 2){
			if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0){
				if(this.day>0 && this.day<30)
					System.out.println(birthday + "True");
				else
					System.out.println(birthday + "False");
			}
			else{
				if(this.day>0 && this.day<29)
					System.out.println(birthday + "True");
				else
					System.out.println(birthday + "False");
			}
		}
		else if(this.month == 4 ||this.month == 6|| this.month ==9|| this.month == 11){
			if(this.day>0 && this.day<31)
				System.out.println(birthday + "True");
			else
				System.out.println(birthday + "False");
		}
		else{
			if(this.day>0 && this.day<32)
				System.out.println(birthday + "True");
			else
				System.out.println(birthday + "False");
		}
		
	}

}
