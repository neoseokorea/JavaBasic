package poong.basic.lab;

import java.util.Scanner;

public class EmployeeV1Main {

    public static void main(String[] args) {

        //사원정보를 입력받아 동적배열에 저장하고 조회 및 수정/삭제하는 프로그램
        Scanner sc = new Scanner(System.in);

        EmployeeService empsrv = EmployeeServiceImpl.getInstance();

        String menu = "";

        while(true) {
            empsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": empsrv.newEmployee();
                    break;
                case "2": empsrv.showEmployee();
                    break;
                case "3": empsrv.showOneEmployee();
                    break;
                case "4": empsrv.modifyEmployee();
                    break;
                case "5": empsrv.removeEmployee();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력했어요.");
            }//switch

        }//while

    }//main

} //public class EmployeeV1Main {
