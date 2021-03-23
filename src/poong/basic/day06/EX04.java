package poong.basic.day06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
//        //Q12 생년월일
//        // 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge)
//        // computeBirth()
//
//        // 변수 선언
//        int birthDate;
//        int birthYear;
//        int age;
//
//        // 생년월일 입력받음.
//        System.out.print("생년월일을 8자리로 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        birthDate = sc.nextInt();
//        System.out.println("입력값 : " + birthDate);
//        birthYear = (int) birthDate/10000;
//        System.out.println("생년 : " + birthYear);
//
//        // 나이계산 맡김.
//        age = computeBirth(birthYear);
//
//        // 나이 출력
//        System.out.println("나이는 " + age +"살입니다.");






        //Q16 잔돈계산
        //고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이 몇 개 필요한지 계산하는 것이다. (Charge)
        // computeChange()

        // 변수 선언

        // 잔돈총액 입력받음.
        System.out.print("잔돈 총액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        //잔돈총액
        int total = sc.nextInt();


        // 지폐계산 맡김.
        computeChange(total);




    } //main

    public static int computeBirth(int birthYear){
        int thisYear = 2021;
        int age = thisYear - birthYear + 1;
        return age;
    }



    public static void computeChange(int total) {

        int note50000; //5만원권
        int note10000; //1만원권
        int note5000; //5천원권
        int note1000; //1천원권
        int note500; //500원동전
        int note100; //100원동전
        int note50; //50원동전
        int note10; //10원동전

        System.out.println("입력값 : " + total);
        System.out.print("필요한 지폐는 ");

        if (total >= 50000) {
                note50000 = (int) total % 50000;
                System.out.print("5만원권 "+ note50000 +"장, "); }
            else if (total >= 10000) {
                note10000 = (int) total % 50000;
                System.out.print("5만원권 "+ note50000 +"장, ");

            }
    }
    }
