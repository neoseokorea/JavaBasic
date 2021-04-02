package poong.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

        /*
            두 수를 입력받아 두 사이의 모든 값의 총합을 구하는 코드를 작성하세요.
            ex) 10, 3 => 3,4,5,6,7,8,9,10
            ex) 3, 10 => 3,4,5,6,7,8,9,10
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자는? ");
        int num1 = sc.nextInt(); // 1
        System.out.print("두번째 숫자는? ");
        int num2 = sc.nextInt(); // 10

//        num1 < num2 인 경우
//        int sum = 0;
//        for (int i=num1; i<= num2;++i )
//            sum += i;
//
//        String fmt = "%d와 %d 사이의 합은 %d";
//        System.out.printf(fmt, num1, num2, sum);

        //num1 > num2 인 경우

//        int sum = 0;
//        for (int i=num2; i<= num1;++i )
//            sum += i;
//
//        String fmt = "%d와 %d 사이의 합은 %d";
//        System.out.printf(fmt, num2, num1, sum);

        int begin = num1;
        int end = num2;
        if (num1 > num2) {
            begin = num2; end = num1;
        }

        int sum = 0;
        for (int i = begin; i <= end ; ++i)
            sum += i;

        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, num1, num2, sum);
        System.out.println();


        /*
            가오스 덧셈을 이용하면 간단히 계산 가능
            b > a 일때
            (a + b) * (b - a + 1)
         */
        sum = (  (begin + end) * (end - begin + 1 )  )/2; // end > begin
        fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, begin, end, sum);

    }//main
}
