package poong.basic.day04;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {

		// 조건문
		// 일반적으로 프로그램의 실행 순서는 순차적sequential.
		// 하지만, 특수한 상황이 발생시 선택적으로 코드를 실행해야할 필요가 있는데 이 때 조건물을 사용함.

		// if
		// 조건식의 결과가 true와 false일 때
		// 각각 주어진 명령문을 실행함.
		
		//	if (조건식) {
		//     
		//	} else {
		//		
		//	}
		
		// ex) 1~100사이의 정수 중 짝수를 출력하세요.
				for (int i = 1; i <= 100; ++i) {
					if (i % 2 == 0)  
						System.out.print(i +" ");
				}
				System.out.println();
				

		// ex) 1~100사이의 정수 중 짝수를 출력하세요.
				for (int i = 1; i <= 100; ++i) {
					if (i % 2 == 0)   
						System.out.println(i +"는 짝수입니다.");
					else
						System.out.println(i +"는 홀수입니다.");
				}
		
		// 사용자가 연봉과 결혼 여부를 입력하면
		// 다음의 세금율에 의해 납부해야할 세금을 계산하는 프로그램을 작성하세요.
		// 미혼인 경우 : 연봉 3000미만 - 10%, 연봉 3000이상 - 25%
		// 기혼인 경우 : 연봉 6000미만 - 15%, 연봉 6000이상 - 35%		
				
		int salary = 0;
		int isMarried;
		float tax;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		
		System.out.print("결혼 여부를 입력하세요(1 or 0) : ");
		isMarried = sc.nextInt();

		System.out.print("연봉을 입력하세요(만원) : ");
		salary = sc.nextInt();
		
		if (isMarried == 1) { 	//기혼인 경우
			if (salary >= 6000) {	// 연봉 6000이상
				tax = (float) (salary * 0.35);
			} else {				// 연봉 6000미만
				tax = (float) (salary * 0.15);
			}
		} else {				//미혼인 경우
			if (salary >= 3000) {	// 연봉 3000이상
				tax = (float) (salary * 0.25);
			} else {				// 연봉 3000미만
				tax = (float) (salary * 0.10);
			}
		}
		//세금 출력
		System.out.println("세금은 "+ tax + "만원입니다.");
		System.out.printf("세금은 %.1f만원입니다. \n", tax);
		//System.out.printf("세금은 %1111.1f만원입니다. \n", tax);
		String fmt = "\"세금은 %.1f만원입니다. \\n\", tax";
		System.out.printf(fmt, tax);
	} //main
}
