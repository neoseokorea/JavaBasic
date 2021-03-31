package poong.basic.day11;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {

        /*
            25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)

                가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
                나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
                다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
                라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력
         */

        //변수 선언
        int[] num1 = new int[3];        //숫자3개
        int[] num2 = new int[3];        //임의의 숫자 3개
        boolean match;        //일치여부 판결 boolean
        String msg;        //축하메시지열

        //복권 숫자를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<3 ; ++i) {
            System.out.print(i+1);
            System.out.print(" 번째 숫자를 입력하세요 : ");
            num1[i] = sc.nextInt();
        }

        //입력 받은 복권 숫자를 확인 출력.
        for (int i=0 ; i<3 ; ++i) {
            System.out.println((i+1) + " 번째 숫자 : " + num1[i]) ;
        }


        //임의의 복권 숫자를 생성한다.

        //숫자 일치 여부를 확인한다.

            //일치하면 상품 지급
            //불일치하면 아쉽다 메시지.


    }
}
