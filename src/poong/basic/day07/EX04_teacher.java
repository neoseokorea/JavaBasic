package poong.basic.day07;

import java.util.Scanner;

public class EX04_teacher {
    public static void main(String[] args) {
        /*잔돈 계산하는 프로그램
          지불요구금액 : 54320원
          지불액 : 100,000원
          잔돈 : 45,680
         */

        //변수선언
        int price, pay, change;
        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;
        String fmt = "사용요금은 %d,\n 지불액은 %d일때 \n" +
                "잔돈은 %d입니다. \n\n" +
                "50,000원권은 %d장 \n" +
                "10,000원권은 %d장 \n" +
                "5,000원권은 %d장 \n" +
                "1,000원권은 %d장 \n" +
                "500원 동전은 %d개 \n" +
                "100원 동전은 %d개 \n" +
                "50원 동전은 %d개 \n" +
                "10원 동전은 %d개 \n" ;

        Scanner sc = new Scanner(System.in);

        System.out.print("사용요금은 : ");
        price = sc.nextInt();
        System.out.print("지불액은 : ");
        pay = sc.nextInt();

        // 잔돈 계산
        change = pay - price;                   // 67,890

        w50000 = change / 50000;                // 50,000원 1장
        //change = change - (50000 * w50000);
        change = change % 50000;

        w10000 = change / 10000;
//        change = change - (10000 * w10000);
        change = change % 10000;

        w5000 = change / 5000;
//        change = change - (5000 * w5000);
        change = change % 5000;

        w1000 = change / 1000;
//        change = change - (1000 * w1000);
        change = change % 1000;

        w500 = change / 500;
//        change = change - (500 * w500);
        change = change % 500;

        w100 = change / 100;
//        change = change - (100 * w100);
        change = change % 100;

        w50 = change / 50;
//        change = change - (50 * w50);
        change = change % 50;

        w10 = change / 10;
//        change = change - 10 * w10;
        change = change % 10;

        System.out.printf(fmt, price, pay, (pay - price), w50000, w10000, w5000, w1000, w500, w100, w50, w10);


    }//main
}//class
