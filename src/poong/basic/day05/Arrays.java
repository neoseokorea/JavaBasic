package poong.basic.day05;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		// 배열
		// 같은 종류의 여러 개의 데이터를 저장하는 자료형
		// 배열을 구성하는 각 값들은 요소element라고 하고
		// 해당 요소의 위치는 index라는 숫자값으로 지정 
		// 배열의 index는 0부터 시작함.
		// 1차원 ~ 3차원까지 배열까지 생성 가능.
		// 배열 생성시 몇 개의 요소를 저장할 것인지 갯수를 미리 지정해야 함.
		
		// 자료형 선언 방법 
		//		자료형[] 배열변수; (추천)
		// 		자료형 배열변수[];
		
		// 초기화
		// 배열변수 = new 자료형[갯수];
		
		// ************************************************************************
		// 회원정보(uid, pwd, age)를 저장하는 배열ㅇ 생성
		String[] uid;
		String[] pwd;
		int[] age;
		
		uid = new String[3]; //3명분의 아이디를 저장할 수 있는 배열변수 생성
				//new : 참조형 객체를 생성하라는 의미의 연산자. 
				//기본 자료형 객체는 변수가 실제 값을 저장함. 
				//반면 참조 자료형(교재129) 객체는 변수에 그 값의 위치(주소)가 저장됨.
					//참조형 변수는 STACK 영역에 저장된다.
					//참조형 변수를 출력하면 그 변수가 저장된 곳(HEAP 영역)의 시작번지가 출력됨.
				//jvm의 메모리 구조
					//스택 : 일반적인 변수가 선언될 때 사용하는 공간.
					//		기본자료형/참조자료형 변수들이 주로 사용. 
					//힙 : 객체형 자료(인스턴스)가 저장되는 공간. 
					//		즉 프로그램에서 new 연산자를 사용하여 객체가 만들어지면 해당 객체의 정보를 여기에 저장. 
					// 		저장된 객체의 위치값은 스택의 생성된 변수에 저장.
		
		
		pwd = new String[3]; //3명분의 비번을 저장할 수 있는 배열변수 생성
		age = new int[3]; //3명분의 나이를 저장할 수 있는 배열변수 생성
		
		// 확인
		System.out.println(uid);
		System.out.println(pwd);
		System.out.println(age);

		// 배열 요소 다루기
		// 배열명[인덱스] = 값; 		//배열에 값 저장.
		uid[0] = "abc123";
		uid[1] = "abc987";
		uid[2] = "abc456";
			
		//배열의 요소를 출력하려면 배열명[인덱스] 형태의 사용
		for (int i=0; i<3; i++) {
			System.out.println(uid[i]);
		}
		
		// ************************************************************************
		//1~45사이 임의의 숫자 6개를 출력하는 프로그램 작성 V1
		//임의의 숫자를 생성 : 난수random
		//Random 클랙스를 이용하면 원하는 형태의 난수를 생성 가능.
		
		int[] lotto = new int[6];         // 배열변수 생성
		
		//난수표를 이용해서 난수 생성
		Random rnd = new Random(); 
		
//		lotto[0] = rnd.nextInt(45) + 1;
//		lotto[1] = rnd.nextInt(45) + 1;
//		lotto[2] = rnd.nextInt(45) + 1;
//		lotto[3] = rnd.nextInt(45) + 1;
//		lotto[4] = rnd.nextInt(45) + 1;
//		lotto[5] = rnd.nextInt(45) + 1;

		for(int i=0 ; i < 6 ; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
		}//for

		//nextInt(경계) : 0 ~ 경계-1 범위의 난수를 생성.
		//nextInt(45) => 0 ~ 44
		
		//출력
		for(int i=0 ; i < 6 ; i++) {
			System.out.println(lotto[i]);
		}//for
		
	}//main

}
