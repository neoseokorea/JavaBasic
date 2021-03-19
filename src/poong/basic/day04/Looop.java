package poong.basic.day04;

public class Looop {
	public static void main(String[] args) {
		// while
		// 특정 조건을 만족하는동안에만 수행
		// 초기식
		// while(조건식) {
		// 반복코드
		// 증감식
		// }
		
		// 조건식이 처음부터 false면 while은 코드를 반복실행하지 않음.
		// 반면, do-while문은 일단 코드를 먼저 실행하고 조건을 검사하기 때문에
		// 조건식이 false라도 최소 한 번은 코드가 실행됨.
		
		
		
		

		// ex) 1~10까지 정수 출력
		int i = 1; // 초기식
		while (i <= 10) { // 조건식
			System.out.print(i + " "); // 처리
			i++; // 증감식
		}
		System.out.println();

		// ex) 1~50까지 짝수 출력
		i = 2; // 초기식
		while (i <= 50) {
			System.out.print(i + " ");
			i += 2; // 증감식
		}
		System.out.println(""); // 줄 바꿈용 코드

		// ex) 1~100까지 총합 출력
		i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			++i;
		}
		System.out.println(sum); // 처리

		// 가오스 덧셈법 이용
		i = 1; // 시작 숫자
		int j = 100; // 끝 숫자
		sum = 0;
		sum = (i + j) * (j - i + 1) / 2;
		System.out.println(sum);

	}
}
 