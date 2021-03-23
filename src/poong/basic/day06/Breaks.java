package poong.basic.day06;

import java.util.Random;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) 1 ~ 100까지 총합을 구해서 출력. 단, 총합이 500을 넘은 경우 실행을 중단

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
            if (sum > 500) {
            System.out.println(i);
            break; }
        }

        System.out.println("총합 : " + sum);




        // 주사위를 6이 나올 때까지 굴리고 6이 나올 때 굴린 횟수를 출력하고 프로그램을 중지한다. (교재106, 문제7)
        // Math.random()과 Break문을 사용

//        Random rnd = new Random();                                     // ★★★★★
        int dice;

        for (int i = 1; true; i++) {


            dice = (int)(Math.random()*6 + 1);                               // ★★★★★

            System.out.print(dice + " ");

            if (dice == 6) {
                System.out.println();
                System.out.println("주사위 횟수 : " + i);
                break; }
        }
        System.out.println();



    }//main
}
