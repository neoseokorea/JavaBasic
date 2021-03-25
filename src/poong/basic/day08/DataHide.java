package poong.basic.day08;

import poong.basic.day07.B;

public class DataHide {
    public static void main(String[] args) {
        /*
            캡슐화capsulation
            사용자가 굳이 알 필요가 없는 정보는
            사용자로부터 숨겨야 한다는 개념.
            최소한의 정보만으로 프로그램을 쉽게 이해하고 사용할 수 있음.

            <접근 지정자>
            클래스와 멤버변수, 메서드 선언시
            정보 은닉의 정보를 부여할 수 있음.

            (자바의 4가지 접근 지정자)
            private > default > protected > public

         */

        A one = new A();            // 동일 패키지내 클래스
        System.out.println(one.c); //public 변수
        System.out.println(one.a); //default 변수
        //System.out.println(one.b); //default 변수

        B two = new B();            // 타 패키지내 클래스
//        System.out.println(two.d);  // default : 다른패키지
//        System.out.println(two.e);  // private
        System.out.println(two.f);  // public 아무데서나 가능.





    }//main


}//================================================================================public class DataHide

class A {

    int a;              // default 접근지정
    private int b;      // private 접근지정
    public int c;           // public 접근지정

} //===============================================================================/class A

