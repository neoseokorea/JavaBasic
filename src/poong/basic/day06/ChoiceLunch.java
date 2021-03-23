package poong.basic.day06;

import java.sql.SQLOutput;
import java.util.Random;

public class ChoiceLunch {
    public static void main(String[] args) {
        // 배열을 이용한 점심 메뉴 고르기
        String[] menu = {"김밥", "라면", "돈까스", "우동", "짜장면", "햄버거", "짬뽕"};
        //점심메뉴를 배열로 정의

        Random rnd = new Random();                                     // ★★★★★

        int idx = rnd.nextInt(7);                               // ★★★★★
        //난수 생성
        //메뉴는 7개이므로 idex 변수의 범위는 0 ~ 6

        //Math.random을 이용헤서 실제 난수가 만들어지는 원리를 알아봄.

        // 0 ~ 9 사이 임의의 난수 생성
        double magic = Math.random();
        System.out.println(magic);
        System.out.println(magic * 10); // 난수가 1이 나오는 일은 없다.
        System.out.println((int)(magic * 10));

        // 0 ~ 99 사이 임의의 난수 생성
        double magic2 = Math.random();
        System.out.println(magic2);
        System.out.println(magic2 * 100);
        System.out.println((int)(magic2 * 100));

        // 0 ~ (n-1) 사이 임의의 난수 생성 : random * n
        double magic3 = Math.random();
        System.out.println(
                "0 ~ 100 사이 난수 : " +
                (int)(magic3 * 100)
        );

        // a ~ b 범위 난수 : (random * (최대값 - 최소값)) + 최소값
        // 50 ~ 100범위 난수
        double magic4 = Math.random();
        System.out.println(
                "50 ~ 100 사이 난수 : " +
                (int)(
                        magic4 * (100 - 50)
                      )
                        + 1
        );



//        System.out.println(menu[idx]);
        //생성된 난수


    }
}
