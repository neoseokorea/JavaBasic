package poong.basic.sungjuk;

//import poong.basic.day10.ServiceTwo;

import java.util.Scanner;

public class SungJukServiceImpl implements SungJukService{

    private static SungJukService sjsrv = null;

    private SungJukServiceImpl() {
    }

    public static SungJukService getInstance(){
        if (sjsrv == null) sjsrv = new SungJukServiceImpl();
        return sjsrv;
    }

    @Override
    public void displayMenu() {
        String displayMenu =
            "========================================= \n" +
            "              성적 프로그램 V3              \n" +
            "========================================= \n" +
            "          1. 성적 데이터 입력 \n" +
            "          2. 성적 데이터 조회 \n" +
            "          3. 성적 데이터 상세조회 \n" +
            "          4. 성적 데이터 수정 \n" +
            "          5. 성적 데이터 삭제 \n" +
            "          0. 프로그램 종료 \n" +
            "========================================= \n" +
            "작업을 선택하세요 : ";
        System.out.print(displayMenu);

    }//public void displayMenu()

    @Override
    public SungJukVO readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름은 : ");
        String name = sc.next();
        System.out.print("국어는 : ");
        int kor = sc.nextInt();
        System.out.print("영어는 : ");
        int eng = sc.nextInt();
        System.out.print("수학은 : ");
        int mat = sc.nextInt();

        return new SungJukVO(name, kor, eng, mat);

    }//public SungJukVO readSungJuk()

    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setAvg( (double) sj.getTot() / 3);

        //학점 산정
        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가'); break;
        }//swich

    }//public void computeSungJuk(SungJukVO sj)

    @Override
    public void printSungJuk(SungJukVO sj) {
        String fmt = "이름: %s 국어: %d 영어: %d 수학: %d\n총점: %d 평균: %.1f 학점: %c\n";
        System.out.printf(fmt,
                sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                sj.getTot(), sj.getAvg(), sj.getGrd());
    }//public void printSungJuk(SungJukVO sj)


//    private static SungJukServiceImpl stwo;
//
//
//    public static SungJukServiceImpl getInstance(){ //static 누락 없게 주의!!
//        if (stwo == null) stwo = new SungJukServiceImpl();
//        return stwo;
//    }


}