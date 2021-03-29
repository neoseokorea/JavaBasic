package poong.basic.day10;

public class Polymoph {

    public static void main(String[] args) {

        /*
            클래스/인터페이스 간의 type 변환
            캐스팅이란 형변환을 의미한다.
            기본 자료형에서는 데이터의 크기에 따라 변환 가능하다.
            정수와 정수 연산 => 정수
            정수와 실수 연산 => 실수(자동 형변환)

            상속관계에 있는 부모/자식 클래스/인터페이스간에
            서로 형변환이 가능
            이런 형 변환을 업캐스팅/다운캐스팅이라 한다.
            자식클래스의 타입이 부모클래스의 타입으로 바뀌는 것을 업 캐스팅이라고 하고
            부모클래스의 타입이 자식클래스의 타입으로 바뀌는 것을 다운캐스팅이라 한다.

            draw 메서드 호출시 각각의 클래스 타입을 사용
         */

        Line l = new Line();
        l.draw();

        Circle c = new Circle();
        c.draw();

        TriAngle t = new TriAngle();
        t.draw();

        //paint메서드를 구현해서 draw 호출을 수월하게 바꿔본다.
        //위에서 두 줄로 쓴 걸 한 줄로 씀.
        //여전히 draw 메서드 호출시에도 동일한 클래스 타입을 사용해야 함.
        //새로운 도형이 추가되면 paint메서도도 추가되어야 하는 불편이 있다.
        paint(new Line());
        paint(new Circle());
        paint(new TriAngle());

        //동적 바인딩을 이용한 paint2 메서드를 사용한다.
        //  자동 업캐스팅으로 코드가 단순해짐
        paint2(  new Line()  );
        paint2(  new Circle()  );
        paint2(  new TriAngle()  );

        //배열 변수에 각 도형 저장해보기
        //도형에 맞게 변수를 개별적으로 선언해야 함.
        Line[] lines = new Line[3];
        Circle[] circles = new Circle[3];
        TriAngle[] triAngles = new TriAngle[3];

        lines[0] = new Line();
        lines[0].draw();

        circles[0] = new Circle();
        circles[0].draw();

        triAngles[0] = new TriAngle();
        triAngles[0].draw();



        //동적 바인딩을 이용해서 하나의 배열변수에
        //Line, Circle, Triangle 을 저장한다.
        Shape[] shapes = new Shape[3]; //10개를 저장할 수 있는 저장소를 마련

        shapes[0] = new Line();         // 만들어진 객체값의 위치값이 shapes[0]에 저장된다.
        shapes[1] = new Circle();
        shapes[2] = new TriAngle();

        System.out.println("----------다형성을 이용한 재출력--------");

        for (int i=0; i<shapes.length; ++i){

            shapes[i].draw();}

        /*
            (동적) 바인딩binding

            프로그램에 사용된 구성요소의 실제 값 또는 "속성을 결정하는 행위"
            즉, 변수에 값이 저장될 때나, 함수 호출시 실제 함수가 위치한 메모리 상의 주소와 연결하는 것을 의미.

            바인딩에는 동적/정적 바인딩이 존재하는데,
            정적 바인딩은 컴파일 시 변수의 타입이나 함수의 위치가 결정됨.
                실행 전에 많은 정보들이 미리 결정되기 때문에 실행효율 증가
            반면, 동적 바인딩은 실행시 변수의 타입이나 함수의 위치가 결정
            실행시 새롭게 변수의 성격이 바뀌므로 적응성 증가
         */


    }//main


    public static void paint(Line l) { l.draw();}           // 도형마다 매개변수를 달리해서 메서드를 만들어 줘야 함.
    public static void paint(Circle c) { c.draw();}         // 도형마다 매개변수를 달리해서 메서드를 만들어 줘야 함.
    public static void paint(TriAngle t) { t.draw();}       // 도형마다 매개변수를 달리해서 메서드를 만들어 줘야 함.

    //동적 바인딩을 이용한다.
    public static void paint2(Shape s) { s.draw();} //부모 클래스를 이용한 동적 바인딩


}





class Shape {
    public void draw() {
        System.out.println("도형을 그립니다.");
    }
}



class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("선을 그립니다.");
    }
}

class TriAngle extends Shape {
    @Override
    public void draw() {
        System.out.println("삼각형을 그립니다.");
    }
}
