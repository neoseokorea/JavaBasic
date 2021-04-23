package poong.basic.lab;

import java.util.Scanner;

public class EmployeeV2Main {

    public static void main(String[] args) {

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
