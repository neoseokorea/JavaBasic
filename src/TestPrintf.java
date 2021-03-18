
public class TestPrintf {
	public static void main(String[] args) {
		int x = 5;
		double pi = 3.14;

		// 4개의 출력문을 사용
		System.out.print("가. x = ");
		System.out.print(x);

		System.out.print(" and pi = ");
		System.out.println(pi);

		// 연산자를 이용해서 2개의 출력문을 사용
		System.out.print("나. x = " + x);
		System.out.println(" and pi = " + pi);

		// printf 메서드를 이용해서 1개의 출력문을 사용
		// 형식 지정자 : 특정 문자열 내에 출력할 대상과 모양을 지정하는데 사용되는 특수한 문자
		// %d : decimal, 정수를 표기할 때 이용
		// %f : float, 실수를 표기할 때 이용
		// %c : character, 문자 하나를 표기할 때 이용
		// %s : string, 문자열을 표기할 때 이용
		System.out.printf("다. x = %d and pi = %f \n", x, pi);
		System.out.println("출력 완료");

		// 실무에서는 코드를 깔끔하게 보이도록 하기 위해 아래와 같은 형식을 권장한다.
		String fmt = "다. x = %d and pi = %f \n";
		System.out.printf(fmt, x, pi);

	}

}
