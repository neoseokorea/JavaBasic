package poong.basic.day05;

import java.util.Scanner;

public class Ex_LeapYear { //실습문제27

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 윤년 계산
//지구의 공전주기와 자전주기의 불일치로 발생
//공전주기 : 365.24일
//자전주기 : 0.24일
//이 둘 간의 오차 때문에 4년마다 하루를 추가하는 방법으로 오류를 보정함.
//조건)
//1. 4로 나누어 떨어지지만 100으로는 나누어 떨어지지 않는 해.
//2. 단, 400으로 나눠 떨어지면 윤년.
		
		int year;
		boolean leapYear = false;
		Scanner year_input = new Scanner(System.in);
		
		//입력
		System.out.print("연도를 입력하세요 : ");
		year = year_input.nextInt();

		//처리
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

		//출력
		System.out.printf("%s년은 ",year);
		if(leapYear)
			System.out.printf("윤년입니다.");
		else
			System.out.printf("윤년이 아닙니다(평년입니다). ");
			
	}

}
