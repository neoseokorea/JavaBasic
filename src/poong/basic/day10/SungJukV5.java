package poong.basic.day10;

import poong.basic.sungjuk.SungJukVO;

import java.util.Scanner;

//인터페이스를 이용해서 성적 프로그램 작성
public class SungJukV5 {

    public static void main(String[] args) {
        /*
            클래스를 대한 객체 생성하기
            클래스명 객체명 = new 클래스명();

            상속을 받은 클래스에 대한 객체 생성하기
            클래스명 객체명 = new 클래스명()
            부모클래스명 객체명 = new 자식클래스명() (!!)
                Cat c = new Cat() 보다는
                    (-> 이렇게 하면 Dog 클래스를 받을 수 없다)
                Animal cd = new Cat() 이 낫다.
                cd = new Dog()
                왜냐면 cd는 변수 한 개로 두 개의 클래스를 받을 수 있기 때문에.

            인터페이스를 구현한 클래스 객체 생성하기
            인터페이스명 객체명 = new 클래스명();
         */

        //
        SungJukV5Service sjsrv = new SungJukV5ServiceImpl();

        //성적 데이터 입력받기
        SungJukVO sj = sjsrv.readSungJuk();

        //입력받은 성적데이터를 처리함
        sjsrv.computeSungJuk(sj);

        //처리된 성적데이터 출력하기
        sjsrv.printSungJuk(sj);

    }
}//public class SungJukV5


//성적처리와 관련된 메시지를 따로 뽑아 인터페이스로 구현
//보통 인터페이스의 명명법은 이름 끝에 서비스를 추가함
interface SungJukV5Service {

    SungJukVO readSungJuk();
    void computeSungJuk(SungJukVO sj);
    void printSungJuk(SungJukVO sj);
    void displayMenu();
}//interface SungJukV5Service


//인터페이스를 구현한 클래스는 클래스 이름 끝에 impl이라는 접미사를 붙이는 것이 관행
class SungJukV5ServiceImpl implements SungJukV5Service {

//    public static SungJukV5Service getInstance() {
//
//        //////////////////////////////////////////////////////////////////////////////////////////////////////
//    }

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
            default: sj.setGrd('우'); break;
        }//swich

    }//public void computeSungJuk()

    @Override
    public void printSungJuk(SungJukVO sj) {
        String fmt = "%s %d %d %d  \n %d %.1f %c\n";
        System.out.printf(fmt,
                sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                sj.getTot(), sj.getAvg(), sj.getGrd());

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

    }
}