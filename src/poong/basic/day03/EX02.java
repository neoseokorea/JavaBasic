package poong.basic.day03;

public class EX02 {
	public static void main(String[] args) {

		System.out.print("'A' = ");
		System.out.println('A');
		System.out.print("'A' + '0' = ");
		System.out.println('A' + '0');
		System.out.print("'A' + 0 = ");
		System.out.println('A' + 0);
		System.out.print("0 + 'A' = ");
		System.out.println(0 + 'A');

		System.out.println("=============== 7번 문제 ===============");

		// 문제 7.
		System.out.print("가. 3 + 4.5 * 2 + 27 / 8 = ");
		System.out.print("가. 3 + 4.5 * 2 + 27 / 8 = ");
		System.out.println(3 + 4.5 * 2 + 27 / 8);

		System.out.print("나. true || false && 3 < 4 || !(5 == 7) = ");
		System.out.println(true || false && 3 < 4 || !(5 == 7));

		System.out.print("다. true || (3 < 5 && 6 >= 2) = ");
		System.out.println(true || (3 < 5 && 6 >= 2));

		// 잘못된 비교 대상으로 오류 발생
//		System.out.print("라. !true > 'A' = ");
//		System.out.println(!true > 'A'); 

		// 문자열이 아닌 한 글자의 문자는 수식에 사용 가능.
		// 자동으로 ascii 코드값을 가진 숫자형으로
		System.out.print("마. 7 % 4 + 3 - 2 / 6 * 'Z' = ");
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');

		System.out.print("바. 'D' + 1 + 'M' % 2 /3 = ");
		System.out.println('D' + 1 + 'M' % 2 / 3);

		System.out.print("사. 5.0 / 3 + 3 / 3 = ");
		System.out.println(5.0 / 3 + 3 / 3);

		System.out.print("아. 53 % 21 < 45 / 18 = ");
		System.out.println(53 % 21 < 45 / 18);

		System.out.print("자. (4 < 6) || true && false || false && ( 2 > 3) = ");
		System.out.println((4 < 6) || true && false || false && (2 > 3));

		System.out.print("차. 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2) = ");
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));

		// 문제 8.

		System.out.println("================ 8번 문제 ==============");

		System.out.println("가. May 13, 1988 fell on day number");

		// 1988년 직전 해의 마지막 날의 요일은 5번째 요일, 즉 금요일이다.
		System.out.print(
				"나. ((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7 = ");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);

		// 2021년 직전 해의 마지막 날의 요일은 4번째 요일, 즉 목요일이다.
		System.out.print(
				"나. ((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7 = ");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7);

		System.out.print("다. \"  Check out this line \"  = ");
		System.out.println("  Check out this line  ");

		System.out.print("라. \" //hello there \" + '9' + 7 = ");
		System.out.println(" //hello there " + '9' + 7);

		System.out.print("마. 'H' + 'T' + \" is \" + 1 + \"more example\" = ");
		System.out.println('H' + 'I' + " is " + 1 + "more example");

		System.out.print("바. 'H' + 6.5 + 'I' + \" is \" + 1 + \"more example\" = ");
		System.out.println('H' + 6.5 + 'I' + " is " + 1 + "more example");

//		System.out.print("사. \"Print both of us\", \"Me too\" = ");
//		System.out.println("Print both of us", "Me too");

		// H와 I 사이 산술연산자로 인해 +연산이 수행됨.
		System.out.print("아. \"Reverse \" + 'I' + 'T' = ");
		System.out.println("Reverse " + 'I' + 'T');

		System.out.print("자. \"No! Here is\" + 1 + \"more example\" = ");
		System.out.println("No! Here is" + 1 + "more example");

		System.out.print("차. \"Here is \" + 10 * 10 = ");
		System.out.println("Here is " + 10 * 10);
		System.out.print("차. \"Here is \" + 10 + 10 = ");
		System.out.println("Here is " + 10 + 10);

		System.out.print("카. \"Not x is \" + true = ");
		System.out.println("Not x is " + true);

		// 인수가 없어서 에러
//		System.out.print("타.  = ");
//		System.out.print();
//
		// 괄호가 없어서 에러
//		System.out.print("파.  = ");
//		System.out.println;

		// 문자에 대해서는 증감 연산자 사용 불가
//		System.out.print("하. \"How about this one\" ++ '?' + 'Huh?'  = ");
//		System.out.println("How about this one" ++ '?' + 'Huh?' );
		System.out.print("하. \"How about this one\" + '?' + \"Huh?\"  = ");
		System.out.println("How about this one" + '?' + "Huh?");

	}

}
