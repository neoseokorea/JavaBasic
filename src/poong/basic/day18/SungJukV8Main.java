package poong.basic.day18;

import poong.basic.sungjuk.SungJukServiceV4Impl;
import poong.basic.sungjuk.SungJukServiceV4;

import java.util.Scanner;

public class SungJukV8Main {

    /*
        성적처리 프로그램 V - ArrayList + 텍스트기반스트림 + CRUD

        입력한 성적데이터를 DBMS를 이용해서 관리함.
        따라서 프로그램을 종료해도 데이타가 유지됨.

        단, 프로그램의 복잡도를 낮추기 위해
        새로운 프래그래밍 패턴 도입 : 3 Layer architecture
        프리젠테이션 - 비즈니스 로직 - 데이터 액세스
                       ~Service       ~DAO

        SungJukServiceV4 업데이트 내용
        JDBCUtil (JDBC 관련 정보 및 객체 생성)
        SungJukDAO ())  (insertSungJuk, selectSungJuk

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV4 sjsrv = SungJukServiceV4Impl.getInstance();


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
                case "0":   System.exit(0);
                    break;
                default:    System.out.println("잘못 입력함.");
            }//switch

        }//while

    }//main

}//public class SungJukV6Main {
