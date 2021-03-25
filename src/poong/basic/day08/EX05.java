package poong.basic.day08;

public class EX05 {
    public static void main(String[] args) {
        //Q73
        Fan f1 = new Fan();
            System.out.println(f1.speed);
            System.out.println(f1.on);
            System.out.println(f1.radius);
            System.out.println(f1.color);

        Fan f2 = new Fan();
            System.out.println(f2.speed);
            System.out.println(f2.on);
            System.out.println(f2.radius);
            System.out.println(f2.color);

        //시험값 지정
        Fan f3 = new Fan();
            f3.speed = f3.FAST; // speed = 3;
            f3.radius = 10;
            f3.color = "yellow";
            f3.on = true;
        //클래스를 통해 객체를 생성하고 객체의 멤버 변수에 값을 초기화 - 다소 번거로움

        Fan f4 = new Fan(2, false, 5, "blue");
        //매개변수 생성자를 이용하면 개체의 멤버변수에 값을 초기화하기가 편함.

        Account a1 = new Account(1122, 20000, 4.5, "2014-08-15 14:43:29");



    }//main

    static class Fan {

        final int SLOW = 1;         //상수 선언
        final int MEDIUM = 2;
        final int FAST = 3;
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan() {              //생성자, 멤버변수 초기화, F가 대문자인 것으로 클래스임을 알 수 있다.
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
        }//public Fan()

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        } //public Fan(int speed, boolean on, double radius, String color)

    } //------------------------------------------------------------ class Fan

    static class Account {
        private int aid; //계좌번호
        private int balance; //통장잔액
        private double interestRate; //이자율
        private String dateCreated; //통장개설날짜

        public Account() {        } // public Account()

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }// public Account(int aid, int balance, double interestRate, String dateCreated)

    }//---------------------------------------------- static class Account

    class Student {
        private int hakbun;
        private String name;
        private String addr;
        private String birth;
        private String dname;
        private int prof;
    } //------------------------------------------------------------------------------class Student

    class Subject {
        private int sno;
        private String sname; //과목명
        private String sdesc; //과목개요
        private String ssec;
    }//------------------------------------------------------------------------------class Subject

    class Professor {
        private int pno ; //교수번호
        private String name;
        private String field;
        private String tech;
    }//------------------------------------------------------------------------------class Subject

    class Major {
        private String mname;
        private String offpos;
        private String phone;
        private int chief; //학과장
    }//--------------------------------------------------------------------------------class Major

} //============================================================================================== class EX05
