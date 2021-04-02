package poong.basic.day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto645V2 {
    public static void main(String[] args) {

        /*
        로또 645 프로그램 만들기ㅣ
        Set을 이용해서 1~45사이 임의의 6개의 숫자 생성
        중복은 허용하지 않음.
        Random - nextInt, while 사용
         */


//        Random rnd = new Random();

        Set<Integer> lotto = new HashSet<>();

        while(lotto.size() < 6) { // <=============================
            Random rnd = new Random();
            int key = rnd.nextInt(45) + 1;
            lotto.add(key);
        } //중복값이 나오지 않을 때까지 뽑기를 계속 무한 반복 --> "복원 추출"
        // 복원 추출 -> 한 번 뽑은 것을 다시 뽑을 수 있음.

        for(Integer k:lotto)
            System.out.print(k + " ");

//        for(Integer k:lotto)
//            System.out.println(k + " ");
//       중복 발생시 lotto 변수의 갯수가 하나씩 둘어듬.



    }//main
}



//        int count = 0;
//        int num_rnd = 0;
//        boolean match = false;
//
//        HashSet<Integer> numbers = new HashSet<>();
//
//
//        Random rnd = new Random();
//
//        while (count < 7) {
//
//            //난수 발생
//            num_rnd = rnd.nextInt(46);
//            System.out.println("난수 : " + num_rnd);
//
//            //비교해서 없으면 세트에 추가
//
//            System.out.print("세트 :");
//            for (Integer num1 : numbers) {
//                System.out.print(" " + num1);
//                if (num1 == num_rnd) {
//                    match = true;
//                    break;
//                } else {
//                    match = false;
//                }
//            }//for
//            System.out.println("");
//
//            if (!match) {
//              //같은 숫자 없었다면 세트에 추가하고 count 올림
//                System.out.println("난수를 세트에 추가합니다.");
//                numbers.add(num_rnd); //세트에 추가
//                count++;
//
//            } else {
//                //같은 숫자 있었다면 넘어감
//                System.out.println("넘어갑니다");
//            }
//
//
//        }//while
//
//
//        System.out.print("결과 출력 : ");
//        for (Integer num1 : numbers) {
//            System.out.print(num1 + " ");
//        }


