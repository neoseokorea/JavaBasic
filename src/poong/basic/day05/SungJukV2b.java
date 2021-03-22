package poong.basic.day05;

import java.util.Scanner;

public class SungJukV2b {

	public static void main(String[] args) {
		// 성적 처리 프로그램 V2
		// 성적처리시 학점 계산을 switch문으로 처리.
		
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
		
		while (i <= 1 ) {	// 조건식을 true로 설정하면 무한 반복됩니다.
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
//			grd = 	(avg >= 90) ? '수' :
//					(avg >= 80) ? '우' :
//					(avg >= 70) ? '미' :
//					(avg >= 60) ? '양' : '가';
			
			//if를 이용해서 학점 산정한다.
//			if 		(avg >= 60) grd = '양';
//				if  (avg >= 70) grd = '미';
//				if  (avg >= 80) grd = '우';
//				if  (avg >= 90) grd = '수';
//				else grd = '가';
				
			//switch를 이용해서 학점 산정한다.
			switch ((int)avg/10) {
				case 10 : 
					case 9 : grd = '수' ; break;
					case 8 : grd = '양' ; break;
					case 7 : grd = '미' ; break;
					case 6 : grd = '양' ; break;
					default: grd = '가' ;
								
			}
			
			// 결과 출력
			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
			
			i++;
		} //while의 종료

	} //main

} //class
