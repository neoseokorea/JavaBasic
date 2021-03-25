package poong.basic.day08;

public class Inheritance {
    public static void main(String[] args) {
        /*
            상속

            객체지향 3대 개념의 하나.
            기존의 클래스에 기능을 추가하거나 재정의해서 새로운 클래스를 만드는 것을 의미.

            상속을 이용하면 기존에 만들어둔 클래스의 모든 필드와 메서드를 이용해서
            새로운 클래스를 편리하게 만들 수 있다.

            상속의 장점)

            기존에 작성된 클래스를 재활용할 수 있다,
            클래스의 계층 구조를 파악하기 용이하다.
            소프트웨어 생산성이 향상된다.

            형식)
            class 클래스명 extends 부모클래스명 {}
         */

        Tiger2 t = new Tiger2();
        System.out.println(t.eyes);
        System.out.println(t.legs);
    }//main
}//class Inheritance

class Eagle {
     String eyes;
     String mouth;
     String wings;

    public void eat() {
        System.out.println("먹다");
    }

    public void sleep() {
        System.out.println("잠자다");
    }

    public void fly() {
        System.out.println("날다");
    }

} //class Eagle

class Tiger {
     String eyes;
     String mouth;
     String legs;

    public void eat() {
        System.out.println("먹다");
    }

    public void sleep() {
        System.out.println("잠자다");
    }

    public void run() {
        System.out.println("달리다");
    }

} //class Tiger

class Goldfish {
     String eyes;
     String mouth;
     String fin;
    public void eat() {
        System.out.println("먹다");
    }
    public void swim() {
        System.out.println("헤엄치다");
    }
    public void sleep() {
        System.out.println("잠자다");
    }

} //class Goldfish

class Animal {
    String eyes;
    String mouth;
    public void eat() {
        System.out.println("먹다");
    }
    public void swim() {
        System.out.println("헤엄치다");
    }
}

class Eagle2 extends Animal {
    String wings;
    public void fly() {
        System.out.println("날다");
    }
}

class Tiger2 extends Animal {
    String legs;
    public void run() {
        System.out.println("달리다");
    }
}

class Goldfish2 extends Animal {
    String fin;
    public void fin() {
        System.out.println("헤엄치다");
    }
}



