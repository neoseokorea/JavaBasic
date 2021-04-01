package poong.basic.sungjuk;

//import poong.basic.day10.ServiceTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukServiceV2Impl implements SungJukServiceV2{

    /*
        멤버 변수 선언
        입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언

     */
    List<SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null; //입력받은 데이터 저장소

    //싱글톤 패턴 시작
    private static SungJukServiceV2 sjsrv = null; //<===============

    private SungJukServiceV2Impl() {
    }

    public static SungJukServiceV2 getInstance(){
        if (sjsrv == null) sjsrv = new SungJukServiceV2Impl();
        return sjsrv;
    }





    @Override
    public void displayMenu() {
        String displayMenu =
            "========================================= \n" +
            "              성적 프로그램 V6              \n" +
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
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은 : ");
            String name = sc.next();
            System.out.print("국어는 : ");
            int kor = sc.nextInt();
            System.out.print("영어는 : ");
            int eng = sc.nextInt();
            System.out.print("수학은 : ");
            int mat = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
            //입력받은 성적 데이터를 객체화함.

            computeSungJuk(sj);
            //성적데이터 처리

            sjdata.add(sj);
            //처리된 성적데이터를 동적배열에 저장.

        } catch (Exception ex) {
            System.out.println("잘못 입력했어요.");
            return; //오류 발생시 실행을 중단하고 main으로 복귀.
        }

    }//public SungJuVO readSungJuk()




    /*
        저장된  성적데이터들 중에서
        배열의순번번호(index), 이름, 국어, 영어, 수학만 뽑아서
        목록 형태로 출력함.
     */
    @Override
    public void showSungJuk() {
        String fmt = "번호 : %d, 이름 : %s, 국어 : %d,  영어 : %d, 수학 : %d \n";
        int pos = 0; //배열인덱스

        for (SungJukVO sj : sjdata) {   // <==========================
            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd()
            );
            ++pos;
        }//for

    }//public void showSungJuk() {





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
    public void showOneSungJuk() {
        String fmt = "번호 : %d, 이름 : %s, 국어 : %d,  영어 : %d, 수학 : %d +" +
                "총점 : %d, 평균 : %.1f, 학점 : %c\n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 학생의 번호는? : ");
        int pos = sc.nextInt();

        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd());
        } catch (Exception ex) {
            System.out.println("데이터가 존재하지 않음");
        }
    }//public void showOneSungJuk() {





    @Override
    public void modifySungJuk() {

    }





    @Override
    public void removeSungJuk() {

    }


}