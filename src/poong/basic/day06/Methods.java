package poong.basic.day06;

public class Methods {
    public static void main(String[] args) {
        // 메서드는 어떤 특정 작업을 수행하기 위한 코드들의 집합으로 함수와 비슷하다.
        //
        // 장점
        // 1. 중복되는 코드들의 반복적인 사용을 피할 수 있음.
        // 2. 모듈화를 통해 프로그램의 이해도 증가.
        // 3. 코드의 문제발생 또는 기능 변경시에 손쉽게 유지보수 가능.
        //
        // 메서드 형식
        // 접근지정자 반환타입 메서드명(매개변수목록) {
        //     메서드 몸체
        //     return 변수
        // }
        //
        // 접근 지정자 : 메서드 접근 허용 범위 여부(public, private)
        // 반환 타입 : 메서드 실행 후 반환하는 자료의 타입 지정
        //            반화 타입이 없는 경우 void로 정의
        // 매개변수목록 : 메서드 호출시 전달하는 변수 지정

        // 메서드 호출
        //      매서드 명();
        //      메서드명(매개변수값);



        // ex) 1~10 사이 난수 생성 V1
        for(int i = 1; i <= 10; ++i) {
            int magic = (int) (Math.random() * 10) + 1;
            System.out.print(magic + " ");

        } //for
        System.out.println();



        // ex) 1~10 사이 난수 생성 V1
        for(int i = 1; i <= 10; ++i) {
            make_magic();
        }




        // 인사말 출력 v1
        System.out.println("Hello, World!!");


        // 인사말 출력 v2
        sayHello();



        // 인사말 출력 v2
        sayHello2();


        // 인사말 출력 v3
        // 인사말 대상을 변수화
        sayHello3("World");
        sayHello3("Java");

        // 인사말 출력 v4
        // 반환타입이 있는 메서드
        String say = sayHello4("Python");
        System.out.println(say);



    }//main


    // 1~10 사이 임의의 난수를 출력하는 메서드
    public static void make_magic() {
        int magic = (int) (Math.random() * 10) + 1;
        System.out.print(magic + " ");
    }



    public static void sayHello() {
        System.out.println("Hello, World!!");
    }



    public static void sayHello2() {
        System.out.println("Hello, Java!!");
    }



    public static void sayHello3(String msg) {
        System.out.println("Hello, " + msg + "!!");
    }



    /* 간단한 인삿말을 합성하는 메서드 */
    public static String sayHello4(String msg) {
        String say = "Hello, " + msg + "!!";
        return say;
    }

} // class
