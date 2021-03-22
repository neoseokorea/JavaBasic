package poong.basic.day05;

import java.util.Scanner;

public class LogIn {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		키보드로 아이디, 비번을 입력해서
//		로그인 성공 여부를 출력하는 프로그램
//		아이디 : abc123
//		비밀번호 : 987xyz
//처리1
		//		1. 아이디 x, 비번 x - 로그인 실패(아이디비번 틀림)
//		2.  아이디 o, 비번 x - 비밀번호가 틀림
//		3.  아이디 x, 비번 o - 아이디가 틀림
//		4.  아이디 o, 비번 o - 
//처리2
//		입력값에 따른 결과처리가 복잡하므로 단순화시킴
//		즉, 1만 성공 2/3/4는 실패 처리.
//처리3
//		조건식을 and문으로 결합해서 더 단순화시킴.
		
		
		

		// 변수 선언
		Scanner sc = new Scanner(System.in);
		String userid;
		String passwd;
		
		// 아이디 입력 받아 비교하기
		System.out.print("아이디 입력 : ");
		userid = sc.next();
		String result;

		System.out.print("비밀번호 입력 : ");
		passwd = sc.next();

		//1. 조금 복잡한 처리
		if (userid.equals("abc123")) {	//문자열을 비교할 때는 .equals 사용
			if (passwd.equals("987xyz")) {
				result = "로그인 성공!";
			} else {
				result = "비밀번호 오류!";
			}
		} else {
			if (passwd.equals("987xyz")) {
				result = "아이디가 틀립니다!";
			} else {
				result = "하나도 안 맞아!";
			}
		}
		System.out.println(result);
		
		//2. 단순한 처리
		if (userid.equals("abc123")) 	//문자열을 비교할 때는 .equals 사용
			if (passwd.equals("987xyz")) 
				result = "로그인 성공!";
			 else 
				result = "로그인 실패";
		else 
				result = "로그인 실패";
		
		System.out.println(result);

		//3. 더 단순한 처리
		if (userid.equals("abc123") && passwd.equals("987xyz")) 
				result = "로그인 성공!";
		else 
				result = "로그인 실패";
		
		System.out.println(result);

		
	}//main

}//class
