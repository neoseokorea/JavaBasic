package poong.basic.day09;

public class AbstractClass {
    public static void main(String[] args) {
        /*
            추상클래스 : 추상 메서드를 포함한 클래스.

            추상 메서드 : 불완전 메서드를 의미.
                메서드 선언부만 존재하고 몸체는 없음.
                불완전 메서

            상속관계에 있는 자식클래스가
            부모클래스에 정의해 둔 메서드를 사용하지 않고
            재정의해서 사용하는 경우를 오버라이딩이라 했음.
            이처럼, 부모클래스의 메서드가 필요없다면
            메서드를 완전하게 정의하지 않고
            형태만 만들어놓고 자식클래스들이 내용을 채우도록 하면 어떨까?

         */
    } // main
} //public class AbstractClass

abstract class Animal2 {
    protected String name;
    abstract public void cry();

}//abstract class Animal2

class Cat2 extends Animal2 {

    // 빨간 줄에서 alt enter 눌러서 메서드 구현
    @Override
    public void cry() {
        System.out.println("야옹~");
    }
}//class Cat2 extends Animal2

class Dog2 extends Animal2 {

    // 빨간 줄에서 alt enter 눌러서 메서드 구현
    @Override
    public void cry() {
        System.out.println("멍~");
    }
}