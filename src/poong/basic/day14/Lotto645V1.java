package poong.basic.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto645V1 {
    public static void main(String[] args) {

        /*
        로또 645 프로그램 만들기ㅣ
        ArrayList를 이용해서 1~45사이 임의의 6개의 숫자 생성
        중복은 허용하지 않음.
        Random - nextInt, remove

        //중복값이 나오지 않을 때까지 뽑기를 계속 무한 반복 --> "복원 추출"
        // 복원 추출 -> 한 번 뽑은 것을 다시 뽑을 수 있음.

         */

        //뽑은 결과값을 저장할 동적 배열
        List<Integer> lottoSave = new ArrayList<>();

        //1~45 숫자를 동적배열 초기화
        List<Integer> nums45 = new ArrayList<>();
        for (int i = 1; i <= 45 ; ++i) {
            nums45.add(i);
        }

        //난수를 이용해서 총 여섯개의 숫자를 뽑음
        for (int i=1; i < 6; ++i) {
            Random rnd = new Random();
            int pick45 = rnd.nextInt(45-i);
            // 1~45의 숫자가 들어있는 배열의
            // 요소 위치값을 난수로 생성
            lottoSave.add(nums45.get(pick45));
            //위치값으로 숫자를 뽑아 동적배열에 저장
            nums45.remove(pick45);
            //뽑은 숫자는 배열에서 제거함.
        }

        //결과 출력
        for(Integer key:lottoSave) {
            System.out.println(key + " ");
        }

    }//main
}
