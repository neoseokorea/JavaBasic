package poong.basic.day16;

import poong.basic.sungjuk.SungJukServiceV3;
import poong.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7Main {

    /*
        성적처리 프로그램 V - ArrayList + 텍스트기반스트림 + CRUD

        입력한 성적데이터를 직렬화를 통해서
        텍스트 기반 파일에 저장
        따라서 프로그램을 종료해도 데이타가 유지됨.

        동적배열을 이용해서 대량의 성적데이터를 저장 가능.
        즉, 입력받은 성적데이터는 동적배열에 저장하고
        저장한 데이터들을 조회/수정/삭제할 수 있도록 함.

        SungJukServiceV3 업데이트 내용
        initSung, saveSungJuk,

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();


        String menu = "";
        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1":   sjsrv.newSungJuk();
                    break;
                case "2":   sjsrv.showSungJuk();
                    break;
                case "3":   sjsrv.showOneSungJuk();
                    break;
                case "4":   sjsrv.modifySungJuk();
                    break;
                case "5":   sjsrv.removeSungJuk();
                    break;
                case "0":   sjsrv.saveSungJuk();
                            System.exit(0);
                    break;
                default:    System.out.println("잘못 입력함.");
            }//switch

        }//while

    }//main

}//public class SungJukV6Main {
