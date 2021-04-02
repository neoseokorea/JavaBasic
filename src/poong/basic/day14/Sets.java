package poong.basic.day14;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        /*
            Set

            객체를 중복해서 저장할 수 없고,
            저장 순서가 유지되지 않음.
            (ArrayList나 Vector는 중복 저장 가능하고 저장 순서 유지됨.)
         */

        HashSet<String> names = new HashSet<>();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("혜교"); //중복데이터

        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("");

        HashSet<Integer> nums =
                new HashSet<>(Arrays.asList(10, 9, 8, 7, 6));

        for (Integer num : nums) {
            System.out.print(num + " "    );
        }
        System.out.println("");

        /*
            set에서 중복을 걸러내는 과정
            객체를 저장하기 전에 먼저 객체의 해시코드를 알아냄
            저장되어 있는 객체들의 해시코드를 비교해서
            같은 해시코드가 존재한다면 동일객체로 판단하여 저장하지 않음.

            객체의 해시코드를 알려면 hashcode를 사용
         */
        //babana, peach, apple 등을 set으로 저장
        HashSet<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("apple");

        for(String fruit : fruits) {
            System.out.print(fruit + " "); //"banana apple peach " (소팅 안됨)
            System.out.println(fruit.hashCode()); //"banana apple peach " (소팅 안됨)
        }

        System.out.println("");

        /*
            set에 저장된 요소들을 정렬하기
            set을 List로 변환한 후 정렬
         */
        List<String> fList = new ArrayList(fruits);
//        List<String> fList = new ArrayList<>(fruits); //이것도 가능하다
        Collections.sort(fList);
        for (String f : fList) {
            System.out.println(f + "/");
        }

        /*
            HashSEt의 개별요소 출력
            set에는 get메서드가 지원되지 않음.
            (원하는 데이터를 출력하려면 전체를 출력해야. for문 돌려서)
            단, contains를 이용해서 검색을 통한 개별값 출력은 가능.
         */
        System.out.println(names.contains("혜교"));

        /*
            HashSet의 개별요소 삭제
            remove, clear 지원
         */







    }//main
}
