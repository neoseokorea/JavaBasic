package poong.basic.day03;

public class TestCast {
	public static void main(String[] args) {

//	byte x = 1; // byte자료형은 1 byte(8bit) 크기 
//	byte y = 2;
//	byte z = x + y; 

//	byte x = 1; // byte자료형은 1 byte(8bit) 크기 
//	byte y = 2;
//	byte z = (byte) (x + y);
	
	int x = 1;
	int y = 2;
	int z = x + y; 
	
	System.out.println("x + y = " + z);
	
	// 성적처리시 적절하게 평균 계산하기
	int kor = 98;
	int eng = 78;
	int mat = 45;

//	double avg = (kor + eng + mat) / 3;
//	System.out.println("평균은 " + avg + " 입니다.");
//
//	double avg = (kor + eng + mat) / 3.0;
//	System.out.println("평균은 " + avg + " 입니다.");

	double avg = (double) (kor + eng + mat) / 3;
//		System.out.println("평균은 " + avg + " 입니다.");
	String fmt = "평균은 %.1f 입니다.";
	System.out.printf(fmt, avg);
	
	}
}
