package poong.basic.day04;

import java.util.Scanner;

public class SungJukV2 {

	public static void main(String[] args) {
		// 성적 처리 프로그램 V2
		// 반복문을 이용해서 성적데이터 입력을 계속 수행합니다.
		
		// 변수선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grd;
		String fmt = "%s, %2d, %2d, %2d \n" +
					 "%d, %.1f, %c \n";
		Scanner sc = new Scanner(System.in);
		
		// 처리
		int i = 1;
		
		while (i <= 3 ) {	// 조건식을 true로 설정하면 무한 반복됩니다.
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat = sc.nextInt();
	
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			grd = 	(avg >= 90) ? '수' :
					(avg >= 80) ? '우' :
					(avg >= 70) ? '미' :
					(avg >= 60) ? '양' : '가';
			
			// 결과 출력
			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
			
			i++;
		} //while의 종료

	} //main

} //class
