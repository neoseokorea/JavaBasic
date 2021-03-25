package poong.basic.day07;

import java.util.Scanner;

public class EX04_teacher2 {
    public static void main(String[] args) {
        /*잔돈 계산하는 프로그램
          지불요구금액 : 54320원
          지불액 : 100,000원
          잔돈 : 45,680
         */

        //변수 선언하기
        int price, pay, change;
        int[] wons = new int[8];
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        String fmt = "사용요금은 %d,\n지불액은 %d일때 \n" +
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

        // 값 입력 받기
        System.out.print("사용요금은 : ");
        price = sc.nextInt();
        System.out.print("지불액은 : ");
        pay = sc.nextInt();

        // 잔돈 계산하기
        change = pay - price;                   // 67,890

        for(int i = 0; i < wons.length; ++i) {
            wons[i] = change / notes[i];
            change = change % notes[i];
        }

        // 결과 출력하기
        System.out.printf(fmt, price, pay, (pay - price), wons[0], wons[1], wons[2], wons[3], wons[4], wons[5], wons[6], wons[7]);



    }//main
}//class
