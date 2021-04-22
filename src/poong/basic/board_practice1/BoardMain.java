package poong.basic.board_practice1;

import java.util.Scanner;

public class BoardMain {

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
