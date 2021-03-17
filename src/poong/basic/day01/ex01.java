package poong.basic.day01;

/**
 * 
 * @author User 연습문제 실습
 */
public class ex01 {
	public static void main(String[] args) {

		// 1.
		System.out.println("                                                                            ");
		System.out.println("☆    ☆      ☆☆      ☆☆☆☆    ☆☆☆☆     ☆      ☆      /////      ");
		System.out.println("☆    ☆    ☆    ☆    ☆      ☆  ☆      ☆   ☆      ☆    │ o o │    ");
		System.out.println("☆☆☆☆  ☆        ☆  ☆☆☆☆    ☆☆☆☆       ☆  ☆     (│  ^  │)   ");
		System.out.println("☆    ☆  ☆☆☆☆☆☆  ☆     ☆   ☆      ☆       ☆        │ [_] │    ");
		System.out.println("☆    ☆  ☆        ☆  ☆      ☆  ☆       ☆      ☆          -----      ");
		System.out.println("                                                                            ");
		System.out.println("              ┌─┐                                                        ");
		System.out.println("              │  │                                                        ");
		System.out.println("          ┌─┼─┤                                                        ");
		System.out.println("          │  │  │                                                        ");
		System.out.println("      ┌─┼─┼─┤    /\\___/\\  ┌------┐                                 ");
		System.out.println("      │  │  │  │   ( '  ' )  / Hello  ＼                                ");
		System.out.println("  ┌─┼─┼─┼─┤   (  --  ) <  Junior  │                               ");
		System.out.println("  │  │  │  │  │   │ │ │  ＼ Coder! /                                ");
		System.out.println("  └─┴─┴─┴─┘   (__│__)   └------┘                                ");
		System.out.println("                                                                            ");

		// 3.

		// 4.
		// 표현식 : expression
		// 계산이나 처리를 위해 작성하는 식
		// 수학에서 말하는 수식과 유사
		// 표현식의 중요한 특징은 평가evaluate임
		// 즉, 코드의 결과를 알아내는 과정을 의미.

		int x, y, z, s0, v0, t, g;
		int result;

		x = 10;
		y = 20;
		z = 30;
		s0 = 10;
		v0 = 10;
		t = 15;
		g = 20;

		result = 3 * x;
		System.out.print("3x = ");
		System.out.println(result);

		System.out.print("(x + y) / 7 = ");
		System.out.println((x + y) / 7);

		result = (3 * x + y) / (z + 2);
		System.out.print("(3 * x + y) / ( z + 2 ) = ");
		System.out.println(result);

		result = s0 + v0 * t + 1 / 2 * g * t ^ 2;
		System.out.print("s0 + v0 * t +  1/2 * g * t ^ 2 = "); // 제곱
		System.out.println(result);

		// 5.

		double number = (1 / 3) * 3; // 예상값은 1, 실제값은 0.0
		System.out.println("(1 / 3) = " + (1 / 3)); // 정수 / 정수 = 정수
		System.out.println("(1 / 3) * 3 = " + number); // 묵시적 형 변환 (문자+수 => 문자)

		int quotient = 7 / 3;
		System.out.println("7/3 = " + quotient);

		int remainder = 7 % 3;
		System.out.println("7%3 = " + remainder);

		result = 11;
		System.out.println("result = " + result);
		result /= 2;
		System.out.println("result /= " + result);

		// 복합 대입 연산자
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 ☞ a += 1

	}

}
