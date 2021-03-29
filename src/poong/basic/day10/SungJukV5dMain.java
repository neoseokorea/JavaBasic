package poong.basic.day10;

import poong.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5dMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukV5Service sjsrv = new SungJukV5ServiceImpl();  //원래 적상작동하는 코드
//        SungJukV5Service sjsrv = SungJukV5Service.getInstance();

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
}
