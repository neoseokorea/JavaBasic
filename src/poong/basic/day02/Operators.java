package poong.basic.day02;

public class Operators {
	public static void main(String[] args) {
		
		// 연산자 operator
		// 여러 종류의 연산을 수행하기 위해 제공되는 기호
		// 산술연산, 비교연산, 논리연산, 조건연산자(삼항연산자)
		
		// 산술연산 : 사칙연산을 다루는 연산자
		// +, -, *, /, %
		int x = 30, y = 15; // 변수선언과 동시에 값 초기화를 같이 수행
		
		System.out.println("30+15 연산 " + x + y); //문자+숫자 => 문자
		System.out.println("30+15 연산 " + (x + y)); //문자+숫자 => 문자
		System.out.println("30-15 연산 " + (x - y)); //문자+숫자 => 문자
		System.out.println("30*15 연산 " + (x * y)); //문자+숫자 => 문자
		System.out.println("30÷15 연산 " + (x / y)); //문자+숫자 => 문자
		System.out.println("30 mod 15 연산 " + (x % y)); //문자+숫자 => 문자

		// 비교연산 : 값의 대소를 비교하는 연산자
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교
		// 
		System.out.println("30 > 15 ☞ " + ( x > y));
		System.out.println("30 < 15 ☞ " + ( x < y));
		System.out.println("30 ≠ 15 ☞ " + ( x != y));
		System.out.println("30 = 15 ☞ " + ( x == y));

		// 논리연산 : 주어진 논리식을 판단
		// 논리연산의 결과는 논리값으로 반환
		// 보통 2개 이상의 비교연산식으로 구성됨 
		// 논리곱 연산 : & 또는 && (short-circuit지원)
		// 논리합 연산 : | 또는 ||
		// 논리부정 연산 : !
		boolean result = (x > y) & (x != y);
		System.out.println("(x > y) and (x != y) ☞ " + result);
		
		result = (x > y) && (x != y);
		System.out.println("(x > y) and (x != y) ☞ " + result);

		result = (x > y) | (x != y);
		System.out.println("(x > y) or (x != y) ☞ " + result);

		result = (x > y) || (x != y);
		System.out.println("(x > y) or (x != y) ☞ " + result);

		// 조건 연산자(삼항 연산자)
		// 3개의 피연산자를 이용해서 조건에 따라
		// 특정 피연산자를 취하도록
		// 형식 : 조건식 ? 참일 때 값 : 거짓일 때 값
		String result2 = (x > y) ? "x가 큽니다" : "y가 큽니다" ;
		System.out.println(result2);
		
		
		
		
		System.out.println(5.0/3 + 3/3);

	}

}
