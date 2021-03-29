package poong.basic.day10;

public class Singleton { // 싱글톤을 연습하는 클래스

    /*
        싱글톤 클래스 :
            어떤 클래스가 최초 한번만 메모리에 생성되고
            그 메모리에 객체로 만들어 사용하는 디자인 패턴
            생성자의 호출이 반복적으로 이루어져도
            최초 생성된 객체를 반환해 줌.

            하나의 객체만 재사용하므로 메모리 낭비를 방지.

            방법:
                private 생성자
                static 변수 사용,
                객체에 대한 getter 정의



     */
    public static void main(String[] args) {
        ServiceOne so1 = new ServiceOne();
        so1.name = "첫번째";
        ServiceOne so2 = new ServiceOne();
        so2.name = "두번째";

        System.out.println(so1.name + "/" + so2.name);
        //so1과 so2의 name 변수 값은 서로 다름.

//      ServiceTwo sw1 = new ServiceTwo()
        // private 생성자이므로 new 키워드로 객체 생성이 불가능.
        ServiceTwo sw1 = ServiceTwo.getInstance();
        sw1.name = "첫번째";
        System.out.println(sw1.name); //"첫번째"

        ServiceTwo sw2 = ServiceTwo.getInstance();
        System.out.println(sw1.name); //"첫번째"

    }
}


class ServiceOne { //보통 클래스
    String name;
    public ServiceOne() {

    }
}


class ServiceTwo {                      // private 접근지정자로 싱글톤을 생성한다.
    private static ServiceTwo stwo;     // 객체 변수 생성

    String name;

    private ServiceTwo() {              // 생성자
    }

    public static ServiceTwo getInstance(){ //static 누락 없게 주의!!
        if (stwo == null) stwo = new ServiceTwo();
        return stwo;
    }
}