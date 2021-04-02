package poong.basic.exam01;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService libsrv = LibraryServiceImpl.getInstance();


        String menu = "";
        while (true) {
            libsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": libsrv.newLibrary();
                    break;
                case "2": libsrv.showLibrary();
                    break;
                case "3": libsrv.showOneLibrary();
                    break;
                case "4": libsrv.modifyLibrary();
                    break;
                case "5": libsrv.removeLibrary();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력함.");
            }//switch

        }//while


    }
}
