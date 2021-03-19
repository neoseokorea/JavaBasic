package poong.basic.day04;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		
		
		
		
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1
		int i = 1;
		for (i = 1; i <= 9; i++) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		System.out.println("-------------------------");

		// ex) 7단을 출력하세요 v3 - while, printf 이용
		String fmt = "7 * %d = %d \n";
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, i, 7 * i);
			i++;
		}
		System.out.println("-------------------------");

		
		
		
		
		// ex) 3단을 출력하세요 v3
		i = 1;
		int ii = 3; // 3단
		for (i = 1; i <= 9; i++) {
			System.out.println(ii + " * " + i + " = " + ii * i);
		}
		System.out.println("-------------------------");

		// ex) 3단을 출력하세요 v3 - while, printf 이용
		fmt = "%d * %d = %2d \n"; // 답의 자리수를 두 자리로 맞춤
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, ii, i, ii * i);
			i++;
		}
		System.out.println("-------------------------");

		
		
		
		
		/// 구구단 프로그램 v1
		// 사용자로부터 숫자(1-9)를 하나 입력 받아 구구단을 출력
		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해 Scanner 클래스를 초기화함.
		System.out.println("몇 단을 입력할까요?");
		ii = sc.nextInt();
		fmt = "%d * %d = %2d \n"; // 답의 자리수를 두 자리로 맞춤
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, ii, i, ii * i);
			i++;
		}
		System.out.println("-------------------------");

		
		
		
		
		/// 구구단 프로그램 v2
		// 사용자로부터 숫자(1-9)를 하나 입력 받아 구구단을 출력
		// 문자도 입력 가능.
//		System.out.println("몇 단을 입력할까요(문자 입력 가능)? ");
//		String ii_char = sc.next().charAt(0); // 입력값 중 첫글자(index가 0)만 취함
//		ii = Integer.parseInt(ii_char);
//		// ii = (int) ii_char;
//		// 입력받은 문자의 ascii값이 49~57인지 검사
//		String result = (ii >= 49 && ii <= 57) ? "구구단 출력 가능" : "잘못 입력됨";
//		try {
//			System.out.printf(fmt, ii, i, ii * i);
//			System.out.println("-------------------------");
//		} catch(Exception ex) {
//			System.out.println("입력 오류");
//		}
		// 예외처리코드(try-catch)를 이용해서
		// 프로그램 실행중 오류시

		
		
		
		

	}
}
