package poong.basic.day12;

import java.util.Random;
import java.util.Scanner;

public class EX06_teacher {
    public static void main(String[] args) {
                /*
            다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)

            하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
            한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
            일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.
         */

//        int = {1234567890, 98765, 12345};
        int data1 = 1234567890;
        System.out.println(1234567890 / 86400);
        System.out.println(
                Math.round((double) 1234567890 / 86400)
        );

        int data2 = 98765;
        System.out.println( data2 / 3600);
        System.out.println( Math.round(      (double)data2 / 3600)     );

        int data3 = 12345;
        System.out.println( data3 / 60);
        System.out.println( Math.round(  (double)data3 / 60) );

        /*
            25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)

                가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
                나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
                다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
                라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력

                자리에 상관없이 숫자만 일치하면 됨.
         */

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int match = 0; //일치 여부

        System.out.print("복권 3자리 숫자를 입력 하세요 : ");
        int yourkey = sc.nextInt();

        int lottokey = rnd.nextInt(1000);

        // 입력값과 난수 비교
//        char lkey1 = String.valueOf(lottokey).charAt(0);
//        char lkey2 = String.valueOf(lottokey).charAt(1);
//        char lkey3 = String.valueOf(lottokey).charAt(2);
//
//        char ykey1 = String.valueOf(yourkey).charAt(0);
//        char ykey2 = String.valueOf(yourkey).charAt(1);
//        char ykey3 = String.valueOf(yourkey).charAt(2);
//
//        if ( lkey1 == ykey2 ||
//                lkey1 == ykey2 || lkey1 == ykey3)
//            ++match;
//
//        if ( lkey2 == ykey2 ||
//                lkey2 == ykey2 || lkey2 == ykey3)
//            ++match;
//
//        if ( lkey3 == ykey1 ||
//                lkey3 == ykey2 || lkey3 == ykey3)
//            ++match;

        for ( int i = 0 ; i < 3 ; ++i ) {
            char lkey = String.valueOf(lottokey).charAt(i);

            for (int j = 0; j < 3 ; ++j) {
                char ykey = String.valueOf(yourkey).charAt(j);
                if (lkey == ykey) ++match;
            }
//            if (lkey3 == ykey1 ||)
        }

        System.out.println(yourkey + "/" + lottokey);
        System.out.println("일치갯수 : " + match);


    }//main

}
