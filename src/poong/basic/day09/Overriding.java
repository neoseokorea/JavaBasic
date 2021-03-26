package poong.basic.day09;

public class Overriding {
    public static void main(String[] args) {
        /*
            오버라이딩(메서드 재정의;override)

            객체지향 3대 개념 중 다형성에 해당.
            상속 관계에 있는 상위클래스의 메서드를 하위클래스에서 같은 이름의 메서드를 다시 작성하는 것을 의미.
            즉, 상속받은 메서드를 재정의해서 사용하는 것을 의미한다.
         */

        Cat c = new Cat();
        System.out.println(c.cry());

        Dog dog = new Dog();
        System.out.println(dog.cry());

    }//main

}//public class Overriding

class Animal {
    public String eat() { return "동물이 먹습니다.";}
    public String cry() { return "동물이 웁니다.";}
}

class Cat extends Animal {
    @Override //ctrl space를 누르면 나타남.
    public String cry() {
        return "야옹~ 야옹~";
    }
}

class Dog extends Animal {
    @Override
    public String cry() {
        return "멍멍";
    }
}
