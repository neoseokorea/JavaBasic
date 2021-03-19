package poong.basic.day03;

public class Loop {

	public static void main(String[] args) {
		// 반복문loop
		// 프로그램 내에서 똑같은 명령을 지정한 횟수만큼 반복하여 수행하도록 작성하는 명령문
		// 사용빈도가 높은 명령어들 중 하나.
		// for(횟수지정후 반복), while(특정 조건 만족 중)

		// 인사말 출력 v1 - 1번만 출력
		System.out.println("Hello, World!!");

		// 인사말 출력 v1.1 - 3번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");

		// ex) 1~10까지 정수출력 v2
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}

		// ex) 1~50까지 홀수출력 v2
		for (int i = 1; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// ex) 1~50까지 짝수출력 v2.1
		for (int i = 2; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// ex) 1~100까지 총합
		int sum = 0;
		for (int i = 1; i <= 100; ++i) {
			sum += i;
		}
		System.out.println(sum);

		// 가오스 덧셈공식법을 이용해서 1~100까지 총합 구하기
		System.out.println(((100 + 1) * (100 / 2))); // 가오스 연산법 이용

	}
}
