package poong.basic.day05;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//switch
//둘 이상의 조건의 결과에 따라 명령문을 선택적으로 실행하도록 하는 제어문
//
//switch(상수 ) {
//case 상수1: 실행문1: break;
//case 상수2: 실행문2: break;
//case 상수3: 실행문3: break;
//default: 실행문4;		
//}
		
		//시간을 입력하면 시간을 의미하는 단어를 출력하는 프로그램
		
		int daytime;
		String result = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("시간을 입력하세요 : ");
		daytime = sc.nextInt();
		
//		if(daytime >= 7 && daytime < 12)
//			result = "morning hours";
//		else if...
		// 조건이 많은 경우 if ~ else if는 복잡해짐.
		
		//switch문은 낙하형으로 케이스 체크
		switch(daytime) { 
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
				result = "morning hours";
				break;
			case 12:
				result = "noon";
				break;
			case 13: case 14: case 15: case 16: case 17:
			case 18:
				result = "afternoon hours";
				break;
			case 19: case 20:
				result = "evening hours";
				break;
			case 21: case 22: case 23:  
				result = "night hours";
				break;
			case 24:
				result = "midnight";
				break;
			case 1:case 2:case 3:case 4:
				result = "early morning hours";
				break;
			case 5:case 6:  
				result = "dawn";
				break;
		}

		System.out.println(result);
		

	}//main

}
