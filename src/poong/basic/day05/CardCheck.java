package poong.basic.day05;

import java.util.Scanner;

public class CardCheck { //실습문제33
//	임의의 숫자 6자리를 입력하면 신용카드의 종류와 은행정보를
//	출력하는 프로그램을 작성해보세요.  (CardCheck)
//문자열.charat(자릿수): 지정한 자릿수의 문자하나 추출
//문자열.substring(시작, 끝): 지정한 시작위치에서 끝-1위치의 문자들 추출
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//변수
		String code;	//필요한 은행코드
		char code2;
		String codeName = null;
		String codeBank = null;
		
		//입력받기
		System.out.print("카드 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);

		//처리
		code = sc.next();
		code2 = code.charAt(0);

		switch(code2) {
			case '3' : codeName = "JCB카드"; break;
			case '4' : codeName = "비자카드"; break;
			case '5' : codeName = "마스타카드"; break;
		}

		switch(code) {
		case "356317" : codeBank = "NH농협카드"; break;
		case "356901" : codeBank = "신한카드"; break;
		case "356912" : codeBank = "KB국민카드"; break;
		case "404825" : codeBank = "비씨카드"; break;
		case "438676" : codeBank = "신한카드"; break;
		case "457973" : codeBank = "국민은행"; break;
		case "515594" : codeBank = "신한카드"; break;
		case "524353" : codeBank = "외환카드"; break;
		case "540926" : codeBank = "국민은행"; break;
		}

		
		//출력
		System.out.println("입력된 값 : " + code);
		System.out.println("첫자리 : " + code2);
		System.out.println(codeName + " / " + codeBank);

	}

}
