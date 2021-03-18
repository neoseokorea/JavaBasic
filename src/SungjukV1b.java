import java.util.Scanner;

/**
 * 
 * @author poong
 * @category javabasic
 * @version 1.0 자바프로그램 기초
 *
 *          자바 기초 프로그램 - 성적처리 프로그램 입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 출력 : 이름,
 *          국어, 영어, 수학, 총점, 평균, 학점
 * 
 *          이름과 성적데이터를 키보드로 직접 입력받아 처리 처리 결과 출력시 printf 메서드를 이용ㅇ *
 */
public class SungjukV1b {
	public static void main(String[] args) {
		// 변수 선언
		String name; // 이름
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		char grd;

		// 처리
		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해 Scanner 클래스를 초기화함.

		System.out.println("이름은?");
		name = sc.next(); // 키보드로 문자데이터를 입력받아 name 변수에 대입.
		System.out.println("국어점수는?");
		kor = sc.nextInt();
		System.out.println("영어점수는?");
		eng = sc.nextInt();
		System.out.println("수학점수는?");
		math = sc.nextInt();
		total = kor + eng + math;
		avg = total / 3;
		grd = '우';

		// 출력 형태 #1
		System.out.println("------- 결과 #1 ----");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + grd);

		// 출력 형태 #2
		System.out.println("------- 결과 #2----");
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f, 학점: %s \n", name, kor, eng, math, total, avg,
				grd);
		// 출력 형태 #3
		System.out.println("------- 결과 #3----");
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.1f, 학점: %s \n", name, kor, eng, math, total,
				avg, grd);
	}
}
