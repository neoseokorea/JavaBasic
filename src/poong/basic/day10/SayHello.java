package poong.basic.day10;

public class SayHello {
    //다국어(한글, 영어, 일본어)로 인사하는 프로그램이다.

    public static void main(String[] args) {

        SayHelloKor say1 = new SayHelloKor();
        say1.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJpn say3 = new SayHelloJpn();
        say3.sayHello();

        //다형성을 이용해서 인삿말을 세련되게 하기.
        //동적 바인딩을 이용해서 하나의 배열변수에
        //Korean, English, Japanese 을 저장한다.
        SayingHello[] sayings = new SayingHello[3];

        sayings[0] = new SayKorean();
        sayings[1] = new SayEnglish();
        sayings[2] = new SayJapan();

        System.out.println("----------다형성을 이용한 재출력--------");

        for (int i=0; i<sayings.length; ++i){
            sayings[i].hello();}


        System.out.println("----------다형성(인터페이스)을 이용한 재출력--------");
        SayHelloService say = new SayHelloKor();
        say.sayHello();

        say = new SayHelloEng();
        say.sayHello();

        say = new SayHelloJpn();
        say.sayHello();

    }//main

}//public class SayHello {





interface SayHelloService {
    void sayHello();
}




class SayHelloKor implements SayHelloService{
    @Override
    public void sayHello() {
    //클래스의 이름은 각각 다르지만 메서드 이름은 같다.
        System.out.println("안녕하세요, 자바8!");
    }
}//class SayHelloKor {

class SayHelloEng implements SayHelloService {
    //클래스의 이름은 각각 다르지만 메서드 이름은 같다.
    @Override
    public void sayHello() {
        System.out.println("Hello, Java8!");
    }
}//class SayHelloEng {

class SayHelloJpn implements SayHelloService {
    //클래스의 이름은 각각 다르지만 메서드 이름은 같다.
    @Override
    public void sayHello() {
        System.out.println("こんにちは、Java8!");
    }
}//class SayHelloKor {










class SayingHello {
    public void hello() {
        System.out.println("인사를 합니다.");
    }
}



class SayKorean extends SayingHello {
    @Override
    public void hello() {
        System.out.println("Hello, Java8!");
    }
}

class SayEnglish extends SayingHello {
    @Override
    public void hello() {
        System.out.println("Hello, Java8!");
    }
}

class SayJapan extends SayingHello {
    @Override
    public void hello() {
        System.out.println("こんにちは、Java8!");
    }
}
