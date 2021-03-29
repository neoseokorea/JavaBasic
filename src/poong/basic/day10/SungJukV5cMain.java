package poong.basic.day10;

import poong.basic.sungjuk.SungJukService;
import poong.basic.sungjuk.SungJukServiceImpl;
import poong.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5cMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        SungJukV5Service sjsrv = new SungJukV5ServiceImpl();  // 성적처리 인터페이스를 객체 생성함.

        //singleton 패턴을 이용해서 객체 생성
        SungJukService sjsrv = SungJukServiceImpl.getInstance(); //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        /*
           sjsrv는 인스턴스 변수이므로 객체마다 개별적으로 생성됨
            정적 변수로 만들어서 모든 객체가 이것을 공유하도록 변경해야함.
            singleton 패턴을 이용해서 단일 객체로만 생성되도록 제한함.
         */

        String menu = "";
        SungJukVO sj = null;

        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1" :  sj = sjsrv.readSungJuk();
                            sjsrv.computeSungJuk(sj);
                            break;
                case "2" : break;
                case "3" : sjsrv.printSungJuk(sj); break;
                case "4" : break;
                case "5" : break;
                case "0" : System.exit(0); break;
                default:
                    System.out.println("잘못 입력함.");
            }
        }
    }

    private static class SungJukVService {
    }
}
