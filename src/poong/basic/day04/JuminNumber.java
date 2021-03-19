package poong.basic.day04;

public class JuminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성하세요.
		// charAt을 이용해서 풀어보세요.
		String jumin = "123456-3234567";
		char jumin2 = jumin.charAt(7); // 8번째 자리이므로
		System.out.println("주민번호뒷자리의 첫자리 = " + jumin2);
		System.out.println
		         (jumin2 == '1' ? "1999년 이전 출생 남자"
				: jumin2 == '2' ? "1999년 이전 출생 여자" 
				: jumin2 == '3' ? "2000년 이후 출생 남자" 
				                : "2000년 이후 출생 여자");
		System.out.println("-------------------------");


	}

}
