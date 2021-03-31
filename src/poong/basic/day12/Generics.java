package poong.basic.day12;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        /*
            제네릭Generic

            다양한 데이터 타입의 객체를 다루는 메서드나
            컬렉션 클래스에 컴파일할 때 자료형 검사를 해주는 기능

           즉, 클래스에 사용할 타입의 정보를 동적으로 넘겨줄 수 있고
            실행할 때 발생할 수 있는 타입간 오류를
            컴파일 할 때 발견할 수 있도록 해주는 기능
            JDK 1.5부터 지원하는 기능임.
         */


        /*
            야생동물 3마리를 동물원에 가둔다.

         */
         Lion lion1 = new Lion();
         Tiger tiger1 = new Tiger();
         Zebra zebra1 = new Zebra();

         //Object형으로 배열을 선언하면 어떤 데이터타입의 객체든지
        //모두 저장이 가능하다.
         Object[] zoo1 = new Object[3];
         zoo1[0] = lion1;
         zoo1[1] = tiger1;
         zoo1[2] = zebra1;

         //단, 배열에서 객체를 빼낼 때는 그 데이터 타입에 맞는
        //적절한 형변환이 필요함.
        ((Lion) zoo1[0]).sayName();
        ((Tiger) zoo1[1]).sayName();
        ((Zebra) zoo1[2]).sayName();

        //Object 배열에 정수를 저장해보기
        Object[] numbers = new Object[5];
        numbers[0] = 123;
        numbers[1] = 456;
        numbers[2] = 789;

        //적절한 형변환을 통해 연산이 잘 수행됨.
        System.out.println(
                (int)numbers[0] + (int)numbers[1] + (int)numbers[2]
        );

        //이번에는 object 배열에 문자열을 저장해 본다.
        Object[] numbers1 = new Object[5];
        numbers1[0] = "123";
        numbers1[1] = "456";
        numbers1[2] = "789";

        //적절한 형변환을 통해 연산이 잘 수행될까?
//        System.out.println(
//                (int)numbers1[0] + (int)numbers1[1] + (int)numbers1[2]
//        );
        // 오류가 발생한다. -> 비정상 형변환이 원인. 그런데 컴파일할 때는 오류 없었지.

//        System.out.println( Integer.parseInt(numbers1[0]) +
//                Integer.parseInt(numbers1[1]) +
//                Integer.parseInt(numbers1[2]) )
//        );
        // 오류가 발생한다. -> 비정상 형변환이 원인. 그런데 컴파일할 때는 오류 없었지.

        /*
            JDK1.5 이전에서는 여러 타입을 사용하는 대부분의 클래스나
            메서드에서 인수가 반환값으로 Object 타입을 사용했었음.
            이런 경우, 변환된 Object 객체를 다시 원하는 타입으로 변환해야 하고
            운이 나쁜 경우, 실행시 오류가 발생할 수 있음.
         */

//        Object[] numbers3 = new Object[5];
//        numbers3[0] = 123;
//        numbers3[1] = "456";
//        numbers3[2] = 789;
//
//        System.out.println(
//                (int)numbers3[0] +
//                (int)numbers3[1] +
//                (int)numbers3[2]
//        );


        /*
            JDK1.5에서 도입한 제네릭을 활용하면
            컴파일 때 타입이 정해지므로
            타입 검사나 타입변환과 같은 번거로움이 사라짐.
            <>기호 안에 타입변수를 지정해서 사용


         */

        // 야생동물 3마리를 동물원에 가둡시다.
//        Object[] zoo2 = new Object[5];
        ArrayList<Lion> zoo2 = new ArrayList<>();
        ArrayList<Tiger> zoo3 = new ArrayList<>();
        ArrayList<Zebra> zoo4 = new ArrayList<>();

        zoo2.add(new Lion());
        //zoo2.add(new Tiger());
        //컴파일할 때 타입체크 가능
        // - zoo2에는 tiger 객체를 추가 못함.

        Lion l = zoo2.get(0);
        zoo2.get(0).sayName();
        // 동적배열에서 객체를 추출할 때도 객체 변환이 필요 없음.


        // 동적 배열에 정수/문자열 저장해보기
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(456);
        nums1.add(789);
        System.out.println( nums1.get(0)
                + nums1.get(1) + nums1.get(2) );


        ArrayList<String> nums2 = new ArrayList<>();
        nums2.add("123");
        nums2.add("456");
        nums2.add("789");
        //nums2.add(789); //오류발생
//        System.out.println( (int)nums2.get(0)
//                + (int)nums2.get(1) + (int)nums2.get(2) );
        //컴파일 할 때 타입검사를 해서 오류를 바로 알려줌.

        System.out.println( Integer.parseInt( nums2.get(0) )
                + Integer.parseInt( nums2.get(1) )
                + Integer.parseInt( nums2.get(2) ) );



    }//main
}

class Lion {

    public void sayName() {
        System.out.println("저는 사자입니다.");
    }
}

class Tiger {
    public void sayName() {
        System.out.println("저는 호랑이입니다.");
    }
}

class Zebra {
    public void sayName() {
        System.out.println("저는 얼룩말입니다.");
    }
}
