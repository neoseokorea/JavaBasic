package poong.basic.day04;

public class Ex_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 윤년 계산
		//
		int year = 101;
		boolean leapYear = false;

		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

		System.out.println(year);
		System.out.printf("%b", leapYear);
	}

}
