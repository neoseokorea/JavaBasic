package poong.basic.day12;

import java.util.Scanner;

public class Test0331 {
    public static void main(String[] args) {

        //변수 선언
        int num1, num2, num3, sum;

        //입력 받기
        Scanner sc = new Scanner(System.in);

//        num1 = 2;
//        num2 = 5;

        System.out.println("첫번째 수는 : ");
        num1 = sc.nextInt();
        System.out.println("두번째 수는 : ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            num3 = num1; // num1 2000을 num3에 넣음
            num1 = num2; // num2 1000을 num1에 넣음.
            num2 = num3; // num3 2000을 num2에 넣음.
        }

        //총합 구하기

        sum = 0;
        for ( int i = num1 ; i  <= num2 ; ++i) {
            sum += i;
        }

        //결과 출력
        System.out.println(num1 + " 부터 "+ num2 +" 사이의 수의 합은 " + sum + "입니다.");

    }
}
