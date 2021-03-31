package poong.basic.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        /*
            컬렉션 프레임워크

            다수의 데이터를 쉽고 효과적으로 처리할 수 있도록
            표준화된 방법을 제공하는 클래스의 집합
            즉, 데이터를 저장하는 자료구조와 데이터를 처리하는
            알고리즘을 구조화하여 클래스로 구현한 것.

         */

        /*
            주요 인터페이스
            List : 자료입력순서 중요O, 중복 요소 허용O
            Set : 자료입력순서 중요X, 중복 요소 허용X
            Map : 키와 값으로 구성된 자료 구조, 검색 속도가 빠름
         */

        /*
            arrayList
            List인터페이스를 구현한 클래스
            크기가 가변적으로 변하는 선형(순차) 리시트(동적 배열)
            즉, 리스트의 저장 용량이 꽉 차면 자동으로 용량이 늘어난다는 특징이 있음.
         */
        List<Integer> nums = new ArrayList<>();
        nums.add(123); // add : 데이터 추가 메서드
        nums.add(456); //
        nums.add(789); //
        nums.add(1, 000); // 특정위치 뒤에 요소 추가. index는 0부터 시작

        System.out.println(nums.size());    //리스트의 크기 출력 -> 4

        System.out.println(nums.get(1) ); // get : 지정한 위치의 요소를 추출 -> 0

        //리스트의 모든 요소 출력 1
        for( int i = 0; i < nums.size(); ++i)
            System.out.print(nums.get(i) + " / "); // 123,0,456,789
        System.out.println("");

        //리스트의 모든 요소 출력 2 ( 향상된 for문 - 추천하는 방법)
        //for (객체요소타입 변수명 : 객체명)
        for( Integer num : nums) {  //iterable //데이터를 계속 꺼내옴.
            System.out.print( num + "/");
        }
        System.out.println("");

        //리스트의 모든 요소 출력 3
        Iterator iter = nums.iterator();
        while(iter.hasNext())
            System.out.print(iter.next() + ";");
        System.out.println("");

        //리스트에서 요소 검색
        //contains(찾을 데이터), 결과는 true, false
        //indexOf(찾을 데이터), 결과는 위치값, -1(없을 경우)
        System.out.println(nums.contains(456)); // -> true
        System.out.println(nums.contains(987)); // -> false

        System.out.println(nums.indexOf(456)); // -> 2
        System.out.println(nums.indexOf(987)); // -> -1

        //회원 객체를 리스트로 저장
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("abc123","987xyz"));
        members.add(new Member("def456","xyz987"));
        members.add(new Member("ghi789","456wvu"));

        //회원 정보 출력
        for(Member member : members) {
            System.out.println(member); //toString()을 이용
        }
        System.out.println("");

//        //회원 정보 출력
//        for(Member member : members) {
//            System.out.println( member + "/"); //->주소가 출력됨..
//            System.out.print( member.userid + "/");
//            System.out.println( member.passwd + "");
//        }


        //def456 회원을 검색하려면?
//        System.out.println(members.contains("def456"));
        //비교대상을 잘못 지정함.
        //즉, member 객체의 멤버변수와 비교해야 됨.
        for (Member m : members) {
            if (m.userid.equals("def456")) {
                System.out.println("데이터 찾음!");
                break;
            }
        }

    }//main
}

class Member {
    String userid;
    String passwd;

    public Member(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        String fmt = "{userid : %s, passwd : %s}";
        String result = String.format(fmt, userid, passwd);
        return result;
    }
}